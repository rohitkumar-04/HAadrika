package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Emp_Time_Bound_Details {

	public WebDriver driver;
	public static int in = 0;
	public static int h = 0;
	public static int idx = 239;

	public Emp_Time_Bound_Details(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_time_bound_details(WebDriver driver, String[] data) throws Exception {

		// Step-10

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=10");

		String t10 = driver
				.findElement(By.xpath("(//h2[normalize-space()='Time Bound Promotion/ACP/MACP details'])[1]"))
				.getText();
		System.out.println(t10);
		Assert.assertEquals("Time Bound Promotion/ACP/MACP details", t10);

		tbp_details(driver, data);
		Thread.sleep(2000);

		//check_de(driver, data);
		//Thread.sleep(3000);

		//del_tbp(driver, data);
		//Thread.sleep(2000);

		// Click Save button
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

	}

	public void check_de(WebDriver driver, String[] data) throws Exception {

		int fe = add_tbp(driver, data);
		if (fe == 1) {
			tbp_details1(driver, data);
		}
		Thread.sleep(2000);
		/*
		 * int fe1 = add_tbp(driver, data); if (fe1 == 2) { tbp_details(driver,data); }
		 */
		Thread.sleep(2000);

	}

	public void tbp_details1(WebDriver driver, String[] data) throws Exception {
		// Pay Scale
		// From Date
		System.out.println("Enter Pay Scale From Date");
		driver.findElement(By.xpath("(//div[contains(@class,'inline-flex items-center pt-1 pb-1 mx-2 my-2')]//input[1])[2]"))
				.sendKeys(data[idx + 10]);
		Thread.sleep(3000);

		// To Date
		System.out.println("Enter Pay Scale From Date");
		driver.findElement(By.xpath("(//div[contains(@class,'inline-flex items-center pt-1 pb-1 mx-2 my-2')]//input[2])[2]"))
				.sendKeys(data[idx + 11]);
		Thread.sleep(3000);

		// Increment Amount
		System.out.println("Enter Increment Amount");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Increment Amount'])[6]")).sendKeys(data[idx + 12]);
		Thread.sleep(3000);

		// B.Pay After Increment
		System.out.println("B.Pay After Increment");
		System.out.println("Value Auto given");
		/*
		 * driver.findElement(By.
		 * xpath("//input[@placeholder='Enter B.Pay After Increment']")).sendKeys(data[
		 * idx+4]); Thread.sleep(3000);
		 */

		// Vide Order No
		System.out.println("Enter Vide Order No");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Vide Order No'])[2]")).sendKeys(data[idx + 13]);

		// Vide Order Date
		System.out.println("Enter Vide Order Date");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Vide Order Date'])[2]")).sendKeys(data[idx + 14]);
		Thread.sleep(3000);

		// Remarks
		System.out.println("Enter Remarks");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Remarks'])[2]")).sendKeys(data[idx + 15]);
		Thread.sleep(3000);

	}

	public static int add_tbp(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 8]);

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
			Thread.sleep(2000);
			in++;
			return in;
		}
		return in;
	}

	public void tbp_details(WebDriver driver, String[] data) throws Exception {
		// Pay Scale
		// From Date
		System.out.println("Enter Pay Scale From Date");
		driver.findElement(By.xpath("//div[contains(@class,'inline-flex items-center pt-1 pb-1 mx-2 my-2')]//input[1]"))
				.sendKeys(data[idx + 1]);
		Thread.sleep(3000);

		// To Date
		System.out.println("Enter Pay Scale From Date");
		driver.findElement(By.xpath("//div[contains(@class,'inline-flex items-center pt-1 pb-1 mx-2 my-2')]//input[2]"))
				.sendKeys(data[idx + 2]);
		Thread.sleep(3000);

		// Increment Amount
		System.out.println("Enter Increment Amount");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Increment Amount'])[3]")).sendKeys(data[idx + 3]);
		Thread.sleep(3000);

		// B.Pay After Increment
		System.out.println("B.Pay After Increment");
		System.out.println("Value Auto given");
		/*
		 * driver.findElement(By.
		 * xpath("//input[@placeholder='Enter B.Pay After Increment']")).sendKeys(data[
		 * idx+4]); Thread.sleep(3000);
		 */

		// Vide Order No
		System.out.println("Enter Vide Order No");
		driver.findElement(By.xpath("//input[@placeholder='Enter Vide Order No']")).sendKeys(data[idx + 4]);

		// Vide Order Date
		System.out.println("Enter Vide Order Date");
		driver.findElement(By.xpath("//input[@placeholder='Enter Vide Order Date']")).sendKeys(data[idx + 5]);
		Thread.sleep(3000);

		// Remarks
		System.out.println("Enter Remarks");
		driver.findElement(By.xpath("//input[@placeholder='Enter Remarks']")).sendKeys(data[idx + 6]);
		Thread.sleep(3000);
	}

	public void del_tbp(WebDriver driver, String[] data) throws Exception {

		String y = "Yes", d = (data[23]);

		if (y.equalsIgnoreCase(d)) {
			h++;
			driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[" + h + "]")).click();
			Thread.sleep(2000);
		}
	}

}
