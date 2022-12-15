package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchTheDatafromPropertyfile 
{
		public static void main(String[] args) throws IOException 
		{
			//Step1--> create an object for fileinput stream-->convert from physical file into java redable file
			FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
			//step2--->create an object for properties
			Properties p = new Properties();
			//Step3--->load all keys
			p.load(fis);
			//Step4--->fetch the data from property file
			System.out.println(p.getProperty("url"));
		}
			

}
