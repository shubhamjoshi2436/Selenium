package Default;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class urlAttribute 
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
		if (s.isMultiple()) 
		
			s.selectByValue(opts.get(1).getText());
			s.selectByValue(opts.get(3).getText());
		
			for (WebElement ele : opts) 
			{
				System.out.println(ele.getText());
				Thread.sleep(2000);
			}
	
		System.out.println("============");
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement selectedopts : all) 
		{
			
				System.out.println(selectedopts.getText());
		}	
	}

}
