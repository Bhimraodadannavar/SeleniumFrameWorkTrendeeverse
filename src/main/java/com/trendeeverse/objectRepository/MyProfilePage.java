package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class consist of My profile page element addresses 
 * @author Lenovo
 *
 */
public class MyProfilePage 
{
	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement myAddress;
	
	
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	/**
	 * this method is used to click on my address button
	 */
	public void clickOnMyAddress()
	{
		myAddress.click();
	}
	

}
