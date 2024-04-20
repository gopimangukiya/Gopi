import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		//Scroll Down method
		js.executeScript("window.scrollBy(0,500)");
		
		
		//Scroll up method
		js.executeScript("window.scrollBy(0,-500)");
		
	
		
	}

}
