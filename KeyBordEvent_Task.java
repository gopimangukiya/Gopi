import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBordEvent_Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement current = driver.findElement(By.id("currentAddress"));
		WebElement permanent = driver.findElement(By.id("permanentAddress"));
		
		Actions action = new Actions(driver);
		
		//enter the value in current address tab
		current.sendKeys("pune");
		
		//we will select the all the value from current address
		action.keyDown(Keys.COMMAND);
		action.sendKeys("a");
		
		//keyup methos- will use to release the given key
		action.keyUp(Keys.COMMAND);
		action.build().perform();
		
		
		//now we will copy the entire address
		action.keyDown(Keys.COMMAND);
		action.sendKeys("c");
		action.keyUp(Keys.COMMAND);
		action.build().perform();
		
		
		//we will switch to the next element we will use tab key
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		//last we will paste the address in permanent address tab
		action.keyDown(Keys.COMMAND);
		action.sendKeys("v");
		action.keyUp(Keys.COMMAND);
		action.build().perform();
		
		Thread.sleep(1000);
		
		driver.close();
		
		
	}

}
