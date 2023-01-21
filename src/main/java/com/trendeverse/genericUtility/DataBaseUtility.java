package com.trendeverse.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

public class DataBaseUtility 
{
	private Driver db;
	private Connection connect;
	private Statement state;
	private ResultSet result;

	/*
	 * This Method is used to open the Database
	 */
	public void openDataBaseConnection(String dbURL,String dbUSN, String dbPWD) throws SQLException
	{
		db = new Driver();

		DriverManager.registerDriver(db);

		connect = DriverManager.getConnection(dbURL,dbUSN,dbPWD);

	}

	/*
	 * This method is used to fetch the data from database
	 */
	public ArrayList<String> getDataFromDataBase(String query, String ColumnName) throws SQLException
	{

		state = connect.createStatement();

		result = state.executeQuery(query);

		ArrayList<String> list = new ArrayList<String>();

		while(result.next())
		{
			list.add(result.getString(ColumnName));
		}

		return list;
	}

	/*
	 * This method is used to close the Database
	 */
	public void closingDataBase() throws SQLException
	{

		connect.close();

	}

	/* 
	 * This method is used to modify the data in DataBse
	 */
	public void modifyTheInDatBase(String query ) throws SQLException
	{
		state = connect.createStatement();

		int result1 = state.executeUpdate(query);
	    
	}
	

	/*
	 * verify the Data present in Database 
	 */
	public boolean verifyTheDataInDatBase(String query, String columnname,String ExpectedData) throws SQLException
	{
		ArrayList<String> list1 = getDataFromDataBase( query,columnname);

		boolean flag = false;
		if(list1.contains(ExpectedData)) flag=true;
		return flag;
		
	}
}






