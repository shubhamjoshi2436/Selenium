package Org.qsp.testgdemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertDemo 
{
	@Test
	public void m1()
	{
		String aName="shubham";
		String eName="shubham";
		Assert.assertEquals(aName,	 eName);
		System.out.println("matched");
		List<String> lst1=new ArrayList<String>();
		lst1.add("abc");
		lst1.add("admin");
		lst1.add("xyz");
		List<String> lst2=new ArrayList<String>();
		lst2.add("abc");
		lst2.add("admin");
		lst2.add("xyz");
		Assert.assertEquals(lst1, lst2);
		System.out.println("list is matched");
		
		
		
		
	}
	
	
	
}
