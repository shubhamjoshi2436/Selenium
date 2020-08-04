package Default;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeScenario {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
		driver.findElement(By.xpath("//span[contains(.,'Create Chart')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='addToDashboard']")).click();
		driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("chart123");
		driver.findElement(By.xpath("//td[@class='saveNewConfigButton greyButton']/div[@class='buttonIcon']/span[contains(.,'Save')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("closeCreateChartLightboxButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		Thread.sleep(2000);
		driver.quit();	
	}
}
