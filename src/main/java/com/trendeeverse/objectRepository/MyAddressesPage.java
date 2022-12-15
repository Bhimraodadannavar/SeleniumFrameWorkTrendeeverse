package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class consist of My addresses page elements address 
 * @author Lenovo
 *
 */
public class MyAddressesPage 
{

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-1hw9j7s']")
	private WebElement addAddress;
	@FindBy(xpath="//h3[text()='Aishwarya']") 
	private WebElement addressestext;
	
	
	public  MyAddressesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	/**
	 * this method is used to click on address button
	 */
	
	public void clickOnaddAddress()
	{
		addAddress.click();
	}
	/**
	 *this method is used to fetch the text of the address
	 * @return
	 */
	public String getTextaddressNametext()
	{
		return addressestext.getText();
		
	}

}
