import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_And_Dragg_And_Drop {

	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		
		
		Actions action = new Actions(driver);
		
		//4. doubleclick - it will click on the given webelement
		
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
//		action.doubleClick(button).perform();
		
		//5. drag and drop method - 
		
		WebElement dradAndDrop = driver.findElement(By.linkText("Drag and Drop"));
		dradAndDrop.click();
		
		WebElement drag = driver.findElement(By.id("dragdiv"));
		WebElement drop = driver.findElement(By.id("dropdiv"));
		
		action.dragAndDrop(drag, drop).perform();
		//action.dragAndDropBy(drag, 100, 100).perform();
	}

}
