package utils;

import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotTake {
	

	public static void takeScreenshot(WebDriver driver, String baseName) {
		try {
			// Get user's desktop path
			// String desktopPath = System.getProperty("user.home") +
			// "C:\Users\aadrika\Desktop\\HRMS\\New folder\\HRMS_Screenshots";

			String desktopPath = System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "HRMS"
					+ File.separator + "New folder" + File.separator + "HRMS_Screenshots";

			// Create directory if it doesn't exist
			File screenshotDir = new File(desktopPath);
			screenshotDir.mkdirs();

			// Generate filename with timestamp
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			String fileName = baseName + "_" + timestamp + ".png";

			// Capture screenshot
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(screenshotDir, fileName);
			Files.copy(src.toPath(), dest.toPath());

			System.out.println("Screenshot saved at: " + dest.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * public static void captureBoardingScreenshot(WebDriver driver) { String
	 * baseName = "Employee Boarded";
	 * 
	 * try { // ✅ Wait for a key element to appear WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(10));
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("//h2[text()='Employee Onboarded']")));
	 * 
	 * // ✅ Take the screenshot after page is ready ScreenshotTake st = new
	 * ScreenshotTake(driver, baseName); st.takeScreenshot(driver, baseName);
	 * 
	 * } catch (Exception e) {
	 * System.err.println("❌ Could not take screenshot at the expected moment.");
	 * e.printStackTrace(); } }
	 */

}

