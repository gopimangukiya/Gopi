import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToOpenUrl {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1. by using driver.get method
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		//2. by using navigate method
		driver.navigate().to("https://demo.guru99.com/test/facebook.html");
		
		
		driver.close();


	}

}
