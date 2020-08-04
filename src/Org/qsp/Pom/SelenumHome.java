package Org.qsp.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class SelenumHome 
{
		@FindBy(name="search")
		private WebElement search;
		@FindBy(xpath="//img[@class='search-icon']")
		private WebElement searchbtn;
		
		
		public SelenumHome(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		public void sendText(String text)
		{
			search.sendKeys(text,Keys.ENTER);
		}
		public void buttonclick()
		{
			searchbtn.click();
		}
		
}
