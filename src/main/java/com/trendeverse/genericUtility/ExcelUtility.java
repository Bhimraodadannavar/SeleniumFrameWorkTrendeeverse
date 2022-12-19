package com.trendeverse.genericUtility;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.protobuf.Message;

/** 
 * This class contains excel reusable methods
 * @author Lenovo
 *
 */

public class ExcelUtility
{
	private Workbook book;
	private  FileInputStream fisexcel;
	private DataFormatter df;
	/**
	 * This method is used to open the excel sheet
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public void openExcel() throws EncryptedDocumentException, IOException
	{

		 FileInputStream fisexcel = new FileInputStream(IConstantPath.EXCEL_PATH);
		book= WorkbookFactory.create(fisexcel);
	}
	
	/**
	 * This method is used to get the Data from the Excel

	 * @param sheetName
	 * @param RowNumber
	 * @param cellNumber
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcel( String sheetName, int RowNumber,int cellNumber) 
	{
		Sheet shee = book.getSheet(sheetName);
		Row row = shee.getRow(RowNumber);
		Cell cel = row.getCell(cellNumber);
		df= new DataFormatter();
		String data = df.formatCellValue(cel);
		return data;
	}
	
	/**
	 * This method is used to set the into the excel
	 * @param excelPath
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @param message
	 * @throws IOException
	 */
	public void setDataToExcel( String excelPath, String sheetName,int rowNumber,int cellNumber,String message) throws IOException 
	{
		Sheet shee = book.getSheet(sheetName);
		Row row = shee.getRow(rowNumber);
		Cell cel = row.getCell(cellNumber);
		cel.setCellValue(message);
		FileOutputStream fos = new FileOutputStream(excelPath);
		book.write(fos);
	}


	/**
	 * This method is used to close the excel sheet
	 * @throws IOException 
	 */
	public void closeExcel() throws IOException
	{

		book.close();
		fisexcel.close();


	}
	/**
	 * This method is used to fetch the data from Excel using Dataprovider
	 * @param sheetName
	 * @return
	 */

	public String[][] getDataFromExcel(String sheetName)
	{
		Sheet shee = book.getSheet(sheetName);
		int lastRowNumber = shee.getLastRowNum();//return index
		short lastcellNumber = shee.getRow(0).getLastCellNum();//return size
		df= new DataFormatter();
		String[][] arr= new String[lastRowNumber][lastcellNumber];
		for(int i=0; i<=lastRowNumber;i++)
		{
			for(int j=0;j<lastcellNumber;j++)
			{
				arr[i][j]=df.formatCellValue(shee.getRow(i+1).getCell(j));
			}
		}
		return arr;

	}

}
