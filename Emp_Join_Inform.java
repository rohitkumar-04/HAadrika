package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Emp_Join_Inform {
	public WebDriver driver;
	int idx = 105;

	public Emp_Join_Inform(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_join_inform(WebDriver driver, String[] data) throws Exception {
		// Step-6

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=6");

		Thread.sleep(3000);
		String t6 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Joining Information']")).getText();
		System.out.println(t6);
		Assert.assertEquals("Employee Joining Information", t6);

		// Department
		System.out.println("Enter Department");
		WebElement egd = driver.findElement(By.id("id_department_id"));
		System.out.println(egd.isSelected());
		Select segd = new Select(egd);
		segd.selectByVisibleText(data[idx]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Designation
		System.out.println("Enter Designation");
		WebElement egde = driver.findElement(By.id("id_designation_id"));
		System.out.println(egde.isSelected());
		Select segde = new Select(egde);
		segde.selectByVisibleText(data[idx + 1]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Class(1,2,3,4)
		System.out.println("Enter Class(1,2,3,4)");
		WebElement egc = driver.findElement(By.id("id_class"));
		System.out.println(egc.isSelected());
		Select segc = new Select(egc);
		segc.selectByVisibleText(data[idx + 2]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Whether Confirmation date
		// String inp = data[72], val = "Yes";
		System.out.println("Whether Confirmation date =");
		if ((data[idx + 3]).equalsIgnoreCase("Yes")) {
			System.out.println("Whether Confirmation date = " + data[idx + 3]);
			driver.findElement(
					By.xpath("//div[text()='Whether Confirmation Order']/following-sibling::div//input[@id='yes']"))
					.click();
			Thread.sleep(2000);

			// Date of Confirmation if Yes previous option
			System.out.println("Enter Date of Confirmation");
			driver.findElement(By.xpath("//input[@placeholder='Enter Date of Confirmation']")).sendKeys(data[idx + 4]);
			Thread.sleep(2000);

			// Confirmation Order Number
			System.out.println("Enter Confirmation Order Number ");
			driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Order Number']"))
					.sendKeys(data[idx + 5]);
			Thread.sleep(2000);

			// Confirmation Order Date
			System.out.println("Enter Confirmation Order Date");
			// String fsed = sc.nextLine();
			WebElement cd = driver.findElement(By.xpath("//input[@placeholder='Enter Confirmation Order Date']"));
			cd.clear();
			cd.sendKeys(data[idx + 6]);
			Thread.sleep(2000);

		} else {
			System.out.println("Whether Confirmation date = " + data[idx + 3]);
			driver.findElement(
					By.xpath("//div[text()='Whether Confirmation Order']/following-sibling::div//input[@id='no']"))
					.click();
			Thread.sleep(3000);
		}

		// Pay Scale
		System.out.println("Enter Pay Scale");
		WebElement eps = driver.findElement(By.id("id_pay_scale"));
		System.out.println(eps.isSelected());
		Select seps = new Select(eps);
		seps.selectByVisibleText(data[idx + 7]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Pay band
		System.out.println("Enter Pay Band value");
		driver.findElement(By.xpath("//input[@placeholder='Enter Pay Band']")).sendKeys(data[idx + 8]);
		Thread.sleep(2000);

		// Grade Pay
		System.out.println("Enter Grade Pay");
		WebElement egp = driver.findElement(By.id("id_grade_pay"));
		System.out.println(egp.isSelected());
		Select segp = new Select(egp);
		segp.selectByVisibleText(data[idx + 9]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Member of GIS or not

		// String inp1 = data[idx + 10], val1 = "Yes";
		// System.out.println("Whether Confirmation date =" + inp1);
		if ((data[idx + 10]).equalsIgnoreCase("Yes")) {
			System.out.println("Whether Member of GIS or not " + data[idx + 10]);
			driver.findElement(
					By.xpath("//div[text()='Member of GIS or not']/following-sibling::div//input[@id='yes']")).click();
			Thread.sleep(3000);

			// GIS Account No
			System.out.println("Enter GIS Account No");
			driver.findElement(By.xpath("//input[@placeholder='Enter GIS Account No.']")).sendKeys(data[idx + 11]); // id_gis_account
			Thread.sleep(2000);

		} else {

			System.out.println("Whether Member of GIS or not " + data[idx + 10]);
			driver.findElement(
					By.xpath("//div[text()='Whether Confirmation Order']/following-sibling::div//input[@id='no']"))
					.click();
			Thread.sleep(3000);
		}

		// Appointment Authority Dropdown
		System.out.println("Enter Appointment Authority");
		WebElement eaa = driver.findElement(By.id("id_appoint_authority"));
		System.out.println(eaa.isSelected());
		Select seaa = new Select(eaa);
		seaa.selectByVisibleText(data[idx + 12]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Whether deputed to ULB dropdown
		System.out.println("Enter Whether deputed to ULB");
		WebElement ead = driver.findElement(By.id("id_ulb"));
		System.out.println(ead.isSelected());
		Select sead = new Select(ead);
		sead.selectByVisibleText(data[idx + 13]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Last Increment Order No.
		System.out.println("Enter Increment Order No.");
		driver.findElement(By.xpath("//input[@placeholder='Enter Last Increment Order No.']")).sendKeys(data[idx + 14]);
		Thread.sleep(2000);

		// Name Of Service at the time of joining
		System.out.println("Enter Name Of Service at the time of joining");
		driver.findElement(By.xpath("//input[@placeholder='Enter Name Of Service at the time of joining']"))
				.sendKeys(data[idx + 15]);
		Thread.sleep(2000);

		// Last Increment order Date
		System.out.println("Enter Last Increment order Date");
		driver.findElement(By.xpath("//input[@placeholder='Enter Last Increment order Date']"))
				.sendKeys(data[idx + 16]);
		Thread.sleep(2000);

		// WEF date
		System.out.println("Enter WEF date");
		driver.findElement(By.id("id_wef_date")).sendKeys(data[idx + 17]);
		Thread.sleep(2000);

		// Employee fall under, Seniority in gradation list Dpdwn
		System.out.println("Enter Employee fall under, Seniority in gradation list");
		WebElement ees = driver.findElement(By.id("id_sen_grade_list"));
		System.out.println(ees.isSelected());
		Select sees = new Select(ees);
		sees.selectByVisibleText(data[idx + 18]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Task
		System.out.println("Enter Task");
		WebElement et = driver.findElement(By.id("id_task"));
		et.click();
		et.clear();
		et.sendKeys(data[idx + 19]);
		Thread.sleep(2000);
		System.out.println(data[idx+19]+"  = Check kro");

		// Date Of Joining
		/*
		 * System.out.println("Enter the date picker"); String dob = new
		 * SimpleDateFormat(data[61]).format(new Date()); // or any date
		 * driver.findElement(By.id("id_dob")).sendKeys(dob);
		 */

		System.out.println("Enter Date Of Joining");
		// String fsed = sc.nextLine();
		WebElement dj = driver.findElement(By.id("id_doj"));
		dj.clear();
		dj.sendKeys(data[idx + 20]);
		Thread.sleep(3000);

		// Effective Pay Commission (At the time of Joining)* Dpdwn
		System.out.println("Enter Effective Pay Commission (At the time of Joining)");
		WebElement eepc = driver.findElement(By.id("id_effective_pay_commision"));
		System.out.println(eepc.isSelected());
		Select seepc = new Select(eepc);
		int sf = Integer.parseInt(data[idx + 21]);
		// seepc.selectByVisibleText(data[idx + 21]);
		System.out.println("Convert to number ="+sf);
		seepc.selectByIndex(sf);
		//seepc.selectByValue(data[idx + 21]);
		Thread.sleep(3000);

		// Basic Pay*
		System.out.println("Enter Basic Pay");
		driver.findElement(By.xpath("//input[@placeholder='Enter Basic Pay']")).sendKeys(data[idx + 22]);
		Thread.sleep(2000);

		// Deduction Type dpdwn
		System.out.println("Enter Deduction Type)");
		WebElement eed = driver.findElement(By.id("id_deduction_type"));
		System.out.println(eed.isSelected());
		Select seed = new Select(eed);
		seed.selectByVisibleText(data[idx + 23]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Bank Name
		System.out.println("Enter Bank Name");
		driver.findElement(By.xpath("//input[@placeholder='Enter Bank Name']")).sendKeys(data[idx + 24]);
		Thread.sleep(2000);

		// Branch Name
		System.out.println("Enter Branch Name");
		driver.findElement(By.xpath("//input[@placeholder='Enter Branch Name']")).sendKeys(data[idx + 25]);
		Thread.sleep(2000);

		// PF Category
		System.out.println("Enter Deduction Type)");
		WebElement epf = driver.findElement(By.id("id_pf_category"));
		System.out.println(epf.isSelected());
		Select sepf = new Select(epf);
		sepf.selectByVisibleText(data[idx + 26]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Account Number
		System.out.println("Enter Account Number");
		driver.findElement(By.xpath("//input[@placeholder='Enter Account Number']")).sendKeys(data[idx + 27]);
		Thread.sleep(2000);
		
		//IFSC Code
		System.out.println("Enter IFSC Code");
		driver.findElement(By.xpath("//input[@placeholder='Enter IFSC Code']")).sendKeys(data[idx + 28]);
		Thread.sleep(2000);

	}

}
