package com.ERP.master;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class paass {

	
	public static void main(String[] args) throws IOException
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\vikrant.s\\Desktop\\uom.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("uomdata");
		XSSFRow row;
		row=ws.getRow(1);
		row.createCell(2).setCellValue("pass");
		row=ws.getRow(2);
		row.createCell(2).setCellValue("fail");
		row=ws.getRow(3);
		row.createCell(2).setCellValue("pass");
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\vikrant.s\\Desktop\\uom.xlsx");
		wb.write(fo);
		wb.close();
	}

}
