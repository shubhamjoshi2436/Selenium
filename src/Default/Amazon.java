package Default;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("sneakers shoes for men",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/div[1]/div[1]/a[1]/div[1]/img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='native_dropdown_selected_size_name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now-button']"));
	}

}
