package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.LinkTest;

public class DriverManage {

	public static WebDriver launchDriver() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LinkTest lu = new LinkTest();
		driver.get(lu.url());
		return driver;
	}

}
