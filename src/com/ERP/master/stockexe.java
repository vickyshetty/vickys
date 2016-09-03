package com.ERP.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class stockexe {

	
	public static void main(String[] args) throws IOException {
		stocklib methods =new stocklib();
		String launch_res=methods.launch("http://webapp.qedgetech.com");
		System.out.println(launch_res);
		String login_res=methods.login("admin","master");
		System.out.println("login_res");
		methods.supplier_creation();
		methods.stock_category();
		methods.uom("vicky3263","abc1213222");
		methods.stock_items();
		methods.logout();
		methods.closeapp();
		
		

	}
		
				    
	}


