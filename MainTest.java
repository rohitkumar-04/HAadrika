package tests;

import org.openqa.selenium.WebDriver;

import base.DriverManage;
import pages.Click_Button;
import pages.Emp_Details;
import pages.Emp_Edu_Train_Details;
import pages.Emp_Family_Details;
import pages.Emp_Join_Inform;
import pages.Emp_Off_Details;
import pages.Emp_Prnt_Add;
import pages.Emp_Prsnl_Details;
import pages.Emp_Sal_Info;
import pages.Emp_Service_History;
import pages.Emp_Time_Bound_Details;
import pages.LoginPage_TestLink;
import pages.OnboardNew;
import utils.Disappear_Element_Handler;
import utils.Excel_Reader;

import utils.ScreenshotTake;
import utils.Tear_Down;
import utils.WaitHelper;

public class MainTest {
	public static void main_Test() throws Exception {

		// String[] data =
		// Excel_Reader.readData("C:\\\\Users\\\\aadrika\\\\Desktop\\\\HRMS\\\\Onb_Test_1.xlsx");
		String[] data = Excel_Reader.readData("C:\\Users\\aadrika\\Desktop\\HRMS\\Onb_Test_23April.xlsx");

		WebDriver driver;
		WaitHelper wt = new WaitHelper();
		driver = DriverManage.launchDriver();
		wt.waitTime();
		LoginPage_TestLink lt = new LoginPage_TestLink(driver);
		lt.loginWebPage();

		// Do onboarding steps here...
		OnboardNew on = new OnboardNew(driver);
		on.onboard_New(driver);
		wt.waitTime();

		// Step-1
		Emp_Off_Details ep1 = new Emp_Off_Details(driver);
		ep1.emp_Ofc_Details(driver, data);
		wt.waitTime();
		Click_Button ct = new Click_Button(driver);
		ct.click_button();
		wt.waitTime();

		// Step-2
		Emp_Details ep2 = new Emp_Details(driver);
		ep2.emp_details(driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-3
		Emp_Prsnl_Details ep3 = new Emp_Prsnl_Details(driver);
		ep3.emp_prsnl_details(driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-4
		Emp_Prnt_Add ep4 = new Emp_Prnt_Add(driver);
		ep4.emp_prnt_add(driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		Emp_Edu_Train_Details ep5 = new Emp_Edu_Train_Details(driver);
		ep5.emp_edu_train_details(driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-6
		Emp_Join_Inform ep6 = new Emp_Join_Inform(driver);
		ep6.emp_join_inform(driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-7
		Emp_Service_History ep7 = new Emp_Service_History(driver);
		ep7.emp_service_history(driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-8
		Emp_Family_Details ep8 = new Emp_Family_Details(driver);
		ep8.emp_Family_Details(driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-9
		Emp_Sal_Info ep9 = new Emp_Sal_Info(driver);
		ep9.emp_sal_info(driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-10
		Emp_Time_Bound_Details ep10 = new Emp_Time_Bound_Details(driver);
		ep10.emp_time_bound_details(driver, data);
		// wt.waitTime();

		// Wait and caputure Transient Element
		Disappear_Element_Handler ep11 = new Disappear_Element_Handler(driver);
		ep11.captureTransient(driver);

		// Wait and take screenshot
		ScreenshotTake.takeScreenshot(driver, "Employee_Boarded");
		wt.waitTime();

		// Close the browser
		//Tear_Down.teardown(driver);
		System.out.println("End");
	}

}
