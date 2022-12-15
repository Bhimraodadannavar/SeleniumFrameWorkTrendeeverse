package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class consist of product list page elements address 
 * @author Lenovo
 *
 */
public class ProductListpage 
{
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-edgeStart MuiIconButton-sizeMedium css-16sgp3y']") 
	private WebElement firstNavigation;
	@FindBy(xpath="//span[text()='Product ']")
	private WebElement leftnavigationbar;
	@FindBy(xpath="//span[text()='Add Product']")
	private WebElement addproduct;




	public ProductListpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}


	/**
	 *this method is used to click on left naviagtion abr
	 */
	public void action()
	{
		leftnavigationbar.click();
	}
	/**
	 * click on add to product button
	 */

	public void actionOnAddproduct()
	{
		addproduct.click();
	}
	/**
	 *this method is used to click on first navigation bar
	 */
	public void actionfirstNavigationbar()
	{
		firstNavigation.click();
	}

}
