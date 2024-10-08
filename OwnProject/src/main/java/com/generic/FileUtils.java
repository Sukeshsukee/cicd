package com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * stored multiple data by using excel 
 * @author avsukesh
 * 
 */
public class FileUtils {

	
	public String loginData(String sheet,int row,int cell) throws InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("/Users/avsukesh/Downloads/DataProvider_UserLogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
		return data;
	}
	
	public int row(String sheet) throws InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("/Users/avsukesh/Downloads/DataProvider_UserLogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetnum = wb.getSheet(sheet);
		int rowcount = sheetnum.getLastRowNum();
		
		return rowcount;
		
		
		
	}
	public int cell(String sheet) throws InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("/Users/avsukesh/Downloads/DataProvider_UserLogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetnum = wb.getSheet(sheet);
		int rownum = sheetnum.getLastRowNum();
		int cellcount = sheetnum.getRow(rownum).getLastCellNum();
		
		return cellcount;
		
		
		
		
	}
}
