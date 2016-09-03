package com.ERP.jars;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gg {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		

		File screenshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("d:\\screenshot124.jpg"));
		

	}

}
