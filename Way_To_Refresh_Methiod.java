import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way_To_Refresh_Methiod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
//		//1. by using the refresh method
//		driver.navigate().refresh();
//		
		//2. by using get and getcurrent url method
//		driver.get(driver.getCurrentUrl());
		
//		//3. by using the current url and add that into navigate method
//		driver.navigate().to(driver.getCurrentUrl());
		
		
//		//4. by using f5 key press
//		driver.findElement(By.id("email")).sendKeys(Keys.F5);
		
//		//5. by using ascii value
		driver.findElement(By.id("email")).sendKeys("\uE035");
		
		driver.close();

	}

}
