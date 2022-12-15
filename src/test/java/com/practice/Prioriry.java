package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prioriry 
{
	@Test(priority=-1,description = "To short")
	public void  test1()
	{
		System.out.println("tes1");
	}
	@Test(dependsOnMethods = "test3",priority = -2)
	public void  test2()
	{
		System.out.println("tes2");
	}
	@Test
	public void  test3()
	{
		System.out.println("test3");
		//Assert.fail();
	}
	
	
	
}
