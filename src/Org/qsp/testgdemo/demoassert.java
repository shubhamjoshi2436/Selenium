package Org.qsp.testgdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demoassert 
{
	@Test(dependsOnMethods="m2")
	public void m1()
	{
		System.out.println("hii1");	
	}
	@Test()
	public void m2()
	{
		System.out.println("hii2");
		Assert.fail();
		System.out.println("abhdcb");
	
	}
	@Test
	public void m3()
	{
		System.out.println("hii3");
	}
}
