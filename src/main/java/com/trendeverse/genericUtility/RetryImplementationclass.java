package com.trendeverse.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplementationclass implements IRetryAnalyzer
{
	int count=0;
	int retryLimit=3;
	
	public boolean retry(ITestResult result)//hold the result
	{
		if(count<retryLimit)
		{
			count++;
			return true;
		}
		return false;
	}
	

}
