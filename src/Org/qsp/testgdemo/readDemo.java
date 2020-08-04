package Org.qsp.testgdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class readDemo 
{
	@Test(dataProviderClass=readData.class,dataProvider="getData")
	public void fetch(String un,String pw)
	{
		Reporter.log(un+ "  "+pw,true);
	}
}
