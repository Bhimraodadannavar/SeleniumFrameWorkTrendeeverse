package com.ecommerce.myaddress;

import static org.testng.Assert.fail;

import java.beans.Visibility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.mysql.jdbc.Driver;
import com.trendeeverse.objectRepository.AddAddressPage;
import com.trendeeverse.objectRepository.AddressFormPage;
import com.trendeeverse.objectRepository.CartPage;
import com.trendeeverse.objectRepository.HomePage;
import com.trendeeverse.objectRepository.LoginPage;
import com.trendeeverse.objectRepository.MyAddressesPage;
import com.trendeeverse.objectRepository.MyProfilePage;
import com.trendeeverse.objectRepository.PowerBankPage;
import com.trendeverse.genericUtility.BaseClass;
import com.trendeverse.genericUtility.ExcelUtility;
import com.trendeverse.genericUtility.IConstantPath;
import com.trendeverse.genericUtility.JavaUtility;
import com.trendeverse.genericUtility.PFileUtility;
import com.trendeverse.genericUtility.PropertyFileKeys;
import com.trendeverse.genericUtility.WebDriverUtelity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CartTest extends BaseClass
{

	@Test()
	public void AddingProductToTheCart()
	{
		String expectedProductName="Ubon Pb X90";

		//pom class object creation
		PowerBankPage powerBank= new PowerBankPage(driver);
		CartPage cartpage= new CartPage(driver);


		String mail = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.MAIL.convertToString());
		String password = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD.convertToString());
		login.clickOnShopperLoginButton();
		login.loginActions(mail,password);
		//home.waitUntilPageLoad(wu, timeOut);
      
		//mouse hover on Electronics
		home.moveToElement(wu, driver);
		home.clickOnPowerBank();
        
		//mouse hover back on Electronics
		powerBank.mouseOverOnElectronics(wu, driver);
		powerBank.clickOnAddToCartButton();
		home.waitUntilPageLoad(wu, timeOut);
		// click on add to cart
		powerBank.clickOnAddToCartIcon();
		String actualProductName =cartpage.getTextProductText();
		Assert.assertTrue(actualProductName.contains(expectedProductName));
		System.out.println("Testcase pass");
		
	}
}
