package com.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGClass
{
	@BeforeSuite
	public void suitesetUp()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void suiteTearDown()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeTest
	public void testSetUp()
	{
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void testTearDown()
	{
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void classSetUp()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void classtearDown()
	{
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void methodSEtUP()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void methodTearDown()
	{
		System.out.println("AfterMethod");
	}
	
	

}
