package FlipkartScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class getscreen 
{
	public static void take(String name,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File screenshotsave = new File("./Screenshot/"+ name + ".png");
		Files.copy(screenshot, screenshotsave);
	}
}
