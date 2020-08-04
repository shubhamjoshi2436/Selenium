package Default;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shubham/Desktop/HtmlDemo/select.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
		Select s=new Select(ele);
		List<WebElement> opts = s.getOptions();
		if (s.isMultiple()) 
		{
			for (WebElement mul : opts) 
			{
					s.selectByValue(mul.getText());
					Thread.sleep(2000);
			}
		}
	}
}


