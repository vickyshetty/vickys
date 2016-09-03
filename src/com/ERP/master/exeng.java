package com.ERP.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exeng extends baseNG
{
	@Test(dataProvider="udata")
 public void uom (String uid,String umd)
{
	methods.uom(uid,umd);
}
	@DataProvider
	public Object[][]udata()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="acb123";
		obj[0][1]="dpro41";
		
		obj[1][0]="xyz123";
		obj[1][1]="dpro42";
		
		obj[2][0]="pqr123";
		obj[2][1]="dpro43";
		
		return obj;
				
	}
}
