package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click_Button {
	public WebDriver driver;

	public Click_Button(WebDriver driver) {
		this.driver = driver;
	}

	public void click_button() {
		// Click the Next button
		System.out.println("Enter the value to click 1:Back; 2:Reset ; 3:Next");
		// Scanner sc = new Scanner(System.in);
		// int b = sc.nextInt();
		int b = 3;
		switch (b) {
		case 1:
			WebElement ele = driver.findElement(By.xpath(
					"//button[@class='p-2.5 px-5 text-[0.875rem] flex items-center gap-3 btn-neutral hover:border-neutral-400 rounded-md font-medium bg-white border text-[#4245D9] border-[#4245D9] hover:bg-neutral-50 hover:text-neutral-700'][normalize-space()='Back']"));
			ele.click();
			break;

		case 2:
			driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();

			break;

		case 3:
			driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();

			break;

		default:
			System.out.println("Wrong input Try Again");
			break;
		}
		// sc.close();

	}
}
