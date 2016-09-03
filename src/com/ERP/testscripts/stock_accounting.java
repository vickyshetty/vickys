package com.ERP.testscripts;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
public class stock_accounting {
	WebDriver driver;
	String expvalue="login";
	String actvalue,pageact,supcrtact;
	String hmpgtext="Dashboard";
	String supcrt="suppliers";
	public void launch()
	{
	    driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://webapp.qedgetech.com/login.php");
		driver.manage().window().maximize();
		//launch validation
		actvalue=driver.findElement(By.xpath(".//*[@id='btnsubmit']")).getText();
		if(actvalue.equalsIgnoreCase(expvalue))
		{
			System.out.println("launched successfully");
		}
		
		else
		{
			System.out.println("couldn't launched");
		}}
	    public void login()
		
		{
			
	    	driver.findElement(By.xpath(".//*[@id='username']")).clear();
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(Keys.DOWN,"admin",Keys.UP);
			driver.findElement(By.xpath(".//*[@id='password']")).clear();
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(Keys.DOWN,"master",Keys.UP);
			driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
			pageact=driver.findElement(By.xpath(".//*[@id='mi_dashboard_php']/a")).getText();
			//login validation
			if(pageact.equalsIgnoreCase(hmpgtext))
			{
				System.out.println("login success");
			}
			else
			{
				System.out.println("login failure");
			}}
		public void supplier_creation()
		{
			Actions action =new Actions(driver);
			WebElement sup=driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a"));
			action.moveToElement(sup).click().perform();
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			supcrtact=driver.findElement(By.xpath(".//*[@id='ewPageCaption']")).getText();
			if(supcrtact.equalsIgnoreCase(supcrt))
			{
				System.out.println("able to create supplier");
			}
			else
			{
				System.out.println("couldn't able to create supplier");
			}
			driver.findElement(By.xpath(".//*[@id='x_Supplier_Name']")).sendKeys("mahadev chetty jewellers");
			driver.findElement(By.xpath(".//*[@id='x_Address']")).sendKeys("basveshwar circle,humnabad");
			driver.findElement(By.xpath(".//*[@id='x_City']")).sendKeys("humnabad");
			driver.findElement(By.xpath(".//*[@id='x_Country']")).sendKeys("hindustan");
			driver.findElement(By.xpath(".//*[@id='x_Contact_Person']")).sendKeys("mahadev chetty");
			driver.findElement(By.xpath(".//*[@id='x_Phone_Number']")).sendKeys("08483271156");
			driver.findElement(By.xpath(".//*[@id='x__Email']")).sendKeys("chettyjewels@yahoo.com");
			driver.findElement(By.xpath(".//*[@id='x_Mobile_Number']")).sendKeys("9008800979");
			driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys("10g platinum,1kg gold");
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
          }
		public void stock_category()
		{
			Actions action =new Actions(driver);
			WebElement sup=driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"));
			action.moveToElement(sup).click().perform();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys("braslets");
			driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			
			Sleeper.sleepTightInSeconds(3);
		}
		public void uom()
		{
			Actions action =new Actions(driver);
			WebElement sup=driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"));
			action.moveToElement(sup).click().perform();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='x_UOM_ID']")).sendKeys("sfsa1234");
			driver.findElement(By.xpath(".//*[@id='x_UOM_Description']")).sendKeys("dfsedfb");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		}
		public void stock_items()
		{
			Actions action =new Actions(driver);
			WebElement sup=driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"));
			action.moveToElement(sup).click().perform();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			Sleeper.sleepTightInSeconds(3);
			Select category=new Select(driver.findElement(By.xpath(".//*[@id='x_Category']")));
			category.selectByVisibleText("braslets");
			Select sname =new Select(driver.findElement(By.xpath(".//*[@id='x_Supplier_Number']")));
			sname.selectByVisibleText("mahadev chetty jewellers");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='x_Stock_Name']")).sendKeys("golds");
			Select unit =new Select(driver.findElement(By.xpath(".//*[@id='x_Unit_Of_Measurement']")));
			unit.selectByVisibleText("sfsa1234");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='x_Purchasing_Price']")).clear();
			driver.findElement(By.xpath(".//*[@id='x_Purchasing_Price']")).sendKeys("150000");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='x_Purchasing_Price']")).clear();
			driver.findElement(By.xpath(".//*[@id='x_Selling_Price']")).sendKeys("200000");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys("make it fast");
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
			Sleeper.sleepTightInSeconds(3);
		   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		  Sleeper.sleepTightInSeconds(3);
		   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		}
		
		public static void main(String[] args) {
		
			stock_accounting ERP=new stock_accounting ();
		 ERP.launch();
		 ERP.login();
		 ERP.supplier_creation();
         ERP.stock_category();
         ERP.uom();
         ERP.stock_items();
}}
