package com.ERP.master;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class loginpage 
{
@FindBy(id="username")
WebElement uname;

@FindBy(id="password")
WebElement pwd;

@FindBy(id="btnsubmit")
WebElement login;

@FindBy(id="btnreset")
WebElement reset;

public void Admnlgn(String un,String pswd)
{
	reset.click();
	uname.sendKeys(un);
	pwd.sendKeys(pswd);
	login.click();
	
}

}
