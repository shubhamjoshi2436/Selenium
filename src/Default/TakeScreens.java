package Default;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class TakeScreens 
{

		public static void take(String name,WebDriver driver) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			File screenshotsave = new File("./Screenshot/"+ name + ".png");
			Files.copy(screenshot, screenshotsave);
		}
}

