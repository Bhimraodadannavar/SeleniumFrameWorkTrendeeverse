package com.trendeverse.genericUtility;

/**
 * This enum contains sheet name of Excel
 * @author Lenovo
 *
 */
public enum SheetName 
{
     MERCHANT("merchant"),ADDRESS("address"),WISHLIST("wishlist"),SHEET1("sheet1");
	
	private String shtName;
	//setter (constructor)
	private SheetName(String shtName)
	{
		this.shtName=shtName;
	}
	//getters
	public String getSheeCelltName()
	{
		return shtName.toString();
		
	}
}
