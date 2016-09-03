package com.ERP.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class uomnotepad {

	
	public static void main(String[] args) throws IOException
	{
		stocklib methods =new stocklib();
		String launch_res=methods.launch("http://webapp.qedgetech.com");
		System.out.println(launch_res);
		String login_res=methods.login("admin","master");
		System.out.println("login_res");
		String notepadpath="D:\\vikrant\\ERPstockAccounting\\src\\com\\ERP\\Testdata\\uom.txt";
		String notepadpathres="D:\\vikrant\\ERPstockAccounting\\src\\com\\ERP\\results\\Uomres.txt";
		FileReader Fr=new FileReader(notepadpath);
        BufferedReader Br=new BufferedReader(Fr);
        String Sread=Br.readLine();
        System.out.println(Sread);
        FileWriter Fw=new FileWriter(notepadpathres);
        BufferedWriter Bw=new BufferedWriter(Fw);
        Bw.write(Sread+"%%%"+"Results");
        Bw.newLine();
        String dd;
        while((dd=Br.readLine())!=null)
        {
        	String [] hh=dd.split("###");
        	System.out.println(hh);
        	String res=methods.uom("vicky3263","abc1213222");
        	System.out.println(res);
        	Bw.write(res);
        	Bw.newLine();
        }
       
        	       		
				
	
        Bw.close();
    	Br.close();
    			

}}