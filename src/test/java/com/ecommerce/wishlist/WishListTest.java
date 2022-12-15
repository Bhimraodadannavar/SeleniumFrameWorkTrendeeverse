package com.ecommerce.wishlist;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.trendeeverse.objectRepository.CartPage;
import com.trendeeverse.objectRepository.HomePage;
import com.trendeeverse.objectRepository.LoginPage;
import com.trendeeverse.objectRepository.PowerBankPage;
import com.trendeeverse.objectRepository.WishlistPage;
import com.trendeverse.genericUtility.BaseClass;
import com.trendeverse.genericUtility.ExcelUtility;
import com.trendeverse.genericUtility.IConstantPath;
import com.trendeverse.genericUtility.JavaUtility;
import com.trendeverse.genericUtility.PFileUtility;
import com.trendeverse.genericUtility.PropertyFileKeys;
import com.trendeverse.genericUtility.SheetName;
import com.trendeverse.genericUtility.WebDriverUtelity;

public class WishListTest extends BaseClass
{
	@Test
	public void AddingproductToTheWishList() throws InterruptedException, IOException
	{
		String expectedResult2="ubon pb x90 Power bank";

		//pom class object creation
		PowerBankPage powerBank= new PowerBankPage(driver);
		WishlistPage wishList= new WishlistPage(driver);

		String mail = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.MAIL.convertToString());
		String password = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD.convertToString());
		login.clickOnShopperLoginButton();
		login.loginActions(mail,password);
		home.waitUntilPageLoad(wu, timeOut);

		//mouse hover on Electronics
		home.moveToElement(wu, driver);
		home.clickOnPowerBank();

		//mouse hover back on Electronics
		powerBank.mouseOverOnElectronics(wu, driver);
		powerBank.clickOnWishListIcon();
		Thread.sleep(6000);
		home.clickOnAccuntSettings();
		home.clickOnWishListButton();
		
		String actaulResult = wishList.gettextofTheProduct();
		Assert.assertTrue(actaulResult.contains(expectedResult2));
		System.out.println("Product is added successfully");
		excelUtility.setDataToExcel(IConstantPath.EXCEL_PATH, SheetName.WISHLIST.getSheeCelltName(), 2, 7, "Test Case Pass");
//		if(expectedResult2.equals(actaulResult))
//		{
//			System.out.println("Product is added successfully");
//			excelUtility.setDataToExcel(IConstantPath.EXCEL_PATH, SheetName.WISHLIST.getSheeCelltName(), 2, 7, "Test Case Pass");
//		}
//		else
//		{
//			System.out.println("Testcase Fail");
//		}

		wu.closeBrowser(excelUtility, pFileUtility);
	}
}
