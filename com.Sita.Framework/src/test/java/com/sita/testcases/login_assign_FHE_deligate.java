package com.sita.testcases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sita.pages.BaseClass;
import com.sita.pages.HomePage;
import com.sita.pages.LoginPage;
import com.sita.pages.WebdriverUtility;

/**
 * Assigning FHE and deligating files to The AO/BO.
 * @author Ritu
 *
 */
public class login_assign_FHE_deligate extends BaseClass {

/*
	@Test(priority=1)
	public void loginApp()
	{
		
		logger=report.createTest("Login to Sita");
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		loginPage.loginToAPP(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
	}
	
	@Test(priority=2)
	
	public void navigate_to_homepage_click_on_ArrowButton() 
	
	{
		logger=report.createTest("click_on_ArrowButton");
		HomePage Hp = new HomePage(driver);
		Hp.Click_ArrowButton();
		logger.pass("ArrowButton_clicked");
	
	}
		@Test(priority=3)
	public void ConfirmButton()
	{
		WebdriverUtility wb=new WebdriverUtility();
		wb.waitUntilPageLoad(driver);
		logger=report.createTest("click_on_Confirm_Button");
		HomePage Hp = new HomePage(driver);
		Hp.Click_ConfirmButton();
		
	}
	
	@Test(priority=4)
	public void AssigntoFHE()  
	{
		logger=report.createTest("click_on_Assign_to_File_Handler");
		HomePage Hp1 = new HomePage(driver);
		Hp1.AssignFile_Handler();
		logger.pass("Assign_to_File_Handler_clicked");
		WebElement select = driver.findElement(By.xpath("//h5[normalize-space()='Naveen FHE']"));
		List<WebElement> options=select.findElements(By.xpath("//h5[@class='ant-typography _title assign-fhe-name']"));
		
		for(WebElement option : options) {
			  if("Naveen FHE".equals(option.getText()))
				    option.click();  
				}
		HomePage Hp = new HomePage(driver);
		Hp.AssignButton_sendButton();
		
	}
	
	
	@Test(priority=5)
	public void Click_on_BackButton()
	{
		HomePage Hp = new HomePage(driver);
		Hp.BackButton();
	}
	@Test(priority=6)
	public void Logout()
	{
		//moving mouse cursor to "logout" dropdown and clicking it.
				
				WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[3]/ul/li[6]/img"));
				WebdriverUtility wb=new WebdriverUtility();
				wb.mouseOver(driver, ele);
				HomePage Hp = new HomePage(driver);
				Hp.Click_on_LogoutButton();
	}
	*/
	@Test(priority=6)
	
		public void loginFHE()
		{
			LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
			loginPage.loginToAPP(excel.getStringData("LoginFHE", 0, 0),excel.getStringData("LoginFHE", 0, 1));
						
		}
	@Test(priority=7)
	
		public void ArrowButtonofFHE()
		
		{
		HomePage Hp = new HomePage(driver);
		Hp.Click_ArrowButtonFHE();
			
		}
	
	@Test(priority=8)
		public void BookingCentre()
		{
		HomePage Hp = new HomePage(driver);
		Hp.Click_on_BookingCentre();
		}
	@Test(priority=9)
	public void AO_BO()
	{
	HomePage Hp = new HomePage(driver);
	Hp.go_to_AO_BO();
	}
		@Test(priority=10)
		public void City()	
		{
					
				List<WebElement> allbuttons = driver.findElements(By.xpath("//button[@class='ant-btn btn-select']"));
				for(WebElement currentbutton : allbuttons) {
					currentbutton.click();
				}
		}
		
		@Test(priority=11)
				public void move_to_city() throws InterruptedException	
				{
			WebElement title = driver.findElement(By.xpath("//h5[normalize-space()='Z_Mumbai']"));
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView()", title);
			System.out.println(driver.getTitle());
				}
		/*
		@Test(priority=12)
			public void deligation1() throws InterruptedException	
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-700)");
			Thread.sleep(5000);
			HomePage Hp = new HomePage(driver);
			Hp.Click_on_Deligate_Button();
		
				}
			
			@Test(priority=13)
			public void deligate_popup_button()
			{
			HomePage Hp = new HomePage(driver);
			Hp.deligate_popup_button();
			}
					
		*/
		
}











