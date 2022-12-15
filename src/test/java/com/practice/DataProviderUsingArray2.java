package com.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trendeverse.genericUtility.ExcelUtility;

public class DataProviderUsingArray2
{
	
	@Test(dataProvider = "getdata")
	public void getData(String Username, String Password)
	{
		System.out.println("Username===>"+Username+"Password====>"+Password);
	}
	
	@DataProvider
	public String[][] getdata() throws EncryptedDocumentException, IOException
	{
		ExcelUtility excelUtility= new ExcelUtility();
		excelUtility.openExcel();
		String[][] arr = excelUtility.getDataFromExcel("Sheet1");
		return arr;
		
	}
	

}
