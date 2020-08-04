package Default;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartjavascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(800,0)");
		//Thread.sleep(2000);
		//js.executeScript("window.scrollBy(-400,0)");
		//Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollWidth)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollWidth)");

		
	
	
	
	}

}
