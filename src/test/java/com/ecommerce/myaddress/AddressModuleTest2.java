package com.ecommerce.myaddress;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.trendeeverse.objectRepository.AddressFormPage;
import com.trendeeverse.objectRepository.MyAddressesPage;
import com.trendeeverse.objectRepository.MyProfilePage;
import com.trendeverse.genericUtility.BaseClass;
import com.trendeverse.genericUtility.IConstantPath;
import com.trendeverse.genericUtility.PropertyFileKeys;
import com.trendeverse.genericUtility.SheetName;

public class AddressModuleTest2 extends BaseClass
{
	@Test(groups= "sanity")
	public void UserAddingAddress() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		String expectedResult = "Aishwarya";

		//read the data from excel
		String name=excelUtility.getDataFromExcel( SheetName.ADDRESS.getSheeCelltName(),1,1);
		String houseinfo=excelUtility.getDataFromExcel(SheetName.ADDRESS.getSheeCelltName(),2,2);
		String streetinfo=excelUtility.getDataFromExcel( SheetName.ADDRESS.getSheeCelltName(),2,3);
		String landmark=excelUtility.getDataFromExcel( SheetName.ADDRESS.getSheeCelltName(),2,4);
		String pincode=excelUtility.getDataFromExcel(SheetName.ADDRESS.getSheeCelltName(),2,5);
		String phoneno=excelUtility.getDataFromExcel( SheetName.ADDRESS.getSheeCelltName(),2,6);


		//POM class Object Creation

		MyProfilePage myProffile=new MyProfilePage(driver);
		MyAddressesPage myAddresses=new MyAddressesPage(driver);
		AddressFormPage addressForm= new AddressFormPage(driver);

		String mail = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.MAIL.convertToString());
		String password = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD.convertToString());
		login.clickOnShopperLoginButton();
		login.loginActions(mail,password);


		home.waitUntilPageLoad(wu, timeOut);
		Thread.sleep(8000);
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

//		String actualResult = myAddresses.getTextaddressNametext();
//		System.out.println(actualResult);
//		Assert.assertTrue(expectedResult.contains(actualResult));
//		System.out.println("address added successfully");
//		excelUtility.setDataToExcel(IConstantPath.EXCEL_PATH, SheetName.ADDRESS.getSheeCelltName(),2,7,"Test case pass");
//   
	}


}
