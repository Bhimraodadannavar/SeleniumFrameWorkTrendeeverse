package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trendeverse.genericUtility.WebDriverUtelity;

/**
 * This class consist of Address form page elements address 
 * @author Lenovo
 *
 */
public class AddressFormPage 

{
	@FindBy(xpath="//input[@placeholder='John Doe']")
	private WebElement userNameTextField ;
	@FindBy(xpath="//input[@placeholder='eg-142/87, ABC Apartment']")
	private WebElement houseInfo1;
	@FindBy(xpath="//input[@placeholder='eg-4th streetInfo']")
	private WebElement streetInfo1;
	@FindBy(xpath="//input[@placeholder='eg-near This and That']")
	private WebElement landMarkInfo1;
	@FindBy(xpath="//option[text()='Country']/parent::select")
	private WebElement countryDropDown;
	@FindBy(xpath="//option[text()='State']/parent::select[@id='demo-simple-select-placeholder-label']")
	private WebElement stateDropDown;
	@FindBy(xpath="//option[text()='City']/parent::select[@id='demo-simple-select-placeholder-label']")
	private WebElement cityDropDown;
	@FindBy(xpath="//div[@helpertext='Must be Number']/input")
	private WebElement pincode1;
	@FindBy(xpath="//input[@placeholder='9876543210']")
	private WebElement phoneNumber11;
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;
	
	
	public AddressFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	/**
	 *this method is used to enter username into text field
	 * @param name
	 */
	
	public void sendUserName(String name)
	{
		userNameTextField.sendKeys(name);
		
	}
	/**
	 *this method is used to enter house infirmation
	 * @param houseInfo
	 */
	public void sendHouseInfo(String houseInfo)
	{
		houseInfo1.sendKeys(houseInfo);
	}
	/**
	 *this method is used to enter street information
	 * @param streetnfo
	 */
	public void sendStreetInfo(String streetnfo)
	{
		streetInfo1.sendKeys(streetnfo);
	}
	/**
	 *this method is used to enter land mark information
	 * @param LandMarkInfo
	 */
	public void sendLandMarkInfo(String LandMarkInfo)
	{
		landMarkInfo1.sendKeys(LandMarkInfo);
	}
	/**
	 *this method is used to select drop down as country
	 * @param wu
	 * @param value
	 */
	public void clickOnContryDropDown(WebDriverUtelity wu,String  value)
	{
		wu.selectByVisibleText(countryDropDown, value);
	}
	/** 
	 * this method is used to select dropdown as state
	 * @param wu
	 * @param value
	 */
	public void clickOnStateDropDown(WebDriverUtelity wu,String  value)
	{
		wu.selectByVisibleText(stateDropDown, value);
	}
	/**
	 *this method is used to select dropdown as city
	 * @param wu
	 * @param value
	 */
	public void clickOnCityDropDown(WebDriverUtelity wu,String  value)
	{
		wu.selectByVisibleText(cityDropDown, value);
	}
	/**
	 * this method is used to enter pincode of the village
	 * @param pincode
	 */
	public void sendPincode(String pincode)
	{
		pincode1.click();
		pincode1.sendKeys(pincode);
    }
	/**
	 * this method is used to enter phone number
	 * @param phoneNumber
	 */
	public void sendPhoneNumber(String phoneNumber)
	{
		phoneNumber11.sendKeys(phoneNumber);
	}
	/**
	 *this method is used to click on address button
	 */
	public void clickOnaddaddressButton()
	{
		addAddressButton.click();
	}
}
