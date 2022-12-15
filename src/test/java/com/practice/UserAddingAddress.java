package com.practice;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trendeeverse.objectRepository.AddAddressPage;
import com.trendeeverse.objectRepository.AddProductsPage;
import com.trendeeverse.objectRepository.AddressFormPage;
import com.trendeeverse.objectRepository.HomePage;
import com.trendeeverse.objectRepository.LoginPage;
import com.trendeeverse.objectRepository.MyAddressesPage;
import com.trendeeverse.objectRepository.MyProfilePage;
import com.trendeverse.genericUtility.ExcelUtility;
import com.trendeverse.genericUtility.IConstantPath;
import com.trendeverse.genericUtility.JavaUtility;
import com.trendeverse.genericUtility.PFileUtility;
import com.trendeverse.genericUtility.PropertyFileKeys;
import com.trendeverse.genericUtility.SheetName;
import com.trendeverse.genericUtility.WebDriverUtelity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserAddingAddress 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{


		String expectedResult = "Aishwarya";

		//create an object for generic utility
		ExcelUtility excelUtility = new ExcelUtility();
		PFileUtility pFileUtility = new PFileUtility();
		WebDriverUtelity wu = new WebDriverUtelity();
		JavaUtility javaUtility = new JavaUtility();

		//open the propertyfile
		pFileUtility.openproprtyfile();
		//read the common data from property file
		String browser = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.BROWSER.convertToString());
		String url = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.URL.convertToString());
		String mail = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.MAIL.convertToString());
		String password = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD.convertToString());
		long timeOut = Long.parseLong(pFileUtility.getDataFromPropertyFile(PropertyFileKeys.TIMEOUT.convertToString()));

		//Open the Excel
		excelUtility.openExcel();

		//read the data from excel
		String name=excelUtility.getDataFromExcel( SheetName.ADDRESS.getSheeCelltName(),1,1);
		String houseinfo=excelUtility.getDataFromExcel(SheetName.ADDRESS.getSheeCelltName(),2,2);
		String streetinfo=excelUtility.getDataFromExcel( SheetName.ADDRESS.getSheeCelltName(),2,3);
		String landmark=excelUtility.getDataFromExcel( SheetName.ADDRESS.getSheeCelltName(),2,4);
		String pincode=excelUtility.getDataFromExcel(SheetName.ADDRESS.getSheeCelltName(),2,5);
		System.out.println(pincode);
		String phoneno=excelUtility.getDataFromExcel( SheetName.ADDRESS.getSheeCelltName(),2,6);

		//launch application 
		WebDriver driver = wu.launchApplication(browser, timeOut, url);
		WebDriverWait wait= new WebDriverWait(driver,timeOut);


		//POM class Object Creation
		HomePage home= new HomePage(driver);
		LoginPage login= new LoginPage(driver);
		AddAddressPage addAddreddPage= new AddAddressPage(driver);
		MyProfilePage myProffile=new MyProfilePage(driver);
		MyAddressesPage myAddresses=new MyAddressesPage(driver);
		AddressFormPage addressForm= new AddressFormPage(driver);
		
		
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		//click on merchant login
		//driver.findElement(By.id("vertical-tab-0")).click();
		//driver.findElement(By.id("username")).sendKeys("vickydadannavar@gmail.com");
		//driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")).sendKeys("9740792108");
		//driver.findElement(By.xpath("//span[text()='Login']")).click();

		
		//wait.until(ExpectedConditions.invisibilityOf(driver.succ));
		//		driver.findElement(By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-16j4xbv']")).click();
		//		driver.findElement(By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-154ogbs']")).click();
		//		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		//		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-1hw9j7s']")).click();
		//		driver.findElement(By.xpath("//input[@placeholder='John Doe']")).sendKeys(name);
		//		driver.findElement(By.xpath("//input[@placeholder='eg-142/87, ABC Apartment']")).sendKeys(houseinfo);
		//		driver.findElement(By.xpath("//input[@placeholder='eg-4th streetInfo']")).sendKeys(streetinfo);
		//		driver.findElement(By.xpath("//input[@placeholder='eg-near This and That']")).sendKeys(landmark);
		//
		//WebElement country = driver.findElement(By.xpath("//option[text()='Country']/parent::select"));
		//wu.selectByVisibleText(country, "India")
		home.clickOnLogin();
		login.clickOnShopperLoginButton();
		login.loginActions(mail,password);
		WebElement successfully = driver.findElement(By.xpath("//div[contains(text(),'successfully')]"));
		wu.waitForPageToLoad(timeOut, successfully);
		//Thread.sleep(8000);
		home.clickOnAccuntSettings();
		home.clickOnMyProfile();
		myProffile.clickOnMyAddress();
		myAddresses.clickOnaddAddress();
		addressForm.sendUserName(name);
		addressForm.sendHouseInfo(houseinfo);
		addressForm.sendStreetInfo(streetinfo);
		addressForm.sendLandMarkInfo(landmark);
		addressForm.clickOnContryDropDown(wu,"India");
		addressForm.clickOnStateDropDown(wu,"Karnataka");
		addressForm.clickOnCityDropDown(wu,"Belagavi");
		
		addressForm.sendPincode(pincode);
		addressForm.sendPhoneNumber(phoneno);
		addressForm.clickOnaddaddressButton();
		
		
		
		//WebElement state = driver.findEle	ment(By.xpath("//option[text()='State']/parent::select[@id='demo-simple-select-placeholder-label']"));
		//wu.selectByVisibleText(state, "Karnataka");
		//WebElement City = driver.findElement(By.xpath("//option[text()='City']/parent::select[@id='demo-simple-select-placeholder-label']"));
		//wu.selectByVisibleText(City, "Belagavi");
		//driver.findElement(By.id("outlined-adornment-pincode")).sendKeys(pincode);
		//driver.findElement(By.xpath("//input[@placeholder='9876543210']")).sendKeys(phoneno);
		//driver.findElement(By.xpath("//button[text()='Add Address']")).click();
        String actualResult = myAddresses.getTextaddressNametext();
		System.out.println(actualResult);

		if(actualResult.equals(expectedResult))
		{
			System.out.println("address added successfully");
			excelUtility.setDataToExcel(IConstantPath.EXCEL_PATH, SheetName.ADDRESS.getSheeCelltName(),2,7,"Test case pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}

		excelUtility.closeExcel();
		pFileUtility.ClosepropertyFile();
		driver.close();
	}

}
