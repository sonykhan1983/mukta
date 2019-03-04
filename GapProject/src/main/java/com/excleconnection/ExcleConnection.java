package com.excleconnection;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcleConnection {
public static void main(String[] args) throws Throwable {
	

	FileInputStream fls = new FileInputStream("./Folder/AppDatas.xlsx");
	Workbook wb = WorkbookFactory.create(fls);
	Sheet s = wb.getSheet("sheet1");
	String value =s.getRow(2).getCell(0).getStringCellValue();
	System.out.println(value);
	
}
}