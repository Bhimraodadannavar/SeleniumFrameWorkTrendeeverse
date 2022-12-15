package com.trendeverse.genericUtility;

import com.aventstack.extentreports.ExtentTest;

public class ThreadSafe 
{
private static  ThreadLocal<WebDriverUtelity> webdriverUtility=new ThreadLocal<>();
public static WebDriverUtelity getwebdriverUtility() 
   {

	return webdriverUtility.get();
	
	}
public static void setWebdriverUtility(WebDriverUtelity swebdrUtelity) 
  {
	 webdriverUtility.set(swebdrUtelity);
	 
  }

//--------------------------------------------------------------------------------------------------
private static ThreadLocal<ExtentTest> extentTest=new ThreadLocal<>();
public static ExtentTest  getExtentTest()
  {
	return extentTest.get();
	
  }
public static void setExtentTest(ExtentTest sextentTest)
  {
	extentTest.set(sextentTest);
	
  }

}
