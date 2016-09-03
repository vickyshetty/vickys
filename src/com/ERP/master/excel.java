package com.ERP.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	
	public static void main(String[] args) throws IOException 
	{
		stocklib methods =new stocklib();
		String launch_res=methods.launch("http://webapp.qedgetech.com");
		System.out.println(launch_res);
		String login_res=methods.login("admin","master");
		System.out.println("login_res");
		
		FileInputStream fis=new FileInputStream("D:\\vikrant\\ERPstockAccounting\\src\\com\\ERP\\Testdata\\uom.xlsx");
		  
		  
		  
	    XSSFWorkbook WB=new XSSFWorkbook(fis);
	     XSSFSheet WS=WB.getSheet("Uomdata");
	    int Rc=WS.getLastRowNum();
	    System.out.println(Rc);
	    
	        for (int i = 1; i <=Rc; i++)
	        {
	        	XSSFRow WR=WS.getRow(i);
	    	    XSSFCell WC=WR.getCell(0);
	    	    XSSFCell WC1=WR.getCell(1);
	    	    XSSFCell WC2=WR.createCell(2);
	    	    String Uid=WC.getStringCellValue();
	    	    String umd=WC1.getStringCellValue();
	    	    
	    	String con = methods.uom(Uid,umd);
	    	    
	    	  System.out.println(con);
	           WC2.setCellValue(con);
	            
	        }	
	        FileOutputStream Fos=new FileOutputStream("D:\\vikrant\\ERPstockAccounting\\src\\com\\ERP\\results\\uomres.xlsx");
		    WB.write(Fos);
		    WB.close();
		    

	}

}
