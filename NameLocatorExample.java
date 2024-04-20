import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorExample {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement  username = driver.findElement(By.name("email"));
		username.sendKeys("gopi18@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("gopi123");
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
	}

}
