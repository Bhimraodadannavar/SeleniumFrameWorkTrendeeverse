package com.practice;

import org.testng.annotations.Test;

public class TestNG_practice4 {
	@Test(groups="sanity")
	public void test6()
	{
		System.out.println("Test4");
	}
	@Test(groups="sanity")
	public void test7()
	{
		System.out.println("Test5");
	}
	@Test(groups="reg")
	public void test8()
	{
		System.out.println("Test6");
	}



}
