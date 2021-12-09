package com.sita.testcases;

import java.util.Calendar;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sita.pageObjects.CreateUser;
import com.sita.pages.BaseClass;
import com.sita.pages.LoginPage;

/**
 * for adding supervisor and fhe
 * @author Ritu
 *
 */
public class Create_supervisor_fhe extends BaseClass {
	
	
		@Test(priority = 1)
		public void loginApp() {

			logger = report.createTest("Login to Sita_Create_User");

			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

			loginPage.loginToAPP(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 1));
			
			logger.pass("Login Success");
		}
		@Test(priority = 2)

		public void click_on_AddUsers() 

		{
			CreateUser Cu= new CreateUser(driver);
			Cu.AddUsers();
			logger.pass("AddUsers_clicked");
			
		}
		/**
		 * filling all the supervisor details from the excel sheet
		 * @author Ritu
		 *
		 */
		@Test(priority =3 )

		public void Supervisor_Basic_Details() throws InterruptedException

		{
			CreateUser Cu= new CreateUser(driver);
			Cu.User_Basic_Details(excel.getStringData("Inventory_data",1,1), excel.getStringData("Inventory_data",1,2),
				excel.getStringData("Inventory_data",1,3), excel.getStringData("Inventory_data",1,4));
			
			Cu.org_Unit();
			Cu.Location();
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			// Scroll Down
			//js.executeScript("window.scrollBy(0,400)");
			//po.click_add_new_button();
			Cu.scroll_and_select_FIT_GIT_SERIES();
			
			Cu.click_calender1();//clicking on active From calender & selecting todays date
			Cu.click_calender2();////clicking on active till calender
			Calendar cal= Calendar.getInstance();
			cal.add(Calendar.YEAR,3);
			Thread.sleep(5000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}




















