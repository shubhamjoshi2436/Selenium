package Default;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		//List<WebElement> sugg = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		//for (WebElement suggname : sugg) 
		//{
			//System.out.println(suggname.getText());
		//}
			//sugg.get(2).click();
		List<WebElement> hading = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		for (WebElement headers : hading) 
		{
				System.out.println(headers.getText());
		}
}
}