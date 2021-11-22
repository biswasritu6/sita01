package com.sita.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Select_amenities {
	WebDriver driver;
	public  Select_amenities(WebDriver driver)
	{
		this.driver=driver;//for initializing webdriver we are creating this constructor.
	}
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/input[1]")WebElement Z_mumbai_box1;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[2]/input[1]")WebElement Z_mumbai_box2;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[2]/input[1]")WebElement Z_mumbai_box3;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/div[2]/input[1]")WebElement Z_mumbai_box4;

	
	
	public void writng_units(String units1,String units2,String units3,String units4)
	{
		Z_mumbai_box1.sendKeys(String.valueOf(units1));
		Z_mumbai_box2.sendKeys(String.valueOf(units2));
		Z_mumbai_box3.sendKeys(String.valueOf(units3));
		Z_mumbai_box4.sendKeys(String.valueOf(units4));
	}
}
