import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorsExemple {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement  username = driver.findElement(By.className("inputtext"));
		username.sendKeys("gopipatel18@gmail.com");
		
		WebElement password = driver.findElement(By.className("inputtext"));
		username.sendKeys("gopi123");
		

	}

}
