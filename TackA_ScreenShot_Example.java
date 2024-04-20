import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TackA_ScreenShot_Example {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		
		//firstly we are creating refrence of TackScreenshot interface
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//calling getscreenshot method to create image for fail test cases
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		//move the file into new destination folder
		File destFile = new File("/Users/ashish/Desktop/Gopi/Automation_Practicle/error.png");
		
		
		//we will copy the screenshot into destination folder
		Files.copy(srcFile, destFile);
		
		
	}

}
