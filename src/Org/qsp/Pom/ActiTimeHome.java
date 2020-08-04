package Org.qsp.Pom;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHome 
{
	@FindBy(xpath="//input[@id='username']")
	WebElement uname;
	@FindBy(xpath="//input[@name='pwd']")
	WebElement passwd;
	@FindBy(id="loginButton")
	WebElement loginbutn;
	@FindBy(id="logoutLink")
	WebElement logoutbtn;
	public ActiTimeHome(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void sendUname(String username)
	{
		uname.sendKeys(username);
	}
	public void sendPassword(String password)
	{
		passwd.sendKeys(password);
	}
	public void clickLogin()
	{
		loginbutn.click();
	
	}
	public void clickLogout()
	{
		logoutbtn.click();
	}
	
	
}
