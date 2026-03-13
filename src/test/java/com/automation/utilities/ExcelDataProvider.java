package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static void main(String[] args) throws IOException {
	String excelpath=System.getProperty("user.dir")+"\\files\\employees.xlxs";
	File excelfile= new File(excelpath);
	FileInputStream fis= new FileInputStream(excelfile);
	
	XSSFWorkbook workbook= new XSSFWorkbook(fis);
	   XSSFSheet sheet =workbook.getSheet("one");
	   
	 int row= sheet.getLastRowNum();
	int cols= sheet.getRow(1).getLastCellNum();
	
	for(int r=0;r<row;r++)
	{
//	XSSFRow 	row =sheet.getRow(r);
//		
		
		
		
		
	}
	 
	
}
}