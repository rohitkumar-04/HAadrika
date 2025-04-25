package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.*;

public class Date_Pick {

	public static void setDateByJS(WebDriver driver, String elementId, String rawDate) throws Exception {
		SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = inputFormat.parse(rawDate);
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = outputFormat.format(date);

		WebElement dateElement = driver.findElement(By.id(elementId));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + formattedDate + "';", dateElement);
	}

}
