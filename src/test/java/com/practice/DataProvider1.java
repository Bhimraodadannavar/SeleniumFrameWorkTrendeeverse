package com.practice;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 
{
	@Test(dataProvider="getData")
	public void test1(String cityName,int Pincode)
	{
		System.out.println("city name----> "+cityName+"Pincode---->"+Pincode);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] arr= new Object[4][2];
		
		arr[0][0]="Belagavi";
		arr[0][1]=591237;
		
		
		arr[1][0]="Davangere";
		arr[1][1]=591238;
		
		arr[2][0]="Kodagu";
		arr[2][1]=591239;
		
		arr[3][0]="Chitradurga";
		arr[3][1]=591240;
		return arr;
}
	
	

}
