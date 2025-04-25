package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Emp_Service_History {
	public WebDriver driver;
	public static int tin = 0, tin1 = 0, tin2 = 0, ti =0;
	static int idx = 134;

	static int h = 0, i = 0, j = 0;

	public Emp_Service_History(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_service_history(WebDriver driver, String[] data) throws Exception {

		// Step-7

		//driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=7");

		String t7 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Service History']")).getText();
		System.out.println(t7);
		Assert.assertEquals("Employee Service History", t7);

		// Employee Increment Details
		emp_Incre_details(driver, data);
		Thread.sleep(1000);
		check_incr(driver, data);
		Thread.sleep(2000);
		// del_button_incr(driver, data);

		// Employee Promotion details
		emp_Prom_details(driver, data);
		Thread.sleep(1000);
		check_prom(driver, data);
		Thread.sleep(3000);
		del_button_prom(driver, data);

		// Employee Transfer Details
		emp_Tran_details(driver, data);
		Thread.sleep(1000);
		check_tran(driver, data);
		// del_button_tran(driver, data);
	}

	public void emp_Incre_details(WebDriver driver, String[] data) throws Exception {

		// Scale
		System.out.println("Enter Scale");
		driver.findElement(By.xpath("//input[@placeholder='Enter Scale']")).sendKeys(data[idx]);
		Thread.sleep(3000);

		// Increment Date
		System.out.println("Enter Increment Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("//input[@name='inc_date']")).sendKeys(data[idx + 1]);
		Thread.sleep(3000);

		// Increment Amount
		System.out.println("Enter Increment Amount");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Increment Amount\"]")).sendKeys(data[idx + 2]);
		Thread.sleep(3000);

		// Basic Pay After Increment
		System.out.println("Enter Basic Pay After Increment");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Basic Pay After Increment\"]"))
				.sendKeys(data[idx + 3]);
		Thread.sleep(3000);

		// Vide Order No
		System.out.println("Enter Vide Order No");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Vide Order No.\"]")).sendKeys(data[idx + 4]);

		// Vide Order Date
		System.out.println("Enter Vide Order Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("//input[@name=\"vide_order_date\"]")).sendKeys(data[idx + 5]);
		Thread.sleep(3000);

	}

	public void check_incr(WebDriver driver, String[] data) throws Exception {
		int fs = add_incr(driver, data);
		if (fs == 1) {
			emp_Incre1_details(driver, data);
		}
		Thread.sleep(2000);
		/*
		 * int fs1 = add_incr(driver, data); if (fs1 == 2) { emp_Incre_details(driver,
		 * data); }
		 */
		Thread.sleep(2000);

	}

	public void emp_Incre1_details(WebDriver driver, String[] data) throws Exception {
		// Scale
		System.out.println("Enter Scale");
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@placeholder='Enter Scale'])[2]")).sendKeys(data[idx + 7]);
		Thread.sleep(3000);

		// Wait for the new input field to appear
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@placeholder='Enter
		// Scale'])[2]")));

		// Increment Date
		System.out.println("Enter Increment Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("(//input[@name='inc_date'])[2]")).sendKeys(data[idx + 8]);
		Thread.sleep(3000);

		// Increment Amount
		System.out.println("Enter Increment Amount");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Increment Amount'])[2]")).sendKeys(data[idx + 9]);
		Thread.sleep(3000);

		// Basic Pay After Increment
		System.out.println("Enter Basic Pay After Increment");
		WebElement ed = driver.findElement(By.xpath("(//input[@placeholder='Enter Basic Pay After Increment'])[2]"));
		ed.click();
		System.out.println("hi");
		ed.sendKeys(data[idx + 10]);
		Thread.sleep(3000);

		// Vide Order No
		System.out.println("Enter Vide Order No");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Vide Order No.'])[2]")).sendKeys(data[idx + 11]);

		// Vide Order Date
		System.out.println("Enter Vide Order Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("(//input[@name='vide_order_date'])[2]")).sendKeys(data[idx + 12]);
		Thread.sleep(3000);

	}

	public static int add_incr(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 6]);
		if (y.equalsIgnoreCase(d)) {

			WebElement addbtn = driver.findElement(By.xpath(
					" //h3[normalize-space()='Employee Increment Details']/..//button[normalize-space()='Add']"));
			// eadd.click();

			Actions actions = new Actions(driver);
			actions.moveToElement(addbtn).click().perform();
			System.out.println("Increment: Clicked Add button using Actions");
			// System.out.println("hi Increment Click Add");
			Thread.sleep(5000);
			tin++;
			return tin;
		}
		return tin;
	}

	public static void del_button_incr(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[23]);
		//h++;

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath(" //h3[normalize-space()='Employee Increment Details']/..//button[normalize-space()='Delete']")).click();
			Thread.sleep(2000);
		}
	}

	public void emp_Prom_details(WebDriver driver, String[] data) throws Exception {

		// Promotional Designation From
		System.out.println("Enter Promotional Designation From");
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[1]")).sendKeys(data[idx + 14]);
		Thread.sleep(3000);

		// Designation To
		System.out.println("Enter Promotional Designation To");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[2]")).sendKeys(data[idx + 15]);
		Thread.sleep(3000);

		// Scale From
		System.out.println("Enter Promotional Scale From");
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[3]")).sendKeys(data[idx + 16]);
		Thread.sleep(3000);

		// Scale To
		System.out.println("Enter Promotional Scale To");
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[4]")).sendKeys(data[idx + 17]);
		Thread.sleep(3000);

		// Vide Order No
		System.out.println("Enter Promotional Vide Order No");
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[5]")).sendKeys(data[idx + 18]);

		// Vide Order Date
		System.out.println("Enter Promotional Vide Order Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[6]")).sendKeys(data[idx + 19]);
		Thread.sleep(3000);

		// Transfer
		String inp = data[idx + 20], val = "Yes";
		// System.out.println("Transfer checkbox is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Transfer checkbox is = " + inp);
			driver.findElement(By.xpath(
					"//div[@class='border p-5 rounded-xl shadow mt-4']//div[@class=\"flex items-center mr-3 gap-2\"]/input[@id=\"yes\"]"))
					.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Transfer checkbox is =" + inp);
			driver.findElement(By.xpath(
					"//div[@class='border p-5 rounded-xl shadow mt-4']//div[@class=\"flex items-center mr-3 gap-2\"]/input[@id=\"no\"]"))
					.click();
			Thread.sleep(3000);
		}

	}

	public void check_prom(WebDriver driver, String[] data) throws Exception {
		int fs1 = add_prom(driver, data);
		if (fs1 == 1) {
			emp_Prom_details1(driver, data);
		}
		Thread.sleep(2000);
		int fs11 = add_prom2(driver, data);
		if (fs11 == 1) {
			emp_Prom_details2(driver, data);
		}
		Thread.sleep(2000);

	}

	public int add_prom2(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 29]);
		
		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By
					.xpath(" //h3[normalize-space()='Employee Promotion Details']/..//button[normalize-space()='Add']"))
					.click();
			Thread.sleep(2000);
			ti++;
			return ti;
		}
		return ti;

	}

	public void emp_Prom_details1(WebDriver driver, String[] data) throws Exception {
		// Promotional Designation From
		System.out.println("Enter Promotional Designation From 1");
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[7]")).sendKeys(data[idx + 30]);
		Thread.sleep(3000);

		// Designation To
		System.out.println("Enter Promotional Designation Tov 1");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[8]")).sendKeys(data[idx + 31]);
		Thread.sleep(3000);

		// Scale From
		System.out.println("Enter Promotional Scale From 1");
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[9]")).sendKeys(data[idx + 32]);
		Thread.sleep(3000);

		// Scale To
		System.out.println("Enter Promotional Scale To 1");
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[10]")).sendKeys(data[idx + 33]);
		Thread.sleep(3000);

		// Vide Order No
		System.out.println("Enter Promotional Vide Order No 1");
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[11]")).sendKeys(data[idx + 34]);

		// Vide Order Date
		System.out.println("Enter Promotional Vide Order Date 1");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("(//input[@placeholder='Enter '])[12]")).sendKeys(data[idx + 35]);
		Thread.sleep(3000);

		// Transfer
		String inp = data[idx + 36], val = "Yes";
		// System.out.println("Transfer checkbox is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Transfer checkbox 1 is = " + inp);
			driver.findElement(By.xpath(
					"(//h3[normalize-space()='Employee Promotion Details']/..//div[@class='flex flex-col items-start justify-center gap-4'])[2]//input[@id='yes']"))
					.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Transfer checkbox is =" + inp);
			driver.findElement(By.xpath(
					"(//h3[normalize-space()='Employee Promotion Details']/..//div[@class='flex flex-col items-start justify-center gap-4'])[2]//input[@id='no']"))
					.click();
			Thread.sleep(3000);
		}

	}

	public void emp_Prom_details2(WebDriver driver, String[] data) throws Exception {

		// Promotional Designation From
		System.out.println("Enter Promotional Designation From");
		driver.findElement(
				By.xpath("(//h3[normalize-space()='Employee Promotion Details']/..//input[@placeholder='Enter '])[13]"))
				.sendKeys(data[idx + 22]);
		Thread.sleep(3000);

		// Designation To
		System.out.println("Enter Promotional Designation To");
		// String fsed = sc.nextLine();
		driver.findElement(
				By.xpath("(//h3[normalize-space()='Employee Promotion Details']/..//input[@placeholder='Enter '])[14]"))
				.sendKeys(data[idx + 23]);
		Thread.sleep(3000);

		// Scale From
		System.out.println("Enter Promotional Scale From");
		driver.findElement(
				By.xpath("(//h3[normalize-space()='Employee Promotion Details']/..//input[@placeholder='Enter '])[15]"))
				.sendKeys(data[idx + 24]);
		Thread.sleep(3000);

		// Scale To
		System.out.println("Enter Promotional Scale To");
		driver.findElement(
				By.xpath("(//h3[normalize-space()='Employee Promotion Details']/..//input[@placeholder='Enter '])[16]"))
				.sendKeys(data[idx + 25]);
		Thread.sleep(3000);

		// Vide Order No
		System.out.println("Enter Promotional Vide Order No");
		driver.findElement(
				By.xpath("(//h3[normalize-space()='Employee Promotion Details']/..//input[@placeholder='Enter '])[17]"))
				.sendKeys(data[idx + 26]);

		// Vide Order Date
		System.out.println("Enter Promotional Vide Order Date");
		// String fsed = sc.nextLine();
		driver.findElement(
				By.xpath("(//h3[normalize-space()='Employee Promotion Details']/..//input[@placeholder='Enter '])[18]"))
				.sendKeys(data[idx + 27]);
		Thread.sleep(3000);

		// Transfer
		String inp = data[idx + 28], val = "Yes";
		// System.out.println("Transfer checkbox is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Transfer checkbox is = " + inp);
			driver.findElement(By.xpath(
					"//div[@class='border p-5 rounded-xl shadow mt-4']//div[@class=\"flex items-center mr-3 gap-2\"]/input[@id=\"yes\"]"))
					.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Transfer checkbox is =" + inp);
			driver.findElement(By.xpath(
					"//div[@class='border p-5 rounded-xl shadow mt-4']//div[@class=\"flex items-center mr-3 gap-2\"]/input[@id=\"no\"]"))
					.click();
			Thread.sleep(3000);
		}

	}

	public static int add_prom(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 21]);
		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By
					.xpath(" //h3[normalize-space()='Employee Promotion Details']/..//button[normalize-space()='Add']"))
					.click();
			System.out.println("Add button");
			Thread.sleep(2000);
			tin1++;
			return tin1;
		}
		return tin1;
	}

	public void del_button_prom(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 37]);
		//i++;

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath(" //h3[normalize-space()='Employee Promotion Details']/..//button[normalize-space()='Delete']")).click();
			Thread.sleep(2000);
		}
	}

	public void emp_Tran_details(WebDriver driver, String[] data) throws Exception {

		// Designation From
		System.out.println("Enter Transfer Designation From");
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[1]"))
				.sendKeys(data[idx + 38]);
		Thread.sleep(3000);

		// Designation To
		System.out.println("Enter Transfer Designation To");
		// String fsed = sc.nextLine();
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[2]"))
				.sendKeys(data[idx + 39]);
		Thread.sleep(3000);

		// Office From
		System.out.println("Enter Transfer Office From");
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[3]"))
				.sendKeys(data[idx + 40]);
		Thread.sleep(3000);

		// Office To
		System.out.println("Enter Transfer Office To");
		// String fsed = sc.nextLine();
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[4]"))
				.sendKeys(data[idx + 41]);
		Thread.sleep(3000);

		// Joining Date
		System.out.println("Enter Date Of Joining");
		// String fsed = sc.nextLine();
		WebElement edd = driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[5]"));
		edd.clear();
		edd.sendKeys(data[idx + 42]);
		Thread.sleep(3000);

		// Vide Order No
		System.out.println("Enter Vide Order No");
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[6]"))
				.sendKeys(data[idx + 43]);

		// Vide Order Date
		System.out.println("Enter Vide Order Date");
		// String fsed = sc.nextLine();
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[7]"))
				.sendKeys(data[idx + 44]);
		Thread.sleep(3000);

		// Transfer and Promotion
		String inp = data[idx + 45], val = "Yes";
		System.out.println("Transfer checkbox is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Transfer and Promotion checkbox is = " + inp);
			driver.findElement(By.xpath(
					"//div[@class='border p-5 rounded-xl shadow mt-4 block']//div[@class=\"flex items-center mr-3 gap-2\"]/input[@id=\"yes\"]"))
					.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Choose Transfer and Promotion Status");
			driver.findElement(By.xpath(
					"//div[@class='border p-5 rounded-xl shadow mt-4 block']//div[@class=\"flex items-center mr-3 gap-2\"]/input[@id=\"no\"]"))
					.click();
			Thread.sleep(3000);
		}

	}

	public void check_tran(WebDriver driver, String[] data) throws Exception {
		int fss1 = add_tran(driver, data);
		if (fss1 == 1) {
			emp_Tran_details1(driver, data);
		}
		Thread.sleep(2000);
		/*
		 * int fss21 = add_tran(driver, data); if (fss21 == 2) {
		 * emp_Tran_details(driver, data); } Thread.sleep(2000);
		 */
	}

	public void emp_Tran_details1(WebDriver driver, String[] data) throws Exception {
		// Designation From
		System.out.println("Enter Transfer Designation From");
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[8]"))
				.sendKeys(data[idx + 47]);
		Thread.sleep(3000);

		// Designation To
		System.out.println("Enter Transfer Designation To");
		// String fsed = sc.nextLine();
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[9]"))
				.sendKeys(data[idx + 48]);
		Thread.sleep(3000);

		// Office From
		System.out.println("Enter Transfer Office From");
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[10]"))
				.sendKeys(data[idx + 49]);
		Thread.sleep(3000);

		// Office To
		System.out.println("Enter Transfer Office To");
		// String fsed = sc.nextLine();
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[11]"))
				.sendKeys(data[idx + 50]);
		Thread.sleep(3000);

		// Joining Date
		System.out.println("Enter Date Of Joining");
		// String fsed = sc.nextLine();
		WebElement edd = driver.findElement(By
				.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[12]"));
		edd.clear();
		edd.sendKeys(data[idx + 51]);
		Thread.sleep(3000);

		// Vide Order No
		System.out.println("Enter Vide Order No");
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[13]"))
				.sendKeys(data[idx + 52]);

		// Vide Order Date
		System.out.println("Enter Vide Order Date");
		// String fsed = sc.nextLine();
		driver.findElement(
				By.xpath("(//div[@class='border p-5 rounded-xl shadow mt-4 block']//input[@placeholder='Enter '])[14]"))
				.sendKeys(data[idx + 53]);
		Thread.sleep(3000);

		// Transfer and Promotion
		String inp = data[idx + 54], val = "Yes";
		System.out.println("Transfer checkbox is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Transfer and Promotion checkbox is = " + inp);
			driver.findElement(By.xpath(
					"(//h3[normalize-space()='Employee Transfer Details']/..//div[@class='flex flex-col items-start justify-center gap-4'])[2]//input[@id='yes']"))
					.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Choose Transfer and Promotion Status");
			driver.findElement(By.xpath(
					"(//h3[normalize-space()='Employee Transfer Details']/..//div[@class='flex flex-col items-start justify-center gap-4'])[2]//input[@id='no']"))
					.click();
			Thread.sleep(3000);
		}

	}

	public static int add_tran(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 46]);
		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By
					.xpath("//div[@class='border p-5 rounded-xl shadow mt-4 block']//button[normalize-space()='Add']"))
					.click();
			Thread.sleep(2000);
			tin2++;
			return tin2;
		}
		return tin2;
	}

	public void del_button_tran(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[23]);
		j++;

		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath(" //h3[normalize-space()='Employee Transfer Details']/..//button[normalize-space()='Delete']")).click();
			Thread.sleep(2000);
		}

	}

}
