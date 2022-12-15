package com.ecommerse.merchantlogin1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.trendeeverse.objectRepository.AddProductsPage;
import com.trendeeverse.objectRepository.ProductListpage;
import com.trendeverse.genericUtility.BaseClass;
import com.trendeverse.genericUtility.IConstantPath;
import com.trendeverse.genericUtility.PropertyFileKeys;
import com.trendeverse.genericUtility.SheetName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MerchantLoginTest extends BaseClass
{
	@Test
	public void MerchantAddingProduct() throws IOException
	{

		String expectedResult = "1: ProductName";

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

		//POM class object creation 

		ProductListpage product= new ProductListpage(driver);
		AddProductsPage addProductPage= new AddProductsPage(driver);

		String mail = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.MAIL.convertToString());
		String password1 = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD1.convertToString());
		login.clickOnMerchantButtn();
		login.loginActions(mail, password1);


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
		//System.out.println(actualResult);
		Assert.assertTrue(actualResult.contains(expectedResult));
		System.out.println("Product is added successfully");
		excelUtility.setDataToExcel(IConstantPath.EXCEL_PATH, SheetName.MERCHANT.getSheeCelltName(),2,11,"Test case pass");

		//		if(actualResult.equals(expectedResult))
		//		{
		//			System.out.println("Product is added successfully");
		//			excelUtility.setDataToExcel(IConstantPath.EXCEL_PATH, SheetName.MERCHANT.getSheeCelltName(),2,11,"Test case pass");
		//		}
		//		else
		//		{
		//			System.out.println("Test case Fail");
		//		}
		wu.closeBrowser(excelUtility, pFileUtility);

	}

}
