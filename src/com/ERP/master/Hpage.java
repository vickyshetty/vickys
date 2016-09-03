package com.ERP.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hpage
{
@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
WebElement supplier;
@FindBy(xpath=".//*[@id='mi_a_purchases']/a")
WebElement purchaser;
@FindBy(xpath=".//*[@id='mi_a_customers']/a")
WebElement customers;
@FindBy(xpath=".//*[@id='mi_a_sales']/a")
WebElement sales;

 public void links()
{
	supplier.click();
	purchaser.click();
	customers.click();
	sales.click();
	

}

}
