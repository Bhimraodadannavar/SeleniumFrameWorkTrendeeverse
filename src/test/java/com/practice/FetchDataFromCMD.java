package com.practice;

import org.testng.annotations.Test;

public class FetchDataFromCMD 
{
	@Test
	public void test()
	{
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		System.out.println();
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
