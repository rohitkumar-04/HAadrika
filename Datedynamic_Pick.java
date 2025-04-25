package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class Datedynamic_Pick {
	public static void selectDOBFromCalendar(WebDriver driver,WebElement dateInput, String dateStr) throws Exception {
		// Expected format: "dd-MM-yyyy"
		String[] parts = dateStr.split("-");
		String day = parts[0];
		int month = Integer.parseInt(parts[1]) - 1; // 0-indexed
		String year = parts[2];

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Step 1: Click the input to open the calendar
		//WebElement dateInput = driver.findElement(
			//	By.xpath("/html/body/main/div/div[3]/section/section[2]/div[2]/div[2]/form/div[1]/div[15]/input"));
		dateInput.click();
		Thread.sleep(1000); // wait for calendar popup

		// Step 2: Select year
		WebElement yearSelect = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[contains(@class,'year-select')]")));
		Select yearDropdown = new Select(yearSelect);
		yearDropdown.selectByVisibleText(year);

		// Step 3: Select month
		WebElement monthSelect = driver.findElement(By.xpath("//select[contains(@class,'month-select')]"));
		Select monthDropdown = new Select(monthSelect);
		monthDropdown.selectByIndex(month); // e.g. 0 for Jan

		// Step 4: Click on the correct day
		List<WebElement> days = driver
				.findElements(By.xpath("//div[contains(@class,'day') and not(contains(@class,'outside-month'))]"));
		for (WebElement d : days) {
			if (d.getText().equals(day)) {
				d.click();
				break;
			}
		}

		Thread.sleep(1000); // small pause after selection
	}

}
/*
//WebElement calendar = driver.findElement(By.id("id_dob"));
	//	((JavascriptExecutor) driver).executeScript("arguments[0].click(); debugger;", calendar);

		
		//Date_Pick.setDateByJS(driver, "id_dob", data[15]);
		
		WebElement dateInput = driver.findElement(By.xpath("//input[@placeholder=\"Enter D.O.B\"]"));
		//String dateStr = data[15];
		dateInput.click();
		Thread.sleep(1000);
		// 3. Select the day — in your screenshot, April 17
		WebElement day = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='17']"));
		day.click();

		
		//Datedynamic_Pick.selectDOBFromCalendar(driver,dateInput,dateStr);*/
