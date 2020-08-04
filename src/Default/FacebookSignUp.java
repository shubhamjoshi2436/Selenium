package Default;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(2000);
		Select s=new Select(day);
		s.selectByValue("15");
		Thread.sleep(2000);
		Select s1=new Select(month);
		s1.selectByVisibleText("Sept");
		Thread.sleep(2000);
		Select s2=new Select(year);
		//s2.selectByIndex(26);
		s2.selectByValue("1995");
		System.out.println("==============================");
		List<WebElement> dayoptoptions = s.getOptions();
		for (WebElement days : dayoptoptions) 
		{
			System.out.println(days.getText());
		}
	
	}

}
