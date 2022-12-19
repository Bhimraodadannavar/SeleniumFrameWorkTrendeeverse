package com.trendeverse.genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
/** 
 * this class contain java reusable method
 */
public class JavaUtility {

/**
 * this method is used to return the system date
 * @return
 */

	public String getSyatemDateAndTime()
	{
		 Date date = new Date();
		return date.toString();
	}
	/**
	 * this method will give system date with formate
	 * @return
	 */
	public String getSystemDateWithFormate()
	{
		 Date date = new Date();
		 String dateAndTime = date.toString();
		 
		 
		String YYYY = dateAndTime.split(" ")[5];
		String DD = dateAndTime.split(" ")[2];
		int MM = date.getMonth()+1;
		
		String finalFormate = YYYY +"-"+MM+"-"+DD;
		return finalFormate;
		 
	}
	/**
	 * This method is used to system date and time in dd_MM_YYYY_mm_sss
	 * @return 
	 */
	
	public String getDateTime()
	{
	 Date date=new Date();
	 SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_YYYY_mm_sss");
	String d = sdf.format(date);
	 return d;
	 
	}

}
