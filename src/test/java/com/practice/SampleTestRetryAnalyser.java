package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestRetryAnalyser
{
	@Test(retryAnalyzer = com.trendeverse.genericUtility.RetryImplementationclass.class)
	public void reRun()
	{
		Assert.assertEquals("A", "B");
	}

}
