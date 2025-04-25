package utils;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class Disappear_Element_Handler {
	public WebDriver driver;

	public Disappear_Element_Handler(WebDriver driver) {
		this.driver = driver;
	}

	public void captureTransient(WebDriver driver) {
		try {
			// Wait for the transient element to be visible
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement transientMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//h2[@class='text-lg mb-4' and contains(text(),'For new employee ID #')]")));

			// Print the message text
			System.out.println("Transient message: " + transientMsg.getText());

		} catch (Exception e) {
			System.out.println("Transient element not found or disappeared too fast.");
			e.printStackTrace();
		}
	}
}
