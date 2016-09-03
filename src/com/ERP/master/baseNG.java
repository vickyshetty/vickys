package com.ERP.master;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class baseNG {
	
	
   @BeforeTest
  public void beforeTest()
  {
	 methods.login("admin", "master");
	 
  }

  @AfterTest
  public void afterTest() 
  {
	  methods.logout();
  }
  public  stocklib methods =new stocklib();
  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  methods.launch("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  methods.closeapp();
  }

}
