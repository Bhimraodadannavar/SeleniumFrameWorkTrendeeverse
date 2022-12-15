package com.practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.trendeverse.genericUtility.BaseClass;

@Listeners(com.trendeverse.genericUtility.ListenerImplementationClass.class)
public class SampleTest extends BaseClass

{
	@Test
	public void hi()
	{
		System.out.println("==========Test Start=======");
		Assert.assertEquals(false, true);
		System.out.println("===========Test End ==========");
	}
	

}
