import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkkTextAndPartialLinkTextExample {

	public static void main(String[] args) {
		

        System.setProperty("Webdriver.chrome.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//WebElement forgot = driver.findElement(By.linkText("Forgot your password?"));
		//forgot.click();
		
		WebElement forgot = driver.findElement(By.partialLinkText("password?"));
		forgot.click();
		
		

	}

}
