package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class consist of Login page elements address 
 * @author Lenovo
 *
 */
public class LoginPage
{
	@FindBy(id="vertical-tab-0")
	private WebElement shopperloginbtn;

	@FindBy(id="vertical-tab-1") 
	private WebElement merchantloginbtn;
	
	@FindBy(id="fl_email")
	private WebElement userNameTextfield;
	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']") 
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginBtn2;


	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * this method is used to click on shopper login button
	 */
	public void clickOnShopperLoginButton()
	{
		shopperloginbtn.click();
	}
	/**
	 *this method is used to  click on merchant button
	 */
	public void clickOnMerchantButtn()
	{
		merchantloginbtn.click();
	}
	/**
	 *this method is used to enter valid username and password and click on login button
	 * @param mail
	 * @param password
	 */
	public void loginActions(String mail, String password)
	{
		userNameTextfield.sendKeys(mail);
		passwordTextfield.sendKeys(password);
		loginBtn2.click();
		
	}
	
}
