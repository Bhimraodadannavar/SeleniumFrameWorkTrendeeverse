package com.practice;

import java.beans.Visibility;
import java.io.FileInputStream;
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

import com.mysql.jdbc.Driver;
import com.trendeeverse.objectRepository.AddAddressPage;
import com.trendeeverse.objectRepository.AddressFormPage;
import com.trendeeverse.objectRepository.CartPage;
import com.trendeeverse.objectRepository.HomePage;
import com.trendeeverse.objectRepository.LoginPage;
import com.trendeeverse.objectRepository.MyAddressesPage;
import com.trendeeverse.objectRepository.MyProfilePage;
import com.trendeeverse.objectRepository.PowerBankPage;
import com.trendeverse.genericUtility.ExcelUtility;
import com.trendeverse.genericUtility.IConstantPath;
import com.trendeverse.genericUtility.JavaUtility;
import com.trendeverse.genericUtility.PFileUtility;
import com.trendeverse.genericUtility.PropertyFileKeys;
import com.trendeverse.genericUtility.WebDriverUtelity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingProductToTheCartTest 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		String expectedResult1="Ubon Pb X90";
		//create an Object for Generic utiliity
		PFileUtility pFileUtility = new PFileUtility();
		JavaUtility javaUtility = new JavaUtility();
		WebDriverUtelity wu = new WebDriverUtelity();

		//open the propertyfile
		pFileUtility.openproprtyfile();

		//read the commondata from property file
		String browser = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.BROWSER.convertToString());
		String url = pFileUtility.getDataFromPropertyFile( PropertyFileKeys.URL.convertToString());
		String mail = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.MAIL.convertToString());
		String password = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD.convertToString());
		long timeOut = Long.parseLong(pFileUtility.getDataFromPropertyFile(PropertyFileKeys.TIMEOUT.convertToString()));


		//launching browser
		WebDriver driver=wu.launchApplication(browser, timeOut, url);
		WebDriverWait wait= new WebDriverWait(driver, timeOut);

		//pom class object creation
		LoginPage login= new LoginPage(driver);
		AddAddressPage addAddreddPage= new AddAddressPage(driver);
		MyProfilePage myProffile=new MyProfilePage(driver);
		MyAddressesPage myAddresses=new MyAddressesPage(driver);
		AddressFormPage addressForm= new AddressFormPage(driver);
		HomePage home=new HomePage(driver);
		PowerBankPage powerBank= new PowerBankPage(driver);
		CartPage cartpage= new CartPage(driver);



		home.clickOnLogin();
		login.clickOnShopperLoginButton();
		login.loginActions(mail,password);
		//WebElement successfully = driver.findElement(By.xpath("//div[contains(text(),'successfully')]"));
		home.waitUntilPageLoad(wu, timeOut);
		//		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1q2h7u5']")).click();
		//		driver.findElement(By.id("fl_email")).sendKeys(mail);
		//		driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")).sendKeys(password);
		//		driver.findElement(By.xpath("//span[text()='Login']")).click();
		//		
		// mouse hover on Electronics
		//WebElement Electronics = driver.findElement(By.xpath("//a[text()='Electronic']"));
		home.moveToElement(wu, driver);
		//driver.findElement(By.xpath("//a[text()='Power bank']")).click();
		home.clickOnPowerBank();
		String actual = driver.findElement(By.xpath("//span[text()='ubon pb x90']")).getText();

		//mouse hover back on Electronics
		WebElement ele=	driver.findElement(By.xpath("//a[text()='Electronics']"));
		powerBank.mouseOverOnElectronics(wu, driver);
		//driver.findElement(By.xpath("//span[text()='ubon pb x90']/ancestor::div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__66Fh7 css-s18byi aos-init aos-animate']/descendant::button")).click();
		powerBank.clickOnAddToCartButton();
		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(text(),'successfully logged')]"))));
		home.waitUntilPageLoad(wu, timeOut);
		// click on add to cart
		//driver.findElement(By.xpath("//a[@class='navbar_cartIcon__Lqbph']")).click();
		powerBank.clickOnAddToCartIcon();
		String actualProductName =cartpage.getTextProductText();
		System.out.println(actualProductName);

		//verify
		if(actualProductName.equals(expectedResult1))
		{
			System.out.println("Testcase pass");
		}
		else
		{
			System.out.println("Testcase Fail");
		}

		{
			//closing property file
			pFileUtility.ClosepropertyFile();
			driver.close();
		}
	}
}