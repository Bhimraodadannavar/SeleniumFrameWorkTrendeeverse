package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trendeeverse.objectRepository.AddProductsPage;
import com.trendeeverse.objectRepository.HomePage;
import com.trendeeverse.objectRepository.LoginPage;
import com.trendeeverse.objectRepository.ProductListpage;
import com.trendeverse.genericUtility.ExcelUtility;
import com.trendeverse.genericUtility.IConstantPath;
import com.trendeverse.genericUtility.JavaUtility;
import com.trendeverse.genericUtility.PFileUtility;
import com.trendeverse.genericUtility.PropertyFileKeys;
import com.trendeverse.genericUtility.SheetName;
import com.trendeverse.genericUtility.WebDriverUtelity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MerchantAddingProduct 
{



	public static void main(String[] args) throws Exception {

		
		String expectedResult = "1: ProductName";
		
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
		String password1 = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD1.convertToString());
		long timeOut = Long.parseLong(pFileUtility.getDataFromPropertyFile("timeOut"));

		//Open the Excel
		excelUtility.openExcel();

		//read the data from excel
		String pname=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),1,1);
		String brand=excelUtility.getDataFromExcel(SheetName.MERCHANT.getSheeCelltName(),2,2);
		String ptitle=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,3);
		String offer=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,4);
		String price=excelUtility.getDataFromExcel(SheetName.MERCHANT.getSheeCelltName(),2,5);
		String quantity=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,6);
		String tnailimagelink=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,7);
		String description=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,8);
		
		String pimagelink=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,9);
		String searchtag=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,10);

		//launch the browser
		WebDriver driver=wu.launchApplication(browser, timeOut, url);
		//explicit wait
		WebDriverWait wait= new WebDriverWait(driver, timeOut);
		//click on login Button
		
		//POM class object creation 
		HomePage home= new HomePage(driver);
		LoginPage login= new LoginPage(driver);
	    ProductListpage product= new ProductListpage(driver);
	    AddProductsPage addProductPage= new AddProductsPage(driver);
	    
	    		
		//click on merchant login
		home.clickOnLogin();
		login.clickOnMerchantButtn();
		login.loginActions(mail, password1);
		
		

		//driver.findElement(By.xpath("//span[text()='Login']")).click();
		//driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-edgeStart MuiIconButton-sizeMedium css-16sgp3y']")).click();*/
		
		//clicking on product name
		product.actionfirstNavigationbar();
		product.action();
		product.actionOnAddproduct();
		addProductPage.sendproductname(pname);
		addProductPage.sendproductBarnd(brand);
		addProductPage.sendProductTitle(ptitle);
		addProductPage.actionOnCatageryDD();
		addProductPage.actionOnMenCatageryDD();
		addProductPage.actionOnCatagerTypeDD();
        addProductPage.actionMensTSdirtOnCatagerTypeDD();		
		addProductPage.sendOffer(offer);
		addProductPage.sendPrice(price);
		addProductPage.sendQuantity(quantity);
		addProductPage.sendthumbnailImageLink(tnailimagelink);
		addProductPage.sendDescription(description);	
		addProductPage.sendImageLink(pimagelink);
		addProductPage.clickOnProductImageLinkButton();
		addProductPage.sendSearchTag(searchtag);
		addProductPage.clickOnSearchTagButton();
		addProductPage.clickOnSaveButton();
		String actualResult = addProductPage.getTextproductNametext();
		
//		driver.findElement(By.xpath("//span[text()='Product ']")).click();
//		driver.findElement(By.xpath("//span[text()='Add Product']")).click();
//		driver.findElement(By.id("pname")).sendKeys(pname);
//		driver.findElement(By.id("brand")).sendKeys(brand);
//		driver.findElement(By.id("productTilte")).sendKeys(ptitle);
//
//		WebElement catagery = driver.findElement(By.id("category"));
//		catagery.click();
//		driver.findElement(By.xpath("//li[@data-value='men']")).click();

//		WebElement catageryType= driver.findElement(By.id("categoryType"));
//		catageryType.click();
//		driver.findElement(By.xpath("//li[@data-value='men-tshirt']")).click();
//		driver.findElement(By.id("offer")).sendKeys(offer);


//		driver.findElement(By.xpath(("(//input[@id='outlined-size-small'])[last()-1]"))).sendKeys(price);
//		driver.findElement(By.xpath(("(//input[@id='outlined-size-small'])[last()]"))).sendKeys(quantity);
//		driver.findElement(By.id("thumbnailImages")).sendKeys(tnailimagelink);
//		driver.findElement(By.id("description")).sendKeys(description);
//		driver.findElement(By.id("ProductImages")).sendKeys(pimagelink);
//		driver.findElement(By.xpath("(//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeLarge css-arnt9q'])[last()-1]")).click();
//
//		driver.findElement(By.id("searchTags")).sendKeys(searchtag);
//		driver.findElement(By.xpath("(//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeLarge css-arnt9q'])[last()]")).click();
//
//		driver.findElement(By.xpath("//button[@class='product_bn5__+KCz3']")).click();

		//String actualResult = driver.findElement(By.xpath("//li[text()='ProductName']")).getText();
		System.out.println(actualResult);
		

		if(actualResult.equals(expectedResult))
		{
			System.out.println("Product is added successfully");
			excelUtility.setDataToExcel(IConstantPath.EXCEL_PATH, SheetName.MERCHANT.getSheeCelltName(),2,11,"Test case pass");
		}
		else
		{

			System.out.println("Test case Fail");
		}

		driver.close();
		excelUtility.closeExcel();
		pFileUtility.ClosepropertyFile();

	}
}


