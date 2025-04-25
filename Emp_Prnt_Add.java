package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Emp_Prnt_Add {

	public WebDriver driver;
	int idx = 48;

	public Emp_Prnt_Add(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_prnt_add(WebDriver driver, String[] data) throws Exception {

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=4");

		String t4 = driver
				.findElement(By.xpath(
						"//h2[@class='text-secondary text-mid_head font-medium flex items-center gap-2 undefined']"))
				.getText();
		System.out.println(t4);
		Assert.assertEquals("Employee Present Address", t4);
		
		
		//Present Address
		present_add(driver,data);

		// Checkbox to select Permanent Address
		check_box(driver, data);

	}

	public void present_add(WebDriver driver, String[] data) throws Exception {
		// Address-1* text
		System.out.println("Please Enter the Correct Primary Address");
		// String add1 = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_address_primary")).sendKeys(data[idx]);
		Thread.sleep(3000);

		// Address-2 text
		System.out.println("Please Enter the Correct Secondary Address");
		// String add2 = sc.nextLine(); // Ranchi
		driver.findElement(By.id("id_address_secondary")).sendKeys(data[idx+1]);
		Thread.sleep(3000);

		// Village/Town/City text
		System.out.println("Enter Village/Town/City text  ");
		// String ev = sc.nextLine(); // Ranchi gao
		driver.findElement(By.id("id_village")).sendKeys(data[idx+2]);
		Thread.sleep(3000);

		// Post Office text
		System.out.println("Enter Post Office text");
		// String fseg = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_post_office")).sendKeys(data[idx+3]);
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
		sed.selectByVisibleText(data[idx+4]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Block ULB Dropdown
		WebElement eblck = driver.findElement(By.id("id_block_ulb"));
		System.out.println(eblck.isSelected());
		System.out.println("Start Block ULB Dropdown Selection");
		Select seblck = new Select(eblck);
		seblck.selectByVisibleText(data[idx+5]); // Ranchi (Nagar Nigam)
		Thread.sleep(3000);

		// Pin Code text
		System.out.println("Enter Pin Code text");
		// String fseg = sc.nextLine(); // 834450
		driver.findElement(By.id("id_pin_code")).sendKeys(data[idx+6]);
		Thread.sleep(3000);

		// Police Station text
		System.out.println("Enter Police Station text");
		// String fseg = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_police_station")).sendKeys(data[idx+7]);
		Thread.sleep(3000);
	}

	public void permanent_add(WebDriver driver, String[] data) throws Exception {

		// Address-1* text
		System.out.println("Please Enter the Correct Permanent Primary Address");
		driver.findElement(By.id("id_address_primary_permanent")).sendKeys(data[idx+9]);
		Thread.sleep(3000);

		// Address-2 text
		System.out.println("Please Enter the Correct Permanent Secondary Address");
		// String add2 = sc.nextLine(); // Ranchi
		driver.findElement(By.id("id_address_secondary_permanent")).sendKeys(data[idx+10]);
		Thread.sleep(3000);

		// Village/Town/City text
		System.out.println("Enter Village/Town/City text  ");
		// String ev = sc.nextLine(); // Ranchi gao
		driver.findElement(By.id("id_village_permanent")).sendKeys(data[idx+11]);
		Thread.sleep(3000);

		// Post Office text
		System.out.println("Enter Post Office text");
		// String fseg = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_post_office_permanent")).sendKeys(data[idx+12]);
		Thread.sleep(3000);

		// State
		System.out.println("Enter the state");
		WebElement inputField_state1 = driver.findElement(By.xpath("(//input[@placeholder='Select State'])[2]"));
		inputField_state1.click();
		List<WebElement> options1 = driver.findElements(By.xpath("//li[@role='option']"));
		options1.get(13).click();
		Thread.sleep(5000);

		// District
		WebElement ed1 = driver.findElement(By.id("id_district_permanent"));
		System.out.println(ed1.isSelected());
		System.out.println("Start District Dropdown Selection");
		Select sed1 = new Select(ed1);
		sed1.selectByVisibleText(data[idx+13]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Block ULB Dropdown
		WebElement a = driver.findElement(By.id("id_block_ulb_permanent"));
		System.out.println(a.isSelected());
		System.out.println("Start Block ULB Dropdown Selection");
		Select swb = new Select(a);
		swb.selectByVisibleText(data[idx+14]); // Ranchi (Nagar Nigam)
		Thread.sleep(3000);

		// Pin Code text
		System.out.println("Enter Pin Code text");
		// String fseg = sc.nextLine(); // 834450
		driver.findElement(By.id("id_pin_code_permanent")).sendKeys(data[idx+15]);
		Thread.sleep(3000);

		// Police Station text
		System.out.println("Enter Police Station text");
		// String fseg = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_police_station_permanent")).sendKeys(data[idx+16]);
		Thread.sleep(3000);

	}

	public void check_box(WebDriver driver, String[] data) throws Exception {
		// CheckBox
		System.out.println("Check data input Yes or No");
		//String y = "Yes", d = (data[idx+8]);
		if ((data[idx+8]).equalsIgnoreCase("Yes")) {
			driver.findElement(By.xpath("//input[@id='yes']")).click();
			Thread.sleep(3000);
			System.out.println("pass");
			permanent_add(driver, data);
		} else {
			System.out.println("You have choose not to fill permanent data");
		}

	}
}