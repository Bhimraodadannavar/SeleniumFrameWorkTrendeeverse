package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trendeverse.genericUtility.WebDriverUtelity;
/**
 * This class consist of Home page elements address
 * @author Lenovo
 *
 */
public class HomePage 
{
	@FindBy(id="fl_login_btn") 
	private WebElement loginButton1;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-892d40']")
	private WebElement accountSettings;
	
	@FindBy(xpath="//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiAvatar-fallback css-13y7ul3']")
	private WebElement myProfile;
	
	@FindBy(xpath="//a[text()='Electronic']")
	private WebElement Electronic;
	
	@FindBy(xpath="//div[contains(text(),'successfully')]")
	private WebElement waitUntilLoad;
	
	@FindBy(xpath="//a[text()='Power bank']")
	private WebElement powerBank;
	
	@FindBy(xpath="(//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[6]")
	private WebElement wishListButton;
	
	@FindBy(xpath="//*[name()='svg'  and @data-testid='LogoutIcon']")
	private WebElement logOutButton;
	

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	/**
	 *this method is used to click on login button
	 */
	public void clickOnLogin()
	{
		loginButton1.click();
	}
/**
 *this method is used to click on account settings
 */
	public void clickOnAccuntSettings()
	{
		accountSettings.click();
	}
	/**
	 * this method is used to click on my profile button
	 */
	public void clickOnMyProfile()
	{
		myProfile.click();
	}
	/**
	 *this method is used to mouse hover the electronics element
	 * @param wu
	 * @param driver
	 */
	public void moveToElement(WebDriverUtelity wu,WebDriver driver)
	{
		wu.mouseOveronElement(driver, Electronic);
	}
	/**
	 *this method is used to wait until page load
	 * @param wu
	 * @param timeout
	 */
	public void waitUntilPageLoad(WebDriverUtelity wu,long timeout)
	
	{
		wu.waitForPageToLoad(timeout, waitUntilLoad);
	}
	/**
	 *this method is used to click on the power bank button 
	 */
	public void clickOnPowerBank()
	{
		powerBank.click();
	}
	/**
	 * this method is used to click on the wish list button
	 */
	public void clickOnWishListButton()
	{
		wishListButton.click();
	}
	/**
	 * click on logout button
	 */
	public void clickOnLogOutButton()
	{
		logOutButton.click();
	}
	/**
	 * clickIntearactedOnAccountsettings
	 * @param wu
	 */
	
	public void handleclickInteractedOnAccountSettings(WebDriverUtelity wu)
	{
	wu.elementNotIntercepted(accountSettings);
	}
	/**
	 * clickIntearactedOnLogoutButton
	 * @param wu
	 */
//	public void handleclickInteractedOnLogout(WebDriverUtelity wu)
//	{
//	wu.elementNotIntercepted(logOutButton);
//	}
}
	
	
	
	
	

