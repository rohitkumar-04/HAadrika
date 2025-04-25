package Hrms;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import TestData.Login;

public class Payroll_Management {

	public static int  f = 3;
	public static int s11;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = LaunchDrv();

		// Login the web application
		Log(driver);

		// Payroll Employee New
		Payroll(driver);
		Thread.sleep(2000);
		System.out.println("Pass");

		Payroll_manage(driver);
		Thread.sleep(2000);

		int g = Status_Case(driver);
		System.out.println(g);
		if (f==g) {
			edit_Payroll_Details(driver);
		}

		//Close the browser
		close_Browser(driver);
		System.out.println("Done");

	}

	public static int Status_Case(WebDriver driver) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value to choose option 1:Approve, 2:Reject, 3:Edit");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("You want to Approve the result");
			WebElement ap = driver.findElement(By.xpath("(//span[text()='Approve'])[1]"));
			ap.click();

			driver.findElement(By.id("alertButton")).click();
			Alert alert = driver.switchTo().alert();
			alert.accept(); // Click Ok button
			alert.dismiss(); // click Cancel button
			break;

		case 2:
			System.out.println("You want to Reject the result");
			WebElement ar = driver.findElement(By.xpath("(//span[text()='Reject'])[1]"));
			ar.click();
			break;

		case 3:
			System.out.println("You want to Edit the result");
			WebElement ae = driver.findElement(By.xpath("(//span[text()='Edit'])[1]"));
			ae.click();
			s11 = 3;
			break;

		default:
			System.out.println("So Sorry Wrong Options");
			break;
		}

		sc.close();
		int s =s11;
		System.out.println("Value"+s);
		return s;
	}

	public static void edit_Payroll_Details(WebDriver driver) throws InterruptedException {

		String tp1 = driver.findElement(By.xpath("//h2[normalize-space()='Payroll Management']")).getText();
		System.out.println(tp1);
		Assert.assertEquals("Payroll Management", tp1);
		
		//Display permissible leave
		System.out.println(driver.findElement(By.xpath("//div[text()='Permissible Leave']")).getText());

		// Enter Starting Date
		System.out.println("Enter the starting date");
		driver.findElement(By.xpath("(//input[@type=\"date\"])[1]")).sendKeys("04-03-2025");
		Thread.sleep(3000);

		// Enter Ending Date
		System.out.println("Enter the ending date");
		driver.findElement(By.xpath("(//input[@type=\"date\"])[2]")).sendKeys("06-03-2025");
		Thread.sleep(3000);

		// Click Enter button
		System.out.println("Click the Enter button");
		driver.findElement(By.xpath("//button[text()='Enter']")).click();
		Thread.sleep(3000);
		System.out.println("Success Message displayed");
	}

	public static void Payroll_manage(WebDriver driver) throws InterruptedException {
		// Send value
		driver.findElement(By.xpath("//input[@placeholder=\"E.g. Bineet kumar, EMP912e44\"]")).sendKeys("Rina");
		Thread.sleep(3000);

		// Search record
		driver.findElement(By.xpath("//button[normalize-space()='Search record']")).click();

	}

	public static void Payroll(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Payroll Management']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Payroll']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Search record']")).click();
		Thread.sleep(2000);

		String t2 = driver.findElement(By.xpath("//h2[normalize-space()='Payroll Management']")).getText();
		System.out.println(t2);
		Assert.assertEquals("Payroll Management", t2);
		System.out.println("Done");

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

		// UAT Link
		driver.get("https://aadrikainfomedia.com/hrms/auth/login");

		// Test Link
		// driver.get("https://test.aadrikainfomedia.com/hrms/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		return driver;

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
