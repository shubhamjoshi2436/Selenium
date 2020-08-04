package Default;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DselectDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shubham/Desktop/HtmlDemo/select.html");
		Thread.sleep(2000);
		WebElement id = driver.findElement(By.id("b"));
		Select s=new Select(id);
		List<WebElement> opts = s.getOptions();
		if(s.isMultiple())
		
			for (WebElement opt : opts) 
			{
				System.out.println(opt.getText());
				Thread.sleep(2000);
			}
			//s.deselectAll();
		for (WebElement opt : opts) 
		{
			s.deselectByVisibleText(opt.getText());
			Thread.sleep(2000);
		}		
	}

}
