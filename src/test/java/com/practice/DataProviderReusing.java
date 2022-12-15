package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProviderReusing 
{
	@Test(dataProvider = "getData",dataProviderClass = DataProviderUsingArray2.class)
	public void getData()
	{
		Reporter.log("too good",true);
	}

}
