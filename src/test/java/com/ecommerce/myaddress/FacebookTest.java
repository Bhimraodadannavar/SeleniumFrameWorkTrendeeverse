package com.ecommerce.myaddress;

import java.net.PasswordAuthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.trendeverse.genericUtility.WebDriverUtelity;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest 
{
	@Test
	public void loginFacebook()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		String url = System.getProperty("url");
		String username = System.getProperty("username");
	    String password = System.getProperty("password");
	    
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
