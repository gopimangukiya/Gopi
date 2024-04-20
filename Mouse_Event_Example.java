import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Event_Example {

	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		
		WebElement flight = driver.findElement(By.linkText("Flights"));
		
		Actions action = new Actions(driver);
		
		//1. click and hold - it will perform 
		//the mouse left key operation and hold on given webelement
		
//		action.clickAndHold(flight).perform();
		
		//2. release - it will relese the mouse of the given webelement
//		action.release().perform();
		
		
		//3.cotext click - it will use to right click of mouse at given webelement
//		action.contextClick(flight).perform();
		
		
		
	}

}
