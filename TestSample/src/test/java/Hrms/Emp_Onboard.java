package Hrms;

import java.time.Duration;
import java.util.List;

//import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import TestData.Login;

public class Emp_Onboard {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser driver and Url
		WebDriver driver = LaunchDrv();

		// Login the web application
		Log(driver);

		// Onboarding Employee New
		OnboardNew(driver);

		// Step-1
		Emp_Off_Details(driver);
		click_Button(driver);
		Thread.sleep(3000);

		// Step-2
		Emp_Details(driver);
		click_Button(driver);
		Thread.sleep(3000);

		// Step-3
		Emp_Prsnl_Details(driver);
		click_Button(driver);
		Thread.sleep(3000);

		// Step-4
		Emp_Prnt_Add(driver);
		click_Button(driver);
		Thread.sleep(3000);

		// Step-5
		Emp_Edu_Train_Details(driver);
		//click_Button(driver);
		Thread.sleep(3000);

		// Step-6
		Emp_Join_Inform(driver);
		click_Button(driver);
		Thread.sleep(3000);

		// Step-7
		Emp_Service_History(driver);
		click_Button(driver);
		Thread.sleep(3000);

		// Step-8
		Emp_Family_Details(driver);
		click_Button(driver);
		Thread.sleep(3000);

		// Step-9
		Emp_Sal_Info(driver);
		click_Button(driver);
		Thread.sleep(3000);

		// Step-10
		Emp_Time_Bound_Details(driver);
		Thread.sleep(3000);

		// Close the browser
		close_Browser(driver);

		System.out.println("Passed");

	}

	public static void Emp_Edu_Train_Details(WebDriver driver) throws InterruptedException {

		String t5 = driver.findElement(By.xpath("//h2[text()='Employee Education & Training Details']")).getText();
		System.out.println(t5);
		Assert.assertEquals("Employee Education & Training Details", t5);

		matric(driver);
		inter(driver);
		graduate(driver);
		postgraduate(driver);

		// Training Information
		// Name of Training
		// Training Type
		// Name of Institution
		// Starting From (Date)
		// End to (Date)
		// Enter Total Days of Training
		// Upload document

		Thread.sleep(3000);
		validte(driver);

		//Thread.sleep(3000);
		//click_Button(driver);

		Thread.sleep(3000);
		// Close the browser
		// close_Browser(driver);

	}

	public static void validte(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Education Level Matric Details click and delete n");
		WebElement val = driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[1]"));
		val.sendKeys("Matriculation");
		Actions av = new Actions(driver);
		av.sendKeys(Keys.END).sendKeys(Keys.BACK_SPACE)
		.build().perform();
		Thread.sleep(3000);
		/*
		 * inputField_state.sendKeys("Jharkhand"); // Actions actions2 = new
		 * Actions(driver);
		 * actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 * Thread.sleep(3000);
		 */

	}

	public static void matric(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		// Education Level
		// Matric
		System.out.println("Matric Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[1]")).sendKeys("");
		// Thread.sleep(2000);

		// Subject Matric
		System.out.println("Subject Matric");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[2]")).sendKeys("All");
		Thread.sleep(2000);

		// Board Matric
		System.out.println("Board Matric");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[3]")).sendKeys("CBSE");
		Thread.sleep(2000);

		// Passing Year Matric
		System.out.println("Passing Year Matric");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[4]")).sendKeys("2009");
		Thread.sleep(2000);

		// Marks in % Matric
		System.out.println("Marks in % Matric");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[5]")).sendKeys("78");
		Thread.sleep(2000);

		// Grade/Division
		System.out.println("Grade Auto given");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[6]")).sendKeys("");
		// Thread.sleep(2000);

		// Upload Documnent
		System.out.println("Upload Documnent");
		// WebElement el = driver.findElement(By.xpath("//label[@for=\"xyz-0\"]"));
		Thread.sleep(2000);
		// el.sendKeys("C:\\Users\\aadrika\\Desktop\\Test.pdf");
		// el.sendKeys("/TestSample/Test.pdf");
		// element.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-0")));
		element.sendKeys("C:\\\\Users\\\\aadrika\\\\Desktop\\\\Test.pdf");
		Thread.sleep(2000);

	}

	public static void inter(WebDriver driver) throws InterruptedException {

		// Education Level
		// Intermediate Marks
		System.out.println("Intermediate Marks Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[7]")).sendKeys("");
		// Thread.sleep(2000);

		// Subject Intermediate
		System.out.println("Subject Intermediate");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[8]")).sendKeys("PCM");
		Thread.sleep(2000);

		// Board Intermediate
		System.out.println("Board Intermediate");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[9]")).sendKeys("CBSE");
		Thread.sleep(2000);

		// Passing Year Intermediate
		System.out.println("Passing Year Intermediate");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[10]")).sendKeys("2011");
		Thread.sleep(2000);

		// Marks in % Intermediate
		System.out.println("Marks in % Intermediate");
		driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[11]")).sendKeys("59");
		Thread.sleep(2000);

		// Grade/Division
		System.out.println("Grade Auto given");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[6]")).sendKeys("");
		// Thread.sleep(2000);

		// Upload Documnent
		/*
		 * System.out.println("Upload Documnent");
		 * driver.findElement(By.xpath("//label[@for=\"xyz-1\"]")).sendKeys(
		 * "C:\\Users\\aadrika\\Desktop\\Test.pdf"); Thread.sleep(2000);
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementi = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-1")));
		elementi.sendKeys("C:\\\\Users\\\\aadrika\\\\Desktop\\\\Test.pdf");
		Thread.sleep(2000);

	}

	public static void graduate(WebDriver driver) throws InterruptedException {

		// Education Level
		// Intermediate Marks
		System.out.println("Graduate Marks Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[13]")).sendKeys("");
		// Thread.sleep(2000);

		// Subject Intermediate
		System.out.println("Subject Graduate");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[14]")).sendKeys("Engg");
		Thread.sleep(2000);

		// Board Intermediate
		System.out.println("Board Graduate");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[15]")).sendKeys("Bput");
		Thread.sleep(2000);

		// Passing Year Intermediate
		System.out.println("Passing Year Graduate");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[16]")).sendKeys("2015");
		Thread.sleep(2000);

		// Marks in % Intermediate
		System.out.println("Marks in % Graduate");
		driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[17]")).sendKeys("70");
		Thread.sleep(2000);

		// Grade/Division
		System.out.println("Grade Auto given");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[6]")).sendKeys("");
		// Thread.sleep(2000);

		// Upload Documnent
		/*
		 * System.out.println("Upload Documnent");
		 * driver.findElement(By.xpath("//label[@for='xyz-2']")).sendKeys(
		 * "C:\\Users\\aadrika\\Desktop\\Test.pdf"); Thread.sleep(2000);
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-2")));
		elementg.sendKeys("C:\\\\Users\\\\aadrika\\\\Desktop\\\\Test.pdf");
		Thread.sleep(2000);

	}

	public static void postgraduate(WebDriver driver) throws InterruptedException {

		// Education Level
		// Intermediate Marks
		System.out.println("Post Graduate Marks Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[19]")).sendKeys("");
		// Thread.sleep(2000);

		// Subject Intermediate
		System.out.println("Subject Post Graduate");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[20]")).sendKeys("Mtech");
		Thread.sleep(2000);

		// Board Intermediate
		System.out.println("Board Post Graduate");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[21]")).sendKeys("JAC");
		Thread.sleep(2000);

		// Passing Year Intermediate
		System.out.println("Passing Year Post Graduate");
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[22]")).sendKeys("2017");
		Thread.sleep(2000);

		// Marks in % Intermediate
		System.out.println("Marks in % Post Graduate");
		driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[23]")).sendKeys("85");
		Thread.sleep(2000);

		// Grade/Division
		System.out.println("Post Graduate Grade Auto given");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[24]")).sendKeys("");
		// Thread.sleep(2000);

		// Upload Documnent
		/*
		 * System.out.println("Upload Documnent");
		 * driver.findElement(By.xpath("//label[@for='xyz-3']")).sendKeys(
		 * "C:\\Users\\aadrika\\Desktop\\Test.pdf"); Thread.sleep(2000);
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-3")));
		elementg.sendKeys("C:\\\\Users\\\\aadrika\\\\Desktop\\\\Test.pdf");
		Thread.sleep(2000);

	}

	public static void Emp_Time_Bound_Details(WebDriver driver) {
		// Step-10

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=10");

		String t10 = driver
				.findElement(By.xpath("(//h2[normalize-space()='Time Bound Promotion/ACP/MACP details'])[1]"))
				.getText();
		System.out.println(t10);
		Assert.assertEquals("Time Bound Promotion/ACP/MACP details", t10);

		// Click Save button
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

	}

	public static void Emp_Sal_Info(WebDriver driver) throws InterruptedException {
		// Step-9
		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=9");

		String t9 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Salary Information']")).getText();
		System.out.println(t9);
		Assert.assertEquals("Employee Salary Information", t9);

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
		sean.selectByVisibleText("House Rent Allowance (HRA)");
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// WEF Date
		System.out.println("Enter Allowances WEF Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Date\"]")).sendKeys("04-03-2018");
		Thread.sleep(3000);

		// Amount
		System.out.println("Enter Allowances Amount");
		driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys("1250");
		Thread.sleep(3000);

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
		sedn.selectByVisibleText("LIC Policy- 1");
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// WEF Date
		System.out.println("Enter Deductions WEF Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Date\"]")).sendKeys("04-03-2018");
		Thread.sleep(3000);

		// A/C No
		System.out.println("Enter Deductions A/C No");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Accnt No \"]")).sendKeys("10025469575");
		Thread.sleep(3000);

		// Amount
		System.out.println("Enter Deductions Amount");
		WebElement sa = driver.findElement(By.xpath("//input[@placeholder=\"Enter Amount\"]"));
		sa.clear();
		sa.sendKeys("565");
		Thread.sleep(3000);

	}

	public static void Emp_Family_Details(WebDriver driver) throws InterruptedException {
		// Step-8

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=8");

		String t8 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Family Details']")).getText();
		System.out.println(t8);
		Assert.assertEquals("Employee Family Details", t8);

		// Nominee name
		System.out.println("Enter Nominee name");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Nominee Name\"]")).sendKeys("Suju");
		Thread.sleep(3000);

		// Relation
		System.out.println("Enter Relation");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Relation'])[2]")).sendKeys("Mother");
		Thread.sleep(3000);

		// Percentage
		System.out.println("Enter Percentage");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Percentage\"]")).sendKeys("78");
		Thread.sleep(3000);

		// Address
		System.out.println("Enter Address");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Address\"]")).sendKeys("Namkum");
		Thread.sleep(3000);

		// Minor
		System.out.println("Choose Minor Status");
		driver.findElement(By.xpath("(//input[@value='No'])[2]")).click();
		Thread.sleep(3000);

	}

	public static void Emp_Service_History(WebDriver driver) throws InterruptedException {
		// Step-7

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=7");

		String t7 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Service History']")).getText();
		System.out.println(t7);
		Assert.assertEquals("Employee Service History", t7);

		// Scale
		System.out.println("Enter Scale");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Scale\"]")).sendKeys("3");
		Thread.sleep(3000);

		// Increment Date
		System.out.println("Enter Increment Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("//input[@name='inc_date']")).sendKeys("04-03-2019");
		Thread.sleep(3000);

		// Increment Amount
		System.out.println("Enter Increment Amount");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Increment Amount\"]")).sendKeys("580");
		Thread.sleep(3000);

		// Basic Pay After Increment
		System.out.println("Enter Basic Pay After Increment");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Basic Pay After Increment\"]")).sendKeys("2480");
		Thread.sleep(3000);

		// Vide Order No
		System.out.println("Enter Vide Order No");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Vide Order No.\"]")).sendKeys("123");

		// Vide Order Date
		System.out.println("Enter Vide Order Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("//input[@name=\"vide_order_date\"]")).sendKeys("04-03-2019");
		Thread.sleep(3000);

	}

	public static void Emp_Join_Inform(WebDriver driver) throws InterruptedException {
		// Step-6

		driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=6");

		Thread.sleep(3000);
		String t6 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Joining Information']")).getText();
		System.out.println(t6);
		Assert.assertEquals("Employee Joining Information", t6);

		// Pay Scale
		System.out.println("Enter Pay Scale");
		WebElement eps = driver.findElement(By.id("id_pay_scale"));
		System.out.println(eps.isSelected());
		Select seps = new Select(eps);
		seps.selectByVisibleText("2");
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Grade Pay
		System.out.println("Enter Grade Pay");
		WebElement egp = driver.findElement(By.id("id_grade_pay"));
		System.out.println(egp.isSelected());
		Select segp = new Select(egp);
		segp.selectByVisibleText("1900");
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Date Of Joining
		System.out.println("Enter Date Of Joining");
		// String fsed = sc.nextLine();
		driver.findElement(By.id("id_doj")).sendKeys("04-03-2018");
		Thread.sleep(3000);
	}

	public static void Emp_Prnt_Add(WebDriver driver) throws InterruptedException {
		// Step-4

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=4");

		String t4 = driver
				.findElement(By.xpath(
						"//h2[@class='text-secondary text-mid_head font-medium flex items-center gap-2 undefined']"))
				.getText();
		System.out.println(t4);
		Assert.assertEquals("Employee Present Address", t4);

		// Address-1* text
		System.out.println("Please Enter the Correct Primary Address");
		// String add1 = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_address_primary")).sendKeys("Namkum");
		Thread.sleep(3000);

		// Address-2 text
		System.out.println("Please Enter the Correct Secondary Address");
		// String add2 = sc.nextLine(); // Ranchi
		driver.findElement(By.id("id_address_secondary")).sendKeys("Ranchi");
		Thread.sleep(3000);

		// Village/Town/City text
		System.out.println("Enter Village/Town/City text  ");
		// String ev = sc.nextLine(); // Ranchi gao
		driver.findElement(By.id("id_village")).sendKeys("Ranchi gao");
		Thread.sleep(3000);

		// Post Office text
		System.out.println("Enter Post Office text");
		// String fseg = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_post_office")).sendKeys("Namkum");
		Thread.sleep(3000);

		// State
		System.out.println("Enter the state");
		WebElement inputField_state = driver.findElement(By.xpath("//button[@aria-label='Open']"));
		inputField_state.click();
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
		options.get(13).click();

		Thread.sleep(5000);

		// District
		WebElement ed = driver.findElement(By.id("id_district"));
		System.out.println(ed.isSelected());
		System.out.println("Start District Dropdown Selection");
		Select sed = new Select(ed);
		sed.selectByVisibleText("Ranchi");
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Block ULB Dropdown
		WebElement eblck = driver.findElement(By.id("id_block_ulb"));
		System.out.println(eblck.isSelected());
		System.out.println("Start Block ULB Dropdown Selection");
		Select seblck = new Select(eblck);
		seblck.selectByVisibleText("Ranchi (Nagar Nigam)"); // Ranchi (Nagar Nigam)
		Thread.sleep(3000);

		// Pin Code text
		System.out.println("Enter Pin Code text");
		// String fseg = sc.nextLine(); // 834450
		driver.findElement(By.id("id_pin_code")).sendKeys("834450");
		Thread.sleep(3000);

		// Police Station text
		System.out.println("Enter Police Station text");
		// String fseg = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_police_station")).sendKeys("Namkum");
		Thread.sleep(3000);

	}

	public static void Emp_Prsnl_Details(WebDriver driver) throws InterruptedException {
		// Step-3

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=3");

		String t3 = driver
				.findElement(By.xpath(
						"//h2[@class='text-secondary text-mid_head font-medium flex items-center gap-2 undefined']"))
				.getText();
		System.out.println(t3);
		Assert.assertEquals("Employee Personal Details", t3);

		// Married status
		WebElement em = driver.findElement(By.id("id_married_status"));
		System.out.println(em.isSelected());
		System.out.println("Start Married status Dropdown Selection");
		Select sm = new Select(em);
		sm.selectByVisibleText("Single");
		Thread.sleep(3000);

		// Identification Marks
		System.out.println("Enter the Identification Marks");
		// String fseg = sc.nextLine(); // Cut
		driver.findElement(By.id("id_identification_marks")).sendKeys("Cut");
		Thread.sleep(3000);

		// Religion
		WebElement re = driver.findElement(By.id("id_religion"));
		System.out.println(re.isSelected());
		System.out.println("Start Religion Dropdown Selection");
		Select sre = new Select(re);
		sre.selectByVisibleText("Hindu");
		// sre.selectByIndex(2);
		Thread.sleep(3000);

		// Categories
		WebElement ec = driver.findElement(By.id("id_emp_categories"));
		System.out.println(ec.isSelected());
		System.out.println("Start Categories Dropdown Selection");
		Select sec = new Select(ec);
		sec.selectByVisibleText("General");
		Thread.sleep(3000);

		// State
		System.out.println("Enter the state");
		WebElement inputField_state = driver.findElement(By.xpath("//button[@aria-label='Open']"));
		inputField_state.click();
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
		options.get(13).click();

		Thread.sleep(5000);

		// District
		WebElement ed = driver.findElement(By.id("id_emp_district"));
		System.out.println(ed.isSelected());
		System.out.println("Start District Dropdown Selection");
		Select sed = new Select(ed);
		sed.selectByVisibleText("Ranchi");
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Blood Group
		WebElement ebg = driver.findElement(By.id("id_emp_blood_group"));
		System.out.println(ebg.isSelected());
		System.out.println("Start Blood Group Dropdown Selection");
		Select sebg = new Select(ebg);
		sebg.selectByVisibleText("B+");
		Thread.sleep(3000);

		// Health Status
		WebElement ehs = driver.findElement(By.id("id_emp_health_status"));
		System.out.println(ehs.isSelected());
		System.out.println("Start Health Status Dropdown Selection");
		Select sehs = new Select(ehs);
		sehs.selectByVisibleText("Fit");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementg = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"emp_health_file\"]")));
		elementg.sendKeys("C:\\\\Users\\\\aadrika\\\\Desktop\\\\Test.pdf");
		Thread.sleep(2000);

		// LTC Home Town
		System.out.println("Enter the LTC Home Town");
		// String fseg = sc.nextLine(); // namkum lodge
		driver.findElement(By.id("id_emp_ltc_home_town")).sendKeys("Jamshedpur");
		Thread.sleep(3000);

		// Nearest Railway Station
		System.out.println("Nearest Railway Station");
		// String fseg = sc.nextLine(); // Ranchi
		driver.findElement(By.id("id_emp_nearest_railway_station")).sendKeys("Ranchi");
		Thread.sleep(3000);

		// Physical Health Type
		WebElement eph = driver.findElement(By.id("id_emp_phy_health_type"));
		System.out.println(eph.isSelected());
		System.out.println("Start Physical Health Type Dropdown Selection");
		Select seph = new Select(eph);
		seph.selectByVisibleText("Normal");
		Thread.sleep(3000);

		// Family/Guardian
		WebElement efm = driver.findElement(By.id("id_emp_family"));
		System.out.println(efm.isSelected());
		System.out.println("Start Family/Guardian Dropdown Selection");
		Select sefm = new Select(efm);
		sefm.selectByVisibleText("Father");
		Thread.sleep(3000);
		driver.findElement(By.id("id_emp_family_name")).sendKeys("Abc"); // Name = Abc
/*
		// Language
		WebElement elan = driver.findElement(By.id("id_emp_lang"));
		System.out.println(elan.isSelected());
		System.out.println("Start Language Dropdown Selection");
		Select selan = new Select(elan);
		selan.selectByVisibleText("English");
		Thread.sleep(3000);
*/
	}

	public static void Emp_Off_Details(WebDriver driver) throws InterruptedException {

		// Step 1 [Employee Office Details]

		System.out.println("Employee Office  Details");
		driver.findElement(By.xpath("// span[normalize-space()='Office Details']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[normalize-space()='New Employee']")).click();
		Thread.sleep(2000);

		// District
		WebElement e_district = driver.findElement(By.id("id_district"));
		System.out.println("Start District Dropdown Selection");
		Select s1 = new Select(e_district);
		s1.selectByVisibleText("Ranchi");
		Thread.sleep(3000);

		// Treasury Name
		System.out.println("Select the value from Treasury Name");
		WebElement inputField = driver.findElement(By.xpath("//input[contains(@id, 'r0')]"));
		inputField.sendKeys("Ranchi");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

		// DDO Code
		System.out.println("Select DDO Code Dropdown");
		WebElement inputField2 = driver.findElement(By.xpath("//input[@placeholder=\"Select DDO Code\"]"));
		inputField2.sendKeys("RNCORD020");
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

	}

	public static void Emp_Details(WebDriver driver) throws InterruptedException {
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
		aui.sendKeys("C:\\\\Users\\\\aadrika\\\\Desktop\\\\istockphoto.jpg");
		Thread.sleep(2000);

		// First name
		System.out.println("Enter the first name");
		driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("Aadrika");
		Thread.sleep(3000);

		// Middle name
		System.out.println("Enter the middle name");
		driver.findElement(By.xpath("//input[@placeholder='Enter Middle Name']")).sendKeys("kumar");
		Thread.sleep(3000);

		// Last name
		System.out.println("Enter the Last name");
		driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("kaushi");
		Thread.sleep(3000);

		// Select dropdown Mode of Recruitment
		WebElement e_rec = driver.findElement(By.id("id_mode_of_recruitment"));
		System.out.println(e_rec.isSelected());
		System.out.println("Start Recruitment Dropdown Selection");
		Select srec = new Select(e_rec);
		srec.selectByVisibleText("Employees");
		Thread.sleep(3000);

		// Contact number
		System.out.println("Enter the Contact number");
		// String fsc = sc.nextLine(); // 9658745896
		driver.findElement(By.xpath("//input[@id='id_contact_no']")).sendKeys("9658745896");
		Thread.sleep(3000);

		// Emergency Contact number*
		System.out.println("Enter the Emergency Contact number");
		// String fse = sc.nextLine(); // 6512284661
		driver.findElement(By.id("id_emg_contact_no")).sendKeys("6512284661");
		Thread.sleep(3000);

		// Aadhar Card Number*
		System.out.println("Enter the Aadhar Card number");
		// String fsea = sc.nextLine();// 526389651478
		driver.findElement(By.id("id_aadhar_no")).sendKeys("526389651478");
		Thread.sleep(3000);

		// Epic No*
		System.out.println("Enter the Epic number");
		// String fsep = sc.nextLine();// JHR2292878
		driver.findElement(By.id("id_epic_no")).sendKeys("JHR2292878");
		Thread.sleep(3000);

		// Gender*
		WebElement gen = driver.findElement(By.id("id_gender"));
		System.out.println(gen.isSelected());
		System.out.println("Start gender Selection");
		Select gens = new Select(gen);
		gens.selectByVisibleText("Male");
		Thread.sleep(3000);

		// PRAN

		// Employee Type*
		WebElement emp = driver.findElement(By.id("id_emp_type"));
		System.out.println(gen.isSelected());
		System.out.println("Start Employee Type* Dropdown Selection");
		Select semp = new Select(emp);
		// semp.selectByVisibleText("Outsourced Employees");
		semp.selectByVisibleText("Contractual Appointment");
		Thread.sleep(3000);

		// Weight
		// Height
		// CPS

		// GPF*
		System.out.println("Enter the GPF number");
		// String fseg = sc.nextLine(); // 674761234123
		WebElement gp = driver.findElement(By.id("id_gps"));
		gp.clear();
		gp.sendKeys("674761234123");
		Thread.sleep(3000);

		// DOB* [Date picker]
		System.out.println("Enter the date picker");
		// String fsed = sc.nextLine();
		driver.findElement(By.id("id_dob")).sendKeys("04-03-1994");
		Thread.sleep(3000);
		// PAN no.
		// Email

	}

	public static void click_Button(WebDriver driver) {
		// Click the Next button
		System.out.println("Enter the value to click 1:Back; 2:Reset ; 3:Next");
		// Scanner sc = new Scanner(System.in);
		// int b = sc.nextInt();
		int b = 3;
		switch (b) {
		case 1:
			WebElement ele = driver.findElement(By.xpath(
					"//button[@class='p-2.5 px-5 text-[0.875rem] flex items-center gap-3 btn-neutral hover:border-neutral-400 rounded-md font-medium bg-white border text-[#4245D9] border-[#4245D9] hover:bg-neutral-50 hover:text-neutral-700'][normalize-space()='Back']"));
			ele.click();
			break;

		case 2:
			driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();

			break;

		case 3:
			driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();

			break;

		default:
			System.out.println("Wrong input Try Again");
			break;
		}
		// sc.close();

	}

	public static void close_Browser(WebDriver driver) throws InterruptedException {
		// Close The Browser
		Thread.sleep(3000);
		driver.close();
		System.out.println("End the task");

	}

	public static WebDriver LaunchDrv() throws InterruptedException {
		// Launching the browser
		System.out.println("Entering the url");
		WebDriver driver = new ChromeDriver();

		driver.get("https://test.aadrikainfomedia.com/hrms/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		return driver;

	}

	public static void OnboardNew(WebDriver driver) throws InterruptedException {
		// Onboarding the Employee
		// employee Management left side
		driver.findElement(By.xpath("//span[normalize-space()='Employee Management']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Onboard']")).click();

		Thread.sleep(2000);

		String t2 = driver.findElement(By.xpath("//h2[normalize-space()='Onboarding the Employee']")).getText();
		System.out.println(t2);
		Assert.assertEquals("Onboarding the Employee", t2);

	}

	public static void Log(WebDriver driver) throws InterruptedException {
		// Login method
		Login lg1 = new Login(driver);

		lg1.user_name(); // Username
		Thread.sleep(3000);

		lg1.pass_word(); // Password
		Thread.sleep(3000);

		lg1.button_click(); // Button
		Thread.sleep(3000);

		String t1 = driver.getTitle();
		System.out.println(t1);

		Assert.assertEquals("Juidco HRMS", t1);

	}

}
