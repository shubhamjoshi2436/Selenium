package Default;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("======>"+driver.getTitle());
		//driver.close();
		System.out.println("the current url is ===>>"+driver.getCurrentUrl());
		
		
		driver.quit();
		
		
		
		
	}

}
