package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Emp_Family_Details {
	public WebDriver driver;
	public static int in = 0;
	static int h = 0;
	public static int idx = 189;

	public Emp_Family_Details(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_Family_Details(WebDriver driver, String[] data) throws Exception {
		// Step-8
		 driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=8");

		String t8 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Family Details']")).getText();
		System.out.println(t8);
		Assert.assertEquals("Employee Family Details", t8);

		// Employee Family Details
		emp_fam_details(driver, data);
		check_de(driver, data);// Repeat
		Thread.sleep(2000);
		// del_button(driver, data);

		// Employee Nominee Details
		emp_nom_details(driver, data);
		check_dm(driver, data);// Repeat
		Thread.sleep(2000);
		// del_button(driver, data);

	}

	public void check_de(WebDriver driver, String[] data) throws Exception {
		int fe = add_end(driver, data);
		if (fe == 1) {
			emp_fam_details1(driver, data);
		}
		Thread.sleep(2000);
		int fe1 = add_end2(driver, data);
		if (fe1 == 2) {
			emp_fam_details2(driver, data);
		}
		Thread.sleep(2000);

	}

	public void emp_fam_details2(WebDriver driver, String[] data) throws Exception {
		// Family name
		System.out.println("Enter Family name");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Name'])[3]")).sendKeys(data[idx + 10]);
		Thread.sleep(3000);

		// Relation
		System.out.println("Enter Relation");
		driver.findElement(By.xpath("((//table[@class='table table-md mt-4'])[1]//input[@placeholder='Enter Relation'])[3]")).sendKeys(data[idx + 11]);
		Thread.sleep(3000);

		// D.O.B
		System.out.println("Enter Date Of Birth");
		// String fsed = sc.nextLine();
		WebElement edd = driver.findElement(By.xpath("(//input[@name='dob'])[3]"));
		edd.clear();
		edd.sendKeys(data[idx + 12]);
		Thread.sleep(3000);

		// Dependent
		String inp = data[idx + 13], val = "Yes";
		System.out.println("data minor is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Choose Dependent Status - Yes");
			driver.findElement(By.xpath("(//input[@value='Yes'])[3]")).click();
			Thread.sleep(3000);
		} else {
			System.out.println("Choose Dependent Status - No");
			driver.findElement(By.xpath("(//input[@value='No'])[3]")).click();
			Thread.sleep(3000);
		}

	}

	public int add_end2(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 9]);

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
			Thread.sleep(2000);
			in++;
			return in;
		}
		return in;
	}

	public void emp_fam_details1(WebDriver driver, String[] data) throws Exception {
		// Family name
		System.out.println("Enter Family name");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Name'])[2]")).sendKeys(data[idx + 5]);
		Thread.sleep(3000);

		// Relation
		System.out.println("Enter Relation");
		driver.findElement(
				By.xpath("((//table[@class='table table-md mt-4'])[1]//input[@placeholder='Enter Relation'])[2]"))
				.sendKeys(data[idx + 6]);
		Thread.sleep(3000);

		// D.O.B
		System.out.println("Enter Date Of Birth");
		// String fsed = sc.nextLine();
		WebElement edd = driver.findElement(By.xpath("(//input[@name='dob'])[2]"));
		edd.clear();
		edd.sendKeys(data[idx + 7]);
		Thread.sleep(3000);

		// Dependent
		String inp = data[idx + 8], val = "Yes";
		System.out.println("data minor is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Choose Dependent Status - Yes");
			driver.findElement(By.xpath("(//input[@value='Yes'])[2]")).click();
			Thread.sleep(3000);
		} else {
			System.out.println("Choose Dependent Status - No");
			driver.findElement(By.xpath("(//input[@value='No'])[2]")).click();
			Thread.sleep(3000);
		}

	}

	public void emp_fam_details(WebDriver driver, String[] data) throws Exception {

		// Family name
		System.out.println("Enter Family name");
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(data[idx]);
		Thread.sleep(3000);

		// Relation
		System.out.println("Enter Relation");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Relation'])[1]")).sendKeys(data[idx + 1]);
		Thread.sleep(3000);

		// D.O.B
		System.out.println("Enter Date Of Birth");
		// String fsed = sc.nextLine();
		WebElement edd = driver.findElement(By.xpath("//input[@name='dob']"));
		edd.clear();
		edd.sendKeys(data[idx + 2]);
		Thread.sleep(3000);

		// Dependent
		String inp = data[idx + 3], val = "Yes";
		System.out.println("data minor is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Choose Dependent Status - Yes");
			driver.findElement(By.xpath("(//input[@value='Yes'])[1]")).click();
			Thread.sleep(3000);
		} else {
			System.out.println("Choose Dependent Status - No");
			driver.findElement(By.xpath("(//input[@value='No'])[1]")).click();
			Thread.sleep(3000);
		}

	}

	public void emp_nom_details(WebDriver driver, String[] data) throws Exception {

		// Nominee name
		System.out.println("Enter Nominee name");
		driver.findElement(By.xpath("//input[@placeholder='Enter Nominee Name']")).sendKeys(data[idx + 14]);
		Thread.sleep(3000);

		// Relation
		System.out.println("Enter Relation");
		driver.findElement(By.xpath("(//table[@class='table table-md mt-4'])[2]//input[@placeholder='Enter Relation']"))
				.sendKeys(data[idx + 15]);
		Thread.sleep(3000);

		// Percentage
		System.out.println("Enter Percentage");
		WebElement ep = driver.findElement(By.xpath("//input[@placeholder='Enter Percentage']"));
		ep.clear();
		Thread.sleep(1000);
		ep.sendKeys(data[idx + 16]);
		Thread.sleep(3000);

		// Address
		System.out.println("Enter Address");
		WebElement ea = driver.findElement(By.xpath("//input[@placeholder='Enter Address']"));
		ea.clear();
		Thread.sleep(1000);
		ea.sendKeys(data[idx + 17]);
		Thread.sleep(3000);

		// Minor
		String inp = data[idx + 18], val = "Yes";
		System.out.println("data minor is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Choose Minor Status");
			driver.findElement(By.xpath(
					"(//tbody/tr[@class=' text-secondary border-b border-zinc-300']//div[@class='flex flex-col gap-3 pl-5 items-start']/../../..)[2]//input[@value='Yes']"))
					.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Choose Minor Status");
			driver.findElement(By.xpath(
					"(//tbody/tr[@class=' text-secondary border-b border-zinc-300']//div[@class='flex flex-col gap-3 pl-5 items-start']/../../..)[2]//input[@value='No']"))
					.click();
			Thread.sleep(3000);
		}
		// tbody/tr[@class=' text-secondary border-b
		// border-zinc-300']/td[6]/div[1]/div[1]/input[1]
	}

	public void check_dm(WebDriver driver, String[] data) throws Exception {

		int fe = add_Nend(driver, data);
		if (fe == 1) {
			emp_nom_details1(driver, data);
		}
		Thread.sleep(2000);
	/*	int fe1 = add_end(driver, data);
		if (fe1 == 2) {
			emp_nom_details(driver, data);
		}
		Thread.sleep(2000);*/

	}

	public void emp_nom_details1(WebDriver driver2, String[] data) throws Exception {

		// Nominee name
		System.out.println("Enter Nominee name");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Nominee Name'])[2]")).sendKeys(data[idx + 14]);
		Thread.sleep(3000);

		// Relation
		System.out.println("Enter Relation");
		driver.findElement(
				By.xpath("((//table[@class='table table-md mt-4'])[2]//input[@placeholder='Enter Relation'])[2]"))
				.sendKeys(data[idx + 15]);
		Thread.sleep(3000);

		// Percentage
		System.out.println("Enter Percentage");
		WebElement ep = driver.findElement(By.xpath("(//input[@placeholder='Enter Percentage'])[2]"));
		ep.clear();
		Thread.sleep(1000);
		ep.sendKeys(data[idx + 16]);
		Thread.sleep(3000);

		// Address
		System.out.println("Enter Address");
		WebElement ea = driver.findElement(By.xpath("(//input[@placeholder='Enter Address'])[2]"));
		ea.clear();
		Thread.sleep(1000);
		ea.sendKeys(data[idx + 17]);
		Thread.sleep(3000);

		// Minor
		String inp = data[idx + 18], val = "Yes";
		System.out.println("data minor is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Choose Minor Status");
			driver.findElement(By.xpath(
					"((//tbody/tr[@class=' text-secondary border-b border-zinc-300']//div[@class='flex flex-col gap-3 pl-5 items-start']/../../..)[2]//input[@value='Yes'])[2]"))
					.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Choose Minor Status");
			driver.findElement(By.xpath(
					"((//tbody/tr[@class=' text-secondary border-b border-zinc-300']//div[@class='flex flex-col gap-3 pl-5 items-start']/../../..)[2]//input[@value='No'])[2]"))
					.click();
			Thread.sleep(3000);
		}
	}

	public int add_Nend(WebDriver driver, String[] data) throws InterruptedException {
		String y = "Yes", d = (data[idx + 19]);

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath("(//button[normalize-space()='Add'])[2]")).click();
			Thread.sleep(2000);
			in++;
			return in;
		}
		return in;
	}

	public static int add_end(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 4]);

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
			Thread.sleep(2000);
			in++;
			return in;
		}
		return in;
	}

	public void del_button(WebDriver driver, String[] data) throws InterruptedException {
		String y = "Yes", d = (data[23]);
		h++;

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[h]")).click();
			Thread.sleep(2000);

		}
	}

}
