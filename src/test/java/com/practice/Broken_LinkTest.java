package com.practice;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.trendeverse.genericUtility.ExcelUtility;
import com.trendeverse.genericUtility.WebDriverUtelity;



public class Broken_LinkTest 
{
	public static void main(String[] args) throws IOException 
	{

		WebDriverUtelity wu= new WebDriverUtelity();
		WebDriver driver=wu.launchApplication("chrome", 10, "http://flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		List<WebElement> listOflinks = driver.findElements(By.xpath("//a"));
		for(int i=0; i<listOflinks.size();i++)
		{
			String url = listOflinks.get(i).getAttribute("href");
			System.out.println(url);
			try {
				
				URL u = new URL(url);
				URLConnection urlConnection = u.openConnection();
				HttpsURLConnection httpConnection = (HttpsURLConnection)urlConnection;
				int statuscode = httpConnection.getResponseCode();
				ExcelUtility excelUtility= new ExcelUtility();
				excelUtility.writemultipleData("./src/test/resources/Broken_URL.xlsx", "Broken_Links", i, url, statuscode);

				if(statuscode!=200)
				{

					System.out.println(" links=====>"+url+"======>"+httpConnection.getResponseMessage()+"Response code is "+httpConnection.getResponseCode());
				}

			}
			catch(Exception e)
			{
				System.out.println("something wrong with the url"+url);
			}

		}

	}


}
