package com.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridPractice 
{
	@Test
	public void test(String browser) throws MalformedURLException
	{
		URL url = new URL("http://192.168.0.203:4444/wd/hub");
		DesiredCapabilities dscp = new DesiredCapabilities();
		//dscp.setBrowserName("chrome");
		dscp.setPlatform(Platform.WINDOWS);
		
		if(browser.equals("chrome"))
		{
			dscp.setBrowserName("chrome");
		}
		else if(browser.equals("firefox"))
		{
			dscp.setBrowserName("firefox");
		}
	    WebDriver driver = new RemoteWebDriver(url, dscp);
	    driver.manage().window().maximize();
	    driver.get("http://rmgtestingserver/domain/");
		
	}

}
