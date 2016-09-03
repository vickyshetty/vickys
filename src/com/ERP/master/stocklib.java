package com.ERP.master;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class stocklib {
	public WebDriver driver;
	public String expvalue="login";
	public String actvalue,pageact,supcrtact;
	public String hmpgtext="Dashboard";
	public String supcrt="suppliers";
	public static Properties pr ;
	public static FileInputStream fis;
		
	public String launch(String url) throws IOException
		{
		pr=new Properties();
		fis=new FileInputStream("D:\\vikrant\\ERPstockAccounting\\src\\com\\ERP\\properties\\Rep.properties");
		pr.load(fis);
	    driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		//launch validation
		actvalue=driver.findElement(By.xpath(pr.getProperty("login"))).getText();
		if(actvalue.equalsIgnoreCase(expvalue))
		{
			//System.out.println("launched successfully");
			return "successful launch";
		}
		
		else
		{
			//System.out.println("couldn't launched");
			return "unsuccessful launch";
		}}

	 public String login(String un,String pw)
		
		{
			
	    	driver.findElement(By.xpath(pr.getProperty("userclear"))).clear();
			driver.findElement(By.xpath(pr.getProperty("username"))).sendKeys(un);
			driver.findElement(By.xpath(pr.getProperty("passclear"))).clear();
			driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(pw);
			driver.findElement(By.xpath(pr.getProperty("login"))).click();
			pageact=driver.findElement(By.xpath(pr.getProperty("dashboard"))).getText();
			//login validation
			if(pageact.equalsIgnoreCase(hmpgtext))
			{
				return "login success";
			}
			else
			{
				return "login unsuccess";
			}
			
}
	 public void supplier_creation()
		{
			Actions action =new Actions(driver);
			WebElement sup=driver.findElement(By.xpath(pr.getProperty("supplier")));
			action.moveToElement(sup).click().perform();
			driver.findElement(By.xpath(pr.getProperty("add"))).click();
			supcrtact=driver.findElement(By.xpath(pr.getProperty("supver"))).getText();
			if(supcrtact.equalsIgnoreCase(supcrt))
			{
				System.out.println("able to create supplier");
			}
			else
			{
				System.out.println("couldn't able to create supplier");
			}
			driver.findElement(By.xpath(pr.getProperty("supname"))).sendKeys("mahadev chetty jewellers");
			driver.findElement(By.xpath(pr.getProperty("sadrr"))).sendKeys("basveshwar circle,humnabad");
			driver.findElement(By.xpath(pr.getProperty("city"))).sendKeys("humnabad");
			driver.findElement(By.xpath(pr.getProperty("country"))).sendKeys("hindustan");
			driver.findElement(By.xpath(pr.getProperty("cper"))).sendKeys("mahadev chetty");
			driver.findElement(By.xpath(pr.getProperty("phnno"))).sendKeys("08483271156");
			driver.findElement(By.xpath(pr.getProperty("email"))).sendKeys("chettyjewels@yahoo.com");
			driver.findElement(By.xpath(pr.getProperty("mobno"))).sendKeys("9008800979");
			driver.findElement(By.xpath(pr.getProperty("note"))).sendKeys("10g platinum,1kg gold");
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath(pr.getProperty("addbtn"))).click();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(pr.getProperty("ok"))).click();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(pr.getProperty("confirm"))).click();
       }
	 public void stock_category()
		{
			Actions action =new Actions(driver);
			WebElement sup=driver.findElement(By.xpath(pr.getProperty("stockitems")));
			action.moveToElement(sup).click().perform();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(pr.getProperty("stockcategory"))).click();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(pr.getProperty("stockadd"))).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("catname"))).sendKeys("braslets");
			driver.findElement(By.xpath(pr.getProperty("cataddbtn"))).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("catok"))).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("catconfirm"))).click();
			
			Sleeper.sleepTightInSeconds(3);
		}	 
	 public String uom(String uid,String umd)
		{
			Actions action =new Actions(driver);
			WebElement sup=driver.findElement(By.xpath(pr.getProperty("stockitems1")));
			action.moveToElement(sup).click().perform();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(pr.getProperty("uom"))).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("uomadd"))).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("uomid"))).sendKeys(uid);
			driver.findElement(By.xpath(pr.getProperty("uomdes"))).sendKeys(umd);
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("uomadd1"))).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("umook"))).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("umoconfirm"))).click();
			String unitexp="Unit of Measurement";
			String unitact=driver.findElement(By.xpath(".//*[@id='ewPageCaption']")).getText();
			if(unitexp.equalsIgnoreCase(unitact))
			{
				return "Success";
		
			
				}
			else
			{
				return "NotSuccess";
			}
		}
	 public void stock_items()
		{
			Actions action =new Actions(driver);
			WebElement sup=driver.findElement(By.xpath(pr.getProperty("stockitems2")));
			action.moveToElement(sup).click().perform();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(pr.getProperty("siadd"))).click();
			Sleeper.sleepTightInSeconds(3);
			Select category=new Select(driver.findElement(By.xpath(pr.getProperty("categ"))));
			category.selectByVisibleText("braslets");
			Select sname =new Select(driver.findElement(By.xpath(pr.getProperty("suname"))));
			sname.selectByVisibleText("mahadev chetty jewellers");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("stockname"))).sendKeys("golds");
			Select unit =new Select(driver.findElement(By.xpath(pr.getProperty("stockuom"))));
			unit.selectByVisibleText("sfsa1234");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("pclear"))).clear();
			driver.findElement(By.xpath(pr.getProperty("pur"))).sendKeys("150000");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("sclr"))).clear();
			driver.findElement(By.xpath(pr.getProperty("srate"))).sendKeys("200000");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("snotes"))).sendKeys("make it fast");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(pr.getProperty("ssadd"))).click();
			Sleeper.sleepTightInSeconds(3);
		   driver.findElement(By.xpath(pr.getProperty("sok"))).click();
		  Sleeper.sleepTightInSeconds(3);
		   driver.findElement(By.xpath(pr.getProperty("sconfirm"))).click();
		}

public void logout()
{
	driver.findElement(By.xpath(".//*[@id='logout']")).click();
}
public void closeapp()
{
driver.close();	
}
}