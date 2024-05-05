package com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * stored multiple data by using excel 
 * @author avsukesh
 * 
 */
public class ListnerImplementation {

	
	public String loginData(String sheet,int row,int cell) throws InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("/Users/avsukesh/Downloads/Notes/Notes.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
		return data;
		
		
	}
}
