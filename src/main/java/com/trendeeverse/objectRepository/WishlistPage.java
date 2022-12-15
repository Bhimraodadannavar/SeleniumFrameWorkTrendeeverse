package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class consist of wish list page elements address 
 * @author Lenovo
 *
 */
public class WishlistPage
{
	@FindBy(xpath="//h2[text()='ubon pb x90']")
	private WebElement textOfThePrpduct;
	

	public WishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	/**
	 *this method is used to get the text of the Product
	 * @return
	 */
	public String gettextofTheProduct()
	{
		return textOfThePrpduct.getText();
	}

}
