package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Priority1 
{
	@Test(dataProvider ="getData" )
	public void test5(String Name,int Pincode)
	{
		System.out.println("name====>"+Name+"pincode===>"+Pincode);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] arr= new Object[2][2];
		arr[0][0]="chikodi";
		arr[0][1]=591237;
		
		arr[1][0]="chikodi";
		arr[1][1]=591237;
		return arr;
		
		
		
		
	}

}
