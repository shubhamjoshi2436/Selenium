package Default;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	//	WebElement ele = driver.findElement(By.id("email"));
	//	ele.sendKeys("shubham joshi");
	//	WebElement pass = driver.findElement(By.name("pass"));
	//	pass.sendKeys("12345646");
	//	WebElement login = driver.findElement(By.id("loginbutton"));
	//			login.click();
		// driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("shubham",Keys.ENTER);
		// driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("1231",Keys.ENTER);
		WebElement text = driver.findElement(By.xpath("//label[@for='email']"));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(text.getText());;
		WebElement password = driver.findElement(By.xpath("//label[@for='pass']"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password.getText(),Keys.ENTER);
	}

}
