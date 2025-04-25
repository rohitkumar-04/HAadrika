package Hrms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

import TestData.Login;

public class HrmsT {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the url");
		WebDriver driver = new ChromeDriver();

		driver.get("https://test.aadrikainfomedia.com/hrms/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);

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

		// employee Management left side
		driver.findElement(By.xpath("//span[normalize-space()='Employee Management']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Onboard']")).click();

		Thread.sleep(2000);

		String t2 = driver.findElement(By.xpath("//h2[normalize-space()='Onboarding the Employee']")).getText();
		System.out.println(t2);
		Assert.assertEquals("Onboarding the Employee", t2);

		System.out.println("Enter the Quick link to get directly to employee");

		{

			System.out.println("Enter the value to go directly");
			int in = sc.nextInt();
			switch (in) {
			case 1:
				driver.findElement(By.xpath("// span[normalize-space()='Office Details']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//label[normalize-space()='New Employee']")).click();
				Thread.sleep(2000);

				// Need to select the value from dropdown district
				WebElement e_district = driver.findElement(By.id("id_district"));
				System.out.println("Start District Dropdown Selection");
				Select s1 = new Select(e_district);
				s1.selectByVisibleText("Ranchi");
				Thread.sleep(3000);

				// Need to select the value from Treasury Name
				// Explicit wait to ensure the element is visible and clickable
				System.out.println("Select the value from Treasury Name");
				WebElement inputField = driver.findElement(By.xpath("//input[contains(@id, 'r0')]"));
				inputField.sendKeys("Ranchi");
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(3000);

				// DDO Code
				System.out.println("Select DDO Code Dropdown");
				WebElement inputField2 = driver.findElement(By.xpath("//input[@placeholder=\"Select DDO Code\"]"));
				inputField2.sendKeys("RNCUDV006");
				Actions actions2 = new Actions(driver);
				actions2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(3000);

				/*
				 * { // DDO Code // Explicit wait to ensure the element is visible and clickable
				 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				 * WebElement inputElement1 =
				 * wait.until(ExpectedConditions.elementToBeClickable(By.id(":r0:")));
				 * 
				 * // Ensure it's an input field if (inputElement1.getTagName().equals("input"))
				 * { inputElement1.sendKeys("RNCOTH010"+Keys.ENTER); } else {
				 * System.out.println("Expected an <input> field, but found a different tag.");
				 * }
				 * 
				 * }
				 */

				/*
				 * { // DDO Code WebElement e_ddo =
				 * driver.findElement(By.xpath("//input[@id=':r2:']"));
				 * System.out.println("Start Dropdown Selection"); Select s3 = new
				 * Select(e_ddo); s3.selectByVisibleText("RNCRDS004"); //RNCOTH010
				 * 
				 * }
				 */

				// Select the button option to click
				System.out.println("Enter the value to click 1:Back; 2:Reset ; 3:Next");
				int b = sc.nextInt();
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

				break;

			case 2:
				driver.findElement(By.xpath("// span[normalize-space()='Employee Details']")).click();

				break;

			case 3:
				driver.findElement(By.xpath("// span[normalize-space()='Personal Details']")).click();

				break;

			case 4:
				driver.findElement(By.xpath("// span[normalize-space()='Address Details']")).click();

				break;

			case 5:
				driver.findElement(By.xpath("// span[normalize-space()='Education & Training']")).click();

				break;

			case 6:
				driver.findElement(By.xpath("// span[normalize-space()='Joining Information']")).click();

				break;

			case 7:
				driver.findElement(By.xpath("// span[normalize-space()='Service History']")).click();

				break;

			case 8:
				driver.findElement(By.xpath("// span[normalize-space()='Family & Nominee']")).click();

				break;

			case 9:
				driver.findElement(By.xpath("// span[normalize-space()='Salary Information']")).click();

				break;

			case 10:
				driver.findElement(By.xpath("// span[normalize-space()='Time Bound Details']")).click();

				break;

			default:
				System.out.println("System Error");
				break;
			}

		}

		// String s1 = driver.findElement(By.xpath("// div[@class='flex justify-between
		// mb-10']")).getText();
		// System.out.println(s1);

		// h5[normalize-space()='Steps-1/10']

		Thread.sleep(3000);

		// System.out.println("True");
		sc.close();

		driver.close();
		System.out.println("End the task");

	}

}
