package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.WaitHelper;

public class Dashboard {

	WebDriver driver;	

	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	public void onboard_New(WebDriver driver) throws Exception {
		// Going into Dashboard
		// employee Management left side

		WaitHelper wt = new WaitHelper();
		wt.waitTime();
		driver.findElement(By.xpath("//span[normalize-space()='Employee Management']")).click();
		wt.waitTime();

		driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
		wt.waitTime();

		String t2 = driver.findElement(By.xpath("//h2[normalize-space()='HRMS Dashboard']")).getText();
		System.out.println(t2);
		Assert.assertEquals("Onboarding the Employee", t2);	
	}
}
