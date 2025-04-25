package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Emp_Sal_Info {
	public WebDriver driver;
	public static int in = 0;
	public static int tin = 0;
	public static int din = 0;
	static int h = 0;
	public static int idx = 214;

	public Emp_Sal_Info(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_sal_info(WebDriver driver, String[] data) throws Exception {

		// Step-9
		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=9");

		String t9 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Salary Information']")).getText();
		System.out.println(t9);
		Assert.assertEquals("Employee Salary Information", t9);

		allowance_Sal(driver, data);
		Thread.sleep(1000);
		check_al(driver, data);
		// del_button(driver,data);

		deduction_Sal(driver, data);
		Thread.sleep(1000);
		check_de(driver, data);
		// del_button(driver,data);

	}

	public void check_de(WebDriver driver, String[] data) throws Exception {

		int fe = add_deduct(driver, data);
		if (fe == 1) {
			deduction_Sal1(driver, data);
		}
		Thread.sleep(2000);
		/*
		 * int fe1 = add_deduct(driver, data); if (fe1 == 2) { deduction_Sal(driver,
		 * data); }
		 */
		Thread.sleep(2000);

	}

	public void deduction_Sal1(WebDriver driver, String[] data) throws InterruptedException {
		// Deductions
		System.out.println("Choose Deductions Status");
		driver.findElement(By.id("function")).click();
		Thread.sleep(3000);

		// Name
		System.out.println("Enter Deductions Name");
		WebElement edn = driver
				.findElement(By.xpath("(//select[@class='w-[20rem] border rounded-xl p-2 mt-2 bg-transparent'])[2]"));
		System.out.println(edn.isSelected());
		Select sedn = new Select(edn);
		sedn.selectByVisibleText(data[idx + 16]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// WEF Date
		System.out.println("Enter Deductions WEF Date");
		// String fsed = sc.nextLine();
		WebElement edd = driver.findElement(By.xpath("(//input[@placeholder='Enter Date'])[2]"));
		edd.clear();
		edd.sendKeys(data[idx + 17]);
		Thread.sleep(3000);

		// A/C No
		System.out.println("Enter Deductions A/C No");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Accnt No '])[2]")).sendKeys(data[idx + 18]);
		Thread.sleep(3000);

		// Amount
		System.out.println("Enter Deductions Amount");
		WebElement sa = driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[2]"));
		sa.click();
		sa.clear();
		System.out.println("Amt = " + data[idx + 19]);
		sa.sendKeys(data[idx + 19]);
		Thread.sleep(3000);

	}

	public void check_al(WebDriver driver, String[] data) throws Exception {
		int fs = add_allow(driver, data);
		if (fs == 1) {
			allowance_Sal1(driver, data);
		}
		Thread.sleep(2000);
	/*	int fs1 = add_allow1(driver, data);
		if (fs1 == 2) {
			allowance_Sal2(driver, data);
		}
		Thread.sleep(2000);*/

	}

	public void allowance_Sal2(WebDriver driver, String[] data) throws InterruptedException {
		// Allowances
		System.out.println("Choose Allowances Status");
		driver.findElement(By.id("accounting")).click();
		Thread.sleep(3000);

		// Name Dropdown
		System.out.println("Enter Allowances Name");
		WebElement ean = driver
				.findElement(By.xpath("(//select[@class='w-[20rem] border rounded-xl p-2 mt-2 bg-transparent'])[3]"));
		System.out.println(ean.isSelected());
		Select sean = new Select(ean);
		sean.selectByVisibleText(data[idx + 8]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// WEF Date
		System.out.println("Enter Allowances WEF Date");
		// String fsed = sc.nextLine();
		WebElement ead = driver.findElement(By.xpath("(//input[@placeholder='Enter Date'])[3]"));
		ead.clear();
		ead.sendKeys(data[idx + 9]);
		Thread.sleep(3000);

		// Amount
		System.out.println("Enter Allowances Amount");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[3]")).sendKeys(data[idx + 10]);
		Thread.sleep(3000);

	}

	public int add_allow1(WebDriver driver, String[] data) throws InterruptedException {
		String y = "Yes", d = (data[idx + 7]);
		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
			Thread.sleep(2000);
			tin++;
			return tin;
		}
		return tin;
	}

	public void allowance_Sal1(WebDriver driver, String[] data) throws InterruptedException {
		// Allowances
		System.out.println("Choose Allowances Status");
		driver.findElement(By.id("accounting")).click();
		Thread.sleep(3000);

		// Name Dropdown
		System.out.println("Enter Allowances Name");
		WebElement ean = driver
				.findElement(By.xpath("(//select[@class='w-[20rem] border rounded-xl p-2 mt-2 bg-transparent'])[2]"));
		System.out.println(ean.isSelected());
		Select sean = new Select(ean);
		sean.selectByVisibleText(data[idx + 4]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// WEF Date
		System.out.println("Enter Allowances WEF Date");
		// String fsed = sc.nextLine();
		WebElement ead = driver.findElement(By.xpath("(//input[@placeholder='Enter Date'])[2]"));
		ead.clear();
		ead.sendKeys(data[idx + 5]);
		Thread.sleep(3000);

		// Amount
		System.out.println("Enter Allowances Amount");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[2]")).sendKeys(data[idx + 6]);
		Thread.sleep(3000);

	}

	public static int add_deduct(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 15]);

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
			Thread.sleep(2000);
			in++;
			return in;
		}
		return in;
	}

	public static int add_allow(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 3]);
		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
			Thread.sleep(2000);
			tin++;
			return tin;
		}
		return in;
	}

	public void deduction_Sal(WebDriver driver, String[] data) throws Exception {
		// Deductions
		System.out.println("Choose Deductions Status");
		driver.findElement(By.id("function")).click();
		Thread.sleep(3000);

		// Name
		System.out.println("Enter Deductions Name");
		WebElement edn = driver
				.findElement(By.xpath("//select[@class=\"w-[20rem] border rounded-xl p-2 mt-2 bg-transparent\"]"));
		System.out.println(edn.isSelected());
		Select sedn = new Select(edn);
		sedn.selectByVisibleText(data[idx + 11]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// WEF Date
		System.out.println("Enter Deductions WEF Date");
		// String fsed = sc.nextLine();
		WebElement edd = driver.findElement(By.xpath("//input[@placeholder=\"Enter Date\"]"));
		edd.clear();
		edd.sendKeys(data[idx + 12]);
		Thread.sleep(3000);

		// A/C No
		System.out.println("Enter Deductions A/C No");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Accnt No \"]")).sendKeys(data[idx + 13]);
		Thread.sleep(3000);

		// Amount
		System.out.println("Enter Deductions Amount");
		WebElement sa = driver.findElement(By.xpath("//input[@placeholder='Enter Amount']"));
		sa.click();
		sa.clear();
		System.out.println("Amt = " + data[idx + 14]);
		sa.sendKeys(data[idx+14]);
		Thread.sleep(3000);

	}

	public void allowance_Sal(WebDriver driver, String[] data) throws Exception {

		// Allowances
		System.out.println("Choose Allowances Status");
		driver.findElement(By.id("accounting")).click();
		Thread.sleep(3000);

		// Name Dropdown
		System.out.println("Enter Allowances Name");
		WebElement ean = driver
				.findElement(By.xpath("//select[@class=\"w-[20rem] border rounded-xl p-2 mt-2 bg-transparent\"]"));
		System.out.println(ean.isSelected());
		Select sean = new Select(ean);
		sean.selectByVisibleText(data[idx]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// WEF Date
		System.out.println("Enter Allowances WEF Date");
		// String fsed = sc.nextLine();
		WebElement ead = driver.findElement(By.xpath("//input[@placeholder=\"Enter Date\"]"));
		ead.clear();
		ead.sendKeys(data[idx + 1]);
		Thread.sleep(3000);

		// Amount
		System.out.println("Enter Allowances Amount");
		driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys(data[idx + 2]);
		Thread.sleep(3000);

	}

	public static void del_button(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[23]);
		h++;

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[h]")).click();
			Thread.sleep(2000);
		}
	}

}
