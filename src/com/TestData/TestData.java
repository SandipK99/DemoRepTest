package com.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData
{
	public File src;
	public  FileInputStream fis;
	public  XSSFWorkbook wb;
	public  XSSFSheet sheet;
	public  Row r;
	public int rownum;
	
	public TestData(String path) throws IOException
	{
		src = new File(path);
		
		fis = new FileInputStream(src);

		wb = new XSSFWorkbook(fis);

		sheet = wb.getSheet("Sheet1");
	}
	
	
	public  String getStringData(int row, int col) throws IOException
	{			
		Row r = sheet.getRow(row);

		String	f_name = r.getCell(col).getStringCellValue();


		return f_name;

	}

	public  String getNumericData(int row, int col) throws IOException
	{
		r = sheet.getRow(row);

		double d = r.getCell(col).getNumericCellValue();		
		long l = (long) d;		
		String	ph_num = Long.toString(l);

		return ph_num;
	}
	
	public int getLastRowNumber()
	{
		rownum = sheet.getLastRowNum();
		
		return rownum;
	}

}
