package Default;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String source=driver.getPageSource();
		System.out.println("Page source is === >>>>"+source);
		String title = driver.getTitle();
		System.out.println("Title of page is == > > "+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL====>>"+url);
	}

}
