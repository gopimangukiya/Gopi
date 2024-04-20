import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Command {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1. to open the URL we can use to navigate.to method
		//navigate().to()->forward and backward both direction url open
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		
		//2.to refresh the page
		driver.navigate().refresh();
		
		
		//3.to redirect on one step back
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//4. to redirect on one step forword
		driver.navigate().forward();
		
	}

}
