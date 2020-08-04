package Org.qsp.testgdemo;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demoDataProvider 
{
	@DataProvider
	public String[][] getData()
	{
		String s[][]=new String[3][3];
		s[0][0]= "Admin1";
		s[0][1]= "Manager1";
		s[0][2]= "Admin@gmal.com";
		s[1][0]= "Admin2";
		s[1][1]= "Manager2";
		s[1][2]= "Admin@gmal.com";
		s[2][0]= "Admin3";
		s[2][1]= "Manager3";
		s[2][2]= "Admin@gmal.com";
		return s;
	}
	@Test(dataProvider="getData")
	public void fetch(String un,String pw,String em)
	{
		Reporter.log(un+"  "+pw+"  "+em,true);
	}
}
