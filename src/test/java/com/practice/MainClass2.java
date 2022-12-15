package com.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainClass2 {
	@AfterMethod
	public void  test6()
	{
		System.out.println("aftermethod2");
	}
	@BeforeSuite
	public void test10()
	{
		System.out.println("Beforesuite2");
	}
	
	@BeforeTest
	public void test2()
	{
		System.out.println("beforeTest2");
	}
	
	@BeforeClass
	public void test3()
	{
		System.out.println("Befoeclass2");
	}
	@AfterSuite
	public void test14()
	{
		System.out.println("after suite2");
	}
	
	@BeforeMethod
	public void test4()
	{
		System.out.println("BeforeMethod2");
	}
	@Test
	public void test5()
	{
		System.out.println("Test2");
	}
	
	@AfterClass
	public void test7()
	{
		System.out.println("afterclass2");
	}
	@AfterTest
	public void test15()
	{
		System.out.println("after test2");
	}
	

}
