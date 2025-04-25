package utils;

import org.openqa.selenium.WebDriver;

public class Tear_Down {
	public static void teardown(WebDriver driver) {
		System.out.println("Close the browser");
		driver.quit();
	}
}
