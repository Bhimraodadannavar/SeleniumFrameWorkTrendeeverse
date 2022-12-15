package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class consist of Add product page elements address 
 * @author Lenovo
 *
 */
public class AddProductsPage 
{
	@FindBy(id="pname")
	private WebElement productNameTextfield;
	@FindBy(id="brand")
	private WebElement brandTextfield;
	@FindBy(id="productTilte")
	private WebElement productTitleTextfield;
	@FindBy(id="category")
	private WebElement catageryDropdown;
	@FindBy(xpath="//li[@data-value='men']")
	private WebElement selectCatageryDropdown;
	@FindBy(id="categoryType") 
	private WebElement CatageryTypeDropdown;
	@FindBy(xpath="//li[@data-value='men-tshirt']") 
	private WebElement selectCatageryTypeDropdown;
	@FindBy(id="offer") 
	private WebElement offer1;
	@FindBy(xpath="(//input[@id='outlined-size-small'])[last()-1]") 
	private WebElement price1;
	@FindBy(xpath="(//input[@id='outlined-size-small'])[last()]") 
	private WebElement quantity1;
	@FindBy(id="thumbnailImages") 
	private WebElement thumbNailImage;
	@FindBy(id="description") 
	private WebElement description1;
	@FindBy(id="ProductImages") 
	private WebElement imagelink1;
	@FindBy(xpath="(//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeLarge css-arnt9q'])[last()-1]") 
	private WebElement productImageLinkButton;
	@FindBy(id="searchTags") 
	private WebElement searchTag1;
	@FindBy(xpath="(//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeLarge css-arnt9q'])[last()]") 
	private WebElement searchtagButton;
	@FindBy(xpath="//button[@class='product_bn5__+KCz3']") 
	private WebElement saveButton;
	@FindBy(xpath="//li[text()='ProductName']") 
	private WebElement productNametext;


		
		
		/**
		 *this method is used to add product name 
		 * @param driver
		 */
		public  AddProductsPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this );
		}
		/**
		 * this method is used to enter product name into the text field
		 * @param productname
		 */
		
		public void sendproductname(String productname)
		{
			productNameTextfield.sendKeys(productname);
		}
		/**
		 *this method is used to enter product brand
		 * @param brand
		 */
		public void sendproductBarnd(String brand)
		{
			brandTextfield.sendKeys(brand);
		}
		/**
		 *this method is used to enter product title
		 * @param productTitle
		 */
		public void sendProductTitle(String productTitle)
		{
			productTitleTextfield.sendKeys(productTitle);
		}
		/**
		 *this method is used to click on action catagery dropdown
		 */
		public void actionOnCatageryDD()
		{
			catageryDropdown.click();
			
		}
		/**
		 * this method is used to select Mens catagery
		 */
		public void actionOnMenCatageryDD()
		{
			selectCatageryDropdown.click();
		}
		/**
		 *this method is used to click on catagery drop down
		 * @param productTitle
		 */
		public void actionOnCatageryDD(String productTitle)
		{
			catageryDropdown.sendKeys(productTitle);
		}
		/**
		 * this method is used to click on catagery drop down
		 */
		public void actionOnCatagerTypeDD()
		{
			CatageryTypeDropdown.click();
		
		}
		/**
		 *this method is used to select mens T-shirt in the dropdown
		 */
		public void actionMensTSdirtOnCatagerTypeDD()
		{
			selectCatageryTypeDropdown.click();
		
		}
		/**
		 *this method is used to enter offer in percentage
		 * @param offer
		 */
		public void sendOffer(String offer)
		{
			offer1.sendKeys(offer);
		
		}
		/**
		 *this method is used enter price into textfield
		 * @param price
		 */
		public void sendPrice(String price)
		{
		price1.sendKeys(price);;
		
		}
		/**
		 * this method is used to enter  quantity 
		 * @param quantity
		 */
		public void sendQuantity(String quantity)
		{
		quantity1.sendKeys(quantity);;
		
		/**
		 * this method is used to enter image link
		 */
		}
		public void sendthumbnailImageLink(String tImagelink)
		{
		thumbNailImage.sendKeys(tImagelink);;
		
		/**
		 *this method is used to enter description
		 */
		}
		public void sendDescription(String description)
		{
			description1.sendKeys(description);
	
		}
		/**
		 *this method is used to enter image link
		 * @param imagelink
		 */
		public void sendImageLink(String imagelink)
		{
			imagelink1.sendKeys(imagelink);
        }
		/**
		 *this method is used to click on product image link
		 */
		public void clickOnProductImageLinkButton()
		{
			productImageLinkButton.click();
        }
		/**
		 *this method is used enter tag name
		 * @param searchTag
		 */
		public void sendSearchTag(String searchTag)
		{
			searchTag1.sendKeys(searchTag);
        }
		/**
		 *this method is used to click on tag button
		 */
		public void clickOnSearchTagButton()
		{
			searchtagButton.click();
        }
		/**
		 * this method is used to click on save button 
		 */
		public void clickOnSaveButton()
		{
			saveButton.click();
        }
		/**
		 * this method is used to fetch the text of the product
		 * @return
		 */
		public String getTextproductNametext()
		{
			return productNametext.getText();
			
		}
		
}

