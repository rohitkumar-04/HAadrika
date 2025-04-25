package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Emp_Edu_Train_Details {

	public WebDriver driver;
	public static int in = 0, tin = 0;
	static int idx = 65;

	public Emp_Edu_Train_Details(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_edu_train_details(WebDriver driver, String[] data) throws Exception {
		String t5 = driver.findElement(By.xpath("//h2[text()='Employee Education & Training Details']")).getText();
		System.out.println(t5);
		Assert.assertEquals("Employee Education & Training Details", t5);

		matric(driver, data);
		inter(driver, data);
		graduate(driver, data);
		postgraduate(driver, data);
		int fs = add_edu(driver, data);
		if (fs == 1) {
			extra_edu5(driver, data);
		}
		Thread.sleep(2000);
		/*
		 * int fs1 = add_edu1(driver, data); if (fs1 == 2) { extra_edu6(driver, data); }
		 * Thread.sleep(2000);
		 */

		training_info(driver, data);
		Thread.sleep(2000);
		int ft = add_training(driver, data);
		if (ft == 1) {
			training_info2(driver, data);
		}
		Thread.sleep(2000);

		Thread.sleep(3000);
		validte(driver);

		Thread.sleep(3000);

	}

	public int add_edu1(WebDriver driver, String[] data) throws InterruptedException {
		String y = "Yes", d = (data[idx + 27]);
		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath(
					"//div[@class='w-full flex items-center justify-end mt-3 mb-3']//button[@type='button'][normalize-space()='Add']"))
					.click();
			Thread.sleep(2000);
			in++;
			return in;
		}
		return in;
	}

	public static int add_edu(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 20]);
		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath(
					"//div[@class='w-full flex items-center justify-end mt-3 mb-3']//button[@type='button'][normalize-space()='Add']"))
					.click();
			Thread.sleep(2000);
			in++;
			return in;
		}
		return in;
	}

	public static int add_training(WebDriver driver, String[] data) throws Exception {
		String y = "Yes", d = (data[idx + 33]);
		if (y.equalsIgnoreCase(d)) {
			driver.findElement(By.xpath(
					"//div[@class='w-full flex items-center justify-end mt-3']//button[@type='button'][normalize-space()='Add']"))
					.click();
			Thread.sleep(2000);
			tin++;
			return tin;
		}
		return in;
	}

	public static void matric(WebDriver driver, String[] data) throws InterruptedException {

		// Education Level
		// Matric
		String mat = data[idx];
		System.out.println(mat);
		if (mat == null || mat.isEmpty()) {
			System.out.println("Data Empty");
		} else {

			System.out.println("Data Present");

			System.out.println("Matric Details");
			// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[1]")).sendKeys("");
			// Thread.sleep(2000);

			// Subject Matric
			System.out.println("Subject Matric");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[2]")).sendKeys(data[idx]);
			Thread.sleep(2000);

			// Board Matric
			System.out.println("Board Matric");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[3]")).sendKeys(data[idx + 1]);
			Thread.sleep(2000);

			// Passing Year Matric
			System.out.println("Passing Year Matric");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[4]")).sendKeys(data[idx + 2]);
			Thread.sleep(2000);

			// Marks in % Matric
			System.out.println("Marks in % Matric");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[5]")).sendKeys(data[idx + 3]);
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
			element.sendKeys(data[idx + 4]);
			Thread.sleep(2000);
		}

	}

	public static void inter(WebDriver driver, String[] data) throws InterruptedException {

		// Education Level
		// Intermediate Marks
		System.out.println("Intermediate Marks Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[7]")).sendKeys("");
		// Thread.sleep(2000);
		String inter = data[idx + 5];
		System.out.println(inter);
		if (inter == null || inter.isEmpty()) {
			System.out.println("Data Empty");
		} else {

			System.out.println("Data Present");
			// Subject Intermediate
			System.out.println("Subject Intermediate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[8]")).sendKeys(data[idx + 5]);
			Thread.sleep(2000);

			// Board Intermediate
			System.out.println("Board Intermediate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[9]")).sendKeys(data[idx + 6]);
			Thread.sleep(2000);

			// Passing Year Intermediate
			System.out.println("Passing Year Intermediate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[10]")).sendKeys(data[idx + 7]);
			Thread.sleep(2000);

			// Marks in % Intermediate
			System.out.println("Marks in % Intermediate");
			driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[11]")).sendKeys(data[idx + 8]);
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
			elementi.sendKeys(data[idx + 9]);
			Thread.sleep(2000);
		}
	}

	public static void graduate(WebDriver driver, String[] data) throws InterruptedException {

		// Education Level
		// Intermediate Marks
		System.out.println("Graduate Marks Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[13]")).sendKeys("");
		// Thread.sleep(2000);
		String gr = data[idx + 10];
		System.out.println(gr);
		if (gr == null || gr.isEmpty()) {
			System.out.println("Data Empty");
		} else {

			System.out.println("Data Present");
			// Subject Intermediate
			System.out.println("Subject Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[14]")).sendKeys(data[idx + 10]);
			Thread.sleep(2000);

			// Board Intermediate
			System.out.println("Board Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[15]")).sendKeys(data[idx + 11]);
			Thread.sleep(2000);

			// Passing Year Intermediate
			System.out.println("Passing Year Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[16]")).sendKeys(data[idx + 12]);
			Thread.sleep(2000);

			// Marks in % Intermediate
			System.out.println("Marks in % Graduate");
			driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[17]")).sendKeys(data[idx + 13]);
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
			elementg.sendKeys(data[idx + 14]);
			Thread.sleep(2000);
		}

	}

	public static void postgraduate(WebDriver driver, String[] data) throws InterruptedException {

		// Education Level
		// Intermediate Marks
		System.out.println("Post Graduate Marks Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[19]")).sendKeys("");
		// Thread.sleep(2000);
		String pg = data[idx + 15];
		System.out.println(pg);
		if (pg == null || pg.isEmpty()) {
			System.out.println("Data Empty");
		} else {

			System.out.println("Data Present");
			System.out.println("Subject Post Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[20]")).sendKeys(data[idx + 15]);
			Thread.sleep(2000);

			// Board Intermediate
			System.out.println("Board Post Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[21]")).sendKeys(data[idx + 16]);
			Thread.sleep(2000);

			// Passing Year Intermediate
			System.out.println("Passing Year Post Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[22]")).sendKeys(data[idx + 17]);
			Thread.sleep(2000);

			// Marks in % Intermediate
			System.out.println("Marks in % Post Graduate");
			driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[23]")).sendKeys(data[idx + 18]);
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
			elementg.sendKeys(data[idx + 19]);
			Thread.sleep(2000);
		}

	}

	public static void extra_edu5(WebDriver driver, String[] data) throws Exception {
		System.out.println("Extra Education Number-5");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[19]")).sendKeys("");
		// Thread.sleep(2000);
		String exed = data[idx + 21];
		System.out.println(exed);
		if (exed == null || exed.isEmpty()) {
			System.out.println("Data Empty");
		} else {

			System.out.println("Data Present");

			// Education Level
			System.out.println("Subject is " + (data[54]));
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[25]")).sendKeys(data[idx + 21]);
			Thread.sleep(2000);

			// Subject
			System.out.println("Subject/stream");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[26]")).sendKeys(data[idx + 22]);
			Thread.sleep(2000);

			// Board/University
			System.out.println("Board/University");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[27]")).sendKeys(data[idx + 23]);
			Thread.sleep(2000);

			// Passing Year
			System.out.println("Passing Year");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[28]")).sendKeys(data[idx + 24]);
			Thread.sleep(2000);

			// Marks in %
			System.out.println("Marks in ");
			driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[29]")).sendKeys(data[idx + 25]);
			Thread.sleep(2000);

			// Grade/Division
			System.out.println("Post Graduate Grade Auto given");
			// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[30]")).sendKeys("");
			// Thread.sleep(2000);

			// Upload Documnent
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement elementg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-4")));
			elementg.sendKeys(data[idx + 26]);
			Thread.sleep(2000);
		}

	}

	public static void extra_edu6(WebDriver driver, String[] data) throws Exception {
		System.out.println("Extra Education Number-5");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[19]")).sendKeys("");
		// Thread.sleep(2000);
		String exed = data[idx + 28];
		System.out.println(exed);
		if (exed == null || exed.isEmpty()) {
			System.out.println("Data Empty");
		} else {

			System.out.println("Data Present");

			// Education Level
			System.out.println("Education Level is " + (data[idx + 29]));
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[31]")).sendKeys(data[idx + 29]);
			Thread.sleep(2000);

			// Subject
			System.out.println("Subject/stream");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[32]")).sendKeys(data[idx + 30]);
			Thread.sleep(2000);

			// Board/University
			System.out.println("Board/University");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[33]")).sendKeys(data[idx + 31]);
			Thread.sleep(2000);

			// Passing Year
			System.out.println("Passing Year");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[34]")).sendKeys(data[idx + 32]);
			Thread.sleep(2000);

			// Marks in %
			System.out.println("Marks in ");
			driver.findElement(By.xpath("(//input[@placeholder='Enter'])[35]")).sendKeys(data[idx + 33]);
			Thread.sleep(2000);

			// Grade/Division
			System.out.println("Post Graduate Grade Auto given");
			// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[36]")).sendKeys("");
			// Thread.sleep(2000);

			// Upload Documnent
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement elementg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-5")));
			elementg.sendKeys(data[idx + 34]);
			Thread.sleep(2000);
		}

	}

	public static void training_info(WebDriver driver, String[] data) throws Exception {

		// Training Information
		// Name of Training

		System.out.println("Name of Training");
		driver.findElement(By.xpath("//input[@placeholder='Enter Name of Training']")).sendKeys(data[idx + 27]);
		Thread.sleep(2000);

		// Training Type
		WebElement e_district = driver.findElement(By.xpath("(//select[@class='bg-white border p-1 mx-2'])"));
		System.out.println("Start Training Type Dropdown Selection");
		Select s1 = new Select(e_district);
		s1.selectByVisibleText(data[idx + 28]);
		Thread.sleep(3000);

		// Name of Institution
		System.out.println("Name of Institution");
		driver.findElement(By.xpath("//input[@placeholder='Enter Name of Institution']")).sendKeys(data[idx + 29]);
		Thread.sleep(2000);

		// Starting From (Date)
		System.out.println("Enter the Starting From (Date)");
		driver.findElement(By.xpath("//input[@placeholder='Enter Starting From']")).sendKeys(data[idx + 30]);
		Thread.sleep(3000);

		// End to (Date)
		System.out.println("Enter the End to (Date)");
		driver.findElement(By.xpath("//input[@placeholder='Enter End To']")).sendKeys(data[idx + 31]);
		Thread.sleep(3000);

		// Enter Total Days of Training
		System.out.println("Automatic select");

		// Upload document
		System.out.println("Upload the Document");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementi = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='bg-transparent outline-none']")));
		elementi.sendKeys(data[idx + 32]);
		Thread.sleep(2000);

	}

	public static void training_info2(WebDriver driver, String[] data) throws InterruptedException {
		// Training Information
		// Name of Training
		int t = 2;
		System.out.println("Name of Training");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Name of Training'])[" + t + "]"))
				.sendKeys(data[idx + 34]);
		Thread.sleep(2000);

		// Training Type
		WebElement e_district = driver
				.findElement(By.xpath("(//select[@class='bg-white border p-1 mx-2'])[" + t + "]"));
		System.out.println("Start Training Type Dropdown Selection");
		Select s1 = new Select(e_district);
		s1.selectByVisibleText(data[idx + 35]);
		Thread.sleep(3000);

		// Name of Institution
		System.out.println("Name of Institution");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Name of Institution'])[" + t + "]"))
				.sendKeys(data[idx + 36]);
		Thread.sleep(2000);

		// Starting From (Date)
		System.out.println("Enter the Starting From (Date)");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Starting From'])[" + t + "]"))
				.sendKeys(data[idx + 37]);
		Thread.sleep(3000);

		// End to (Date)
		System.out.println("Enter the End to (Date)");
		driver.findElement(By.xpath("(//input[@placeholder='Enter End To'])[" + t + "]")).sendKeys(data[idx + 38]);
		Thread.sleep(3000);

		// Enter Total Days of Training
		System.out.println("Automatic select");

		// Upload document
		System.out.println("Upload the Document");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementi = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("(//input[@class='bg-transparent outline-none'])[" + t + "]")));
		elementi.sendKeys(data[idx + 39]);
		Thread.sleep(2000);

	}

	public static void validte(WebDriver driver) throws InterruptedException {

		System.out.println("Education Level Matric Details click and delete");
		WebElement val = driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[1]"));
		val.clear();
		val.sendKeys("Matriculation");
		System.out.println("Done validate");
		/*
		 * Actions av = new Actions(driver);
		 * av.sendKeys(Keys.END).sendKeys(Keys.BACK_SPACE).build().perform();
		 */
		Thread.sleep(3000);
		/*
		 * inputField_state.sendKeys("Jharkhand"); // Actions actions2 = new
		 * Actions(driver);
		 * actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 * Thread.sleep(3000);
		 */

	}

}
