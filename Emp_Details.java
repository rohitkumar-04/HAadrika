package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Emp_Details {

	static int idx = 3;
	public WebDriver driver;

	public Emp_Details(WebDriver driver) {
		this.driver = driver;

	}

	public void emp_details(WebDriver driver, String[] data) throws Exception {

		// Step 2
		System.out.println("Employee Details");
		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?emp=new&page=2");

		String t2 = driver
				.findElement(By.xpath(
						"//h2[@class='text-secondary text-mid_head font-medium flex items-center gap-2 undefined']"))
				.getText();
		System.out.println(t2);
		Assert.assertEquals("Employee Details", t2);

		// Upload Image
		System.out.println("Upload the Image");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement aui = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("emp_image")));
		aui.sendKeys(data[idx]);
		Thread.sleep(2000);

		// First name
		System.out.println("Enter the first name");
		driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys(data[idx+1]);
		Thread.sleep(3000);

		// Middle name
		System.out.println("Enter the middle name");
		driver.findElement(By.xpath("//input[@placeholder='Enter Middle Name']")).sendKeys(data[idx+2]);
		Thread.sleep(3000);

		// Last name
		System.out.println("Enter the Last name");
		driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys(data[idx+3]);
		Thread.sleep(3000);

		// Select dropdown Mode of Recruitment
		WebElement e_rec = driver.findElement(By.id("id_mode_of_recruitment"));
		System.out.println(e_rec.isSelected());
		System.out.println("Start Recruitment Dropdown Selection");
		Select srec = new Select(e_rec);
		srec.selectByVisibleText(data[idx+4]);
		Thread.sleep(3000);

		// Contact number
		System.out.println("Enter the Contact number");
		// String fsc = sc.nextLine(); // 9658745896
		driver.findElement(By.xpath("//input[@id='id_contact_no']")).sendKeys(data[idx+5]);
		Thread.sleep(3000);

		// Emergency Contact number*
		System.out.println("Enter the Emergency Contact number");
		// String fse = sc.nextLine(); // 6512284661
		driver.findElement(By.id("id_emg_contact_no")).sendKeys(data[idx+6]);
		Thread.sleep(3000);

		// Aadhar Card Number*
		System.out.println("Enter the Aadhar Card number");
		// String fsea = sc.nextLine();// 526389651478
		driver.findElement(By.id("id_aadhar_no")).sendKeys(data[idx+7]);
		Thread.sleep(3000);

		// Epic No*
		System.out.println("Enter the Epic number");
		// String fsep = sc.nextLine();// JHR2292878
		driver.findElement(By.id("id_epic_no")).sendKeys(data[idx+8]);
		Thread.sleep(3000);

		// Gender*
		WebElement gen = driver.findElement(By.id("id_gender"));
		System.out.println(gen.isSelected());
		System.out.println("Start gender Selection");
		String s = data[idx+9];
		Select gens = new Select(gen);
		System.out.println("Gender" + s);
		Thread.sleep(2000);
		gens.selectByValue(s);
		// gens.selectByVisibleText(s);
		Thread.sleep(3000);

		// PRAN data[13]
		System.out.println("Enter the PRAN number");
		driver.findElement(By.xpath("//input[@placeholder='Enter PRAN']")).sendKeys(data[idx+10]);
		Thread.sleep(3000);

		// Employee Type* data[14]
		WebElement emp = driver.findElement(By.id("id_emp_type"));
		System.out.println(gen.isSelected());
		System.out.println("Start Employee Type* Dropdown Selection");
		Select semp = new Select(emp);
		// semp.selectByVisibleText("Outsourced Employees");
		semp.selectByVisibleText(data[idx+11]);
		Thread.sleep(3000);

		// Weight data[15] System.out.println("Enter the Weight number");
		driver.findElement(By.id("id_weight")).sendKeys(data[idx+12]);
		Thread.sleep(3000);

		// Height data[16] System.out.println("Enter the Height number");
		driver.findElement(By.id("id_height")).sendKeys(data[idx+13]);
		Thread.sleep(3000);

		// CPS data[17]
		System.out.println("Enter the Height number");
		driver.findElement(By.id("id_cps")).sendKeys(data[idx+14]);
		Thread.sleep(3000);

		// GPF*
		System.out.println("Enter the GPF number");
		// String fseg = sc.nextLine(); // 674761234123
		WebElement gp = driver.findElement(By.id("id_gps"));
		gp.clear();
		gp.sendKeys(data[idx+15]);
		Thread.sleep(3000);

		// DOB* [Date picker]
		System.out.println("Enter the Date Of Birth");
		// String fsed = sc.nextLine();
		driver.findElement(By.id("id_dob")).sendKeys(data[idx+16]);
		Thread.sleep(3000);

		// PAN no.
		System.out.println("Enter the PAN Number");
		// String fsed = sc.nextLine();
		driver.findElement(By.id("id_pan_no")).sendKeys(data[idx+17]);
		Thread.sleep(3000);

		// Email
		System.out.println("Enter the Email Address");
		// String fsed = sc.nextLine();
		driver.findElement(By.id("id_email")).sendKeys(data[idx+18]);
		Thread.sleep(3000);

	}

}
