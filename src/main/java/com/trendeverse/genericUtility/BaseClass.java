package com.trendeverse.genericUtility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.trendeeverse.objectRepository.HomePage;
import com.trendeeverse.objectRepository.LoginPage;

public class BaseClass 
{	

	//	public static WebDriver sDriver;
	protected WebDriverUtelity wu;
	protected PFileUtility pFileUtility;
	protected ExcelUtility excelUtility;
	protected  WebDriver driver;
	protected HomePage home;
	protected LoginPage login;
	protected long timeOut;

	/**
	 * create an object for generic utility
	 * create an object for read the data from property file
	 * create an object for open the Excel
	 * launch the browser,application and setUp
	 * create an object for common POM classes
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	//@Parameters({"browser","url"})
	@BeforeClass(alwaysRun = true)
	public void classSetUp() throws EncryptedDocumentException, IOException
	{
		//create an object for generic utility
		excelUtility = new ExcelUtility();
		pFileUtility = new PFileUtility();
		wu = new WebDriverUtelity();

		//open the propertyfile
		pFileUtility.openproprtyfile();

		//read the common data from property file
		String browser = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.BROWSER.convertToString());
		String url = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.URL.convertToString());
		timeOut = Long.parseLong(pFileUtility.getDataFromPropertyFile("timeOut"));

		//Open the Excel
		excelUtility.openExcel();

		//launch the browser
		ThreadSafe.setWebdriverUtility(wu);
		driver = wu.launchApplication(browser, timeOut, url);

		//POM class object creation 
		home= new HomePage(driver);
		login= new LoginPage(driver);
		//home.clickOnLogin();

	}
	/**
	 * used to login to the application 
	 */
	@BeforeMethod(alwaysRun = true)
	public void methodSetUP()
	{
		home.clickOnLogin();
	}

	@AfterMethod(alwaysRun = true)
	public void methodtearDownSetUp() throws InterruptedException
	{
		home.handleclickInteractedOnAccountSettings(wu);
		home.clickOnLogOutButton();

	}

	/**
	 * used to close the browser
	 */
	@AfterClass(alwaysRun = true)
	public void classTearDownSetup()
	{
		wu.closeBrowser(excelUtility,pFileUtility);
	}
}
