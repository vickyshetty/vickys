package com.ERP.master;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pomexee 
{
@Test
public void loexe()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://webapp.qedgetech.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	loginpage LP=PageFactory.initElements(driver, loginpage.class);
	LP.Admnlgn("admin", "master");
	Hpage HP=PageFactory.initElements(driver, Hpage.class);
	HP.links();
	
	
	
}
}
