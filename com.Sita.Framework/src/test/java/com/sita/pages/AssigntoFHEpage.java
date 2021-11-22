package com.sita.pages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssigntoFHEpage
{
	
	@FindBy(xpath="//span[normalize-space()='Assign to File Handler']")WebElement AssigntoFHE ;
	
	@FindBy(xpath="//h5[normalize-space()='Naveen FHE']") WebElement NaveenFHE;
	@FindBy(xpath="//h5[normalize-space()='Kiran FHE']") WebElement KiranFHE;
	@FindBy(xpath="//h5[normalize-space()='Asha FHE']") WebElement AshaFHE;
	@FindBy(xpath="//h5[normalize-space()='Rajiv FHE']") WebElement RajivFHE;
	
	@FindBy(xpath="//button[contains(@class,'assign-btn-selected')]") WebElement assignButton;
	
	@FindBy(xpath="//span[normalize-space()='Send']") WebElement SendButton;
	
	public AssigntoFHEpage(WebDriver driver) {
		PageFactory.initElements(driver,this);//for initializing webdriver we are creating this constructor.
	}
	Scanner sc= new Scanner(System.in);
	{
		System.out.println("plz enter a name");
	}
	public String name=sc.nextLine();
	
	public void AssignFHE(String name)
	{
		AssigntoFHE.click();
		String a[] = new String[4];		
		a[0]="NaveenFHE";
		a[1]="KiranFHE";
		a[2]="AshaFHE";
		a[3]="RajivFHE";
		
			if(name!=null) 
			{
				if(a[0] == name) 
				{
					NaveenFHE.click();
				}
				else if (a[1] == name)
				{
					KiranFHE.click();
				}
				else if (a[2] == name)
				{
					AshaFHE.click();
				}
				else 
				{
					RajivFHE.click();
				}
			}
			else
			{
				System.out.println("name not matching");
			}
		
		assignButton.click();
		SendButton.click();
	}


}

