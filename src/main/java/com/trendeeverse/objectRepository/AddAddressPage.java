package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.trendeverse.genericUtility.WebDriverUtelity;
/**
 * This class consist of add adresses page elements address 
 * @author Lenovo
 *
 */
public class AddAddressPage 
{
	@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-16j4xbv']")
	private WebElement accountSettings;
	
	
	
	public AddAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	/**
	 * this method is used to User click on account settings button
	 */
	
	public void clickOnAccuntSettings()
	{
		accountSettings.click();
	}
	
	

}
