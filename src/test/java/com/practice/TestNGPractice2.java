package com.practice;

import org.testng.annotations.Test;

public class TestNGPractice2
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
