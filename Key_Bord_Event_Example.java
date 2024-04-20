import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Bord_Event_Example {

	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		Actions action = new Actions(driver);
		//1. keydown method - it will press rhe kry and does not release
		action.keyDown(un,Keys.SHIFT).sendKeys("gopika").perform();
		action.keyDown(password,Keys.SHIFT).sendKeys("gopi123").perform();
		
		
		action.keyDown(Keys.ENTER).perform();
	}

}
