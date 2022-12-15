package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trendeverse.genericUtility.WebDriverUtelity;
/**
 * This class consist of Power Bank page elements addresse
 * @author Lenovo
 *
 */
public class PowerBankPage 
{
	@FindBy(xpath="//a[text()='Electronics']")
	private WebElement electronics;
	@FindBy(xpath="//span[text()='ubon pb x90']/ancestor::div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__66Fh7 css-s18byi aos-init aos-animate']/descendant::button")
	private WebElement addToCartButton;
	@FindBy(xpath="//a[@class='navbar_cartIcon__Lqbph']")
	private WebElement clickOnaddtoCart;
	@FindBy(xpath="(//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[4]")
	private WebElement wishListIcon;

	public PowerBankPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	/**
	 * mouse on the electronics 
	 * @param wu
	 * @param driver
	 */

	public void mouseOverOnElectronics(WebDriverUtelity wu,WebDriver driver)
	{
		wu.mouseOveronElement(driver, electronics);
	}
	/**
	 *this method is used to click on add to cart button
	 */
	public void clickOnAddToCartButton()
	{
		addToCartButton.click();

	}
	/**
	 * this method is used to click on add to cart button
	 */
	public void clickOnAddToCartIcon()
	{
		clickOnaddtoCart.click();
	}
	/**
	 *this method is used to click on wish list icon
	 */
	public void clickOnWishListIcon()
	{
		wishListIcon.click();
	}

}