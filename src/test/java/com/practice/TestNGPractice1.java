package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGPractice1 
{
	
	@Test(groups="Sanity")
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups="Reg")
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups="Smoke")
	public void test3()
	{
		System.out.println("test3");
	}
}
	
	
	
	
