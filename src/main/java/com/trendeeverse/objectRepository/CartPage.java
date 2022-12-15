package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class consist of Cart page elements address 
 * @author Lenovo
 *
 */
public class CartPage 
{
	@FindBy(xpath="//h3[text()='ubon pb x90']")
	WebElement addedProductText;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/**
	 *this method is used to fetch the product text
	 * @return
	 */
	public String getTextProductText()
	{
		return addedProductText.getText();
	}

}
