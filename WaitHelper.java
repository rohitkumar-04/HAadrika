package utils;
/*
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/

public class WaitHelper {
	public void waitTime() throws Exception {
		Thread.sleep(2000);}

	/* public static void waitForElementVisible(WebDriver driver, By locator, int seconds) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

	    public static void waitForPageLoad(WebDriver driver) {
	        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
	            wd -> ((org.openqa.selenium.JavascriptExecutor) wd)
	                .executeScript("return document.readyState").equals("complete")
	        );
	    }*/
	
}
