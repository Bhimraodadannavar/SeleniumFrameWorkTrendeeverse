package com.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert 
{
	@Test
	public void test1()
	{
		String s="Bhim";
		Assert.assertEquals("Bhim", "Bhi");

		SoftAssert softHard= new SoftAssert();
		softHard.assertEquals("Bhim", "Bhim");
		Reporter.log("So sexy haa",true);
		//softHard.assertAll();
		
		System.out.println("So Smart haaa");
		softHard.assertAll();
	}

}
