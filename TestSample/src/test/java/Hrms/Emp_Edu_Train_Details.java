package Hrms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import TestData.Login;

public class Emp_Edu_Train_Details {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = LaunchDrv();
		Log(driver); // Login

		OnboardNew(driver); // Onboarding new Employee

		// Start the page

		System.out.println("Employee Education & Training Details");
		
		//Test Link
		driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=5");
		
		//Uat Server
		//driver.navigate().to("https://aadrikainfomedia.com/hrms/ems/onboard?page=5");

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
		
		
		
		
		click_Button(driver);
		
	


		Thread.sleep(3000);
		// Close the browser
		// close_Browser(driver);

	}

	public static void validte(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Education Level Matric Details click and delete n");
		WebElement val =  driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[1]"));
		//val.sendKeys("Matriculation");
		Actions av = new Actions(driver);
		av.sendKeys(Keys.END).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[4]")).sendKeys("2007");
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
		//WebElement el = driver.findElement(By.xpath("//label[@for=\"xyz-0\"]"));
		Thread.sleep(2000);
		//el.sendKeys("C:\\Users\\aadrika\\Desktop\\Test.pdf");
		//el.sendKeys("/TestSample/Test.pdf");
		//element.click();
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
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[10]")).sendKeys("2009");
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
		/*System.out.println("Upload Documnent");
		driver.findElement(By.xpath("//label[@for=\"xyz-1\"]")).sendKeys("C:\\Users\\aadrika\\Desktop\\Test.pdf");
		Thread.sleep(2000);*/
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
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[16]")).sendKeys("2013");
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
		/*System.out.println("Upload Documnent");
		driver.findElement(By.xpath("//label[@for='xyz-2']")).sendKeys("C:\\Users\\aadrika\\Desktop\\Test.pdf");
		Thread.sleep(2000);*/
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
	driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[21]")).sendKeys("jac");
	Thread.sleep(2000);

	// Passing Year Intermediate
	System.out.println("Passing Year Post Graduate");
	driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[22]")).sendKeys("2016");
	Thread.sleep(2000);

	// Marks in % Intermediate
	System.out.println("Marks in % Post Graduate");
	driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[23]")).sendKeys("90");
	Thread.sleep(2000);

	// Grade/Division
	System.out.println("Post Graduate Grade Auto given");
	// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[24]")).sendKeys("");
	// Thread.sleep(2000);

	// Upload Documnent
	/*System.out.println("Upload Documnent");
	driver.findElement(By.xpath("//label[@for='xyz-3']")).sendKeys("C:\\Users\\aadrika\\Desktop\\Test.pdf");
	Thread.sleep(2000);*/
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement elementg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-3")));
	elementg.sendKeys("C:\\\\Users\\\\aadrika\\\\Desktop\\\\Test.pdf");
	Thread.sleep(2000);

}



	public static WebDriver LaunchDrv() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Entering the url");
		WebDriver driver = new ChromeDriver();
		
		
		
		//UAt server
		//driver.get("https://aadrikainfomedia.com/hrms/auth/login");

		//Test Server
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

		String t5 = driver.findElement(By.xpath("//h2[normalize-space()='Onboarding the Employee']")).getText();
		System.out.println(t5);
		Assert.assertEquals("Onboarding the Employee", t5);

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

}
