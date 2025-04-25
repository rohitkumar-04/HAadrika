package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_TestLink {
	public WebDriver driver;

	public LoginPage_TestLink(WebDriver driver) {

		this.driver = driver;
	}

	public void loginWebPage() throws Exception {
		user_name();
		Thread.sleep(2000);
		pass_word();
		Thread.sleep(2000);
		button_click();
		
	}

	By search = By.id("id_user_id");

	By search1 = By.id("id_password");

	By search2 = By.xpath("//button[@type='submit']");
	
	String user_name1=("hradminrmc@gmail.com"), user_name2=("hradminbundu@gmail.com");
	String pass_word1=("Admin1#");

	public void user_name() {
		// Enter the username
		driver.findElement(search).sendKeys(user_name1);

	}

	public void pass_word() {
		// Enter the password
		driver.findElement(search1).sendKeys(pass_word1);

	}

	public void button_click() {
		// Click the login button

		driver.findElement(search2).click();
	}


}
