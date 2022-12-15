package com.trendeverse.genericUtility;


/**
 * this enum class contains browswr, url, mail,password, and timeunit,
 */
public enum PropertyFileKeys
{
	BROWSER("browser"),URL("url"),MAIL("mail"),PASSWORD1("password1"),TIMEOUT("timeOut"),PASSWORD("password");
	
	private String keys;
	
	//setters
	private PropertyFileKeys(String Keys)
	{
		this.keys=Keys;
	}
	
	//getters
	public String convertToString()
	{
		return keys.toString();
	}
	

}
