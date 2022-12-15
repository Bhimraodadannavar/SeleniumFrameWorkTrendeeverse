package com.trendeverse.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods for property file
 * @author Lenovo
 *
 */

public class PFileUtility 
{
	
	private FileInputStream fis;
	private Properties p;

	/**
	 *This method is used to open the property file
	 * @throws IOException
	 */
	public void openproprtyfile() throws IOException
	{
		fis= new FileInputStream(IConstantPath.PROPERTY_FILE_PATH);
		p = new Properties();
		p.load(fis);
	}
	/**
	 * This method fetch the common data from the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromPropertyFile(String key) 
	{	
		String value = p.getProperty(key);
		return value;
	}
	/**
	 *This method is used t o close the property file
	 * @throws IOException
	 */
	
	public void ClosepropertyFile() 
	{
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
