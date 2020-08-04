package Org.qsp.testgdemo;

import org.testng.annotations.Test;

public class demodependonmethod 
{
	@Test(dependsOnMethods="m2")
	public void m1()
	{
		System.out.println("hii1");	
	}
	@Test(dependsOnMethods="m3")
	public void m2()
	{
		System.out.println("hii2");
	}
	@Test
	public void m3()
	{
		System.out.println("hii3");
	}
}
