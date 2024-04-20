
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("gopika");
		driver.findElement(By.id("password")).sendKeys("gopi@123");
		driver.findElement(By.id("login")).click();
		driver.close();
		

	}

}
/*
 * implicit                                     explicit
 *                                             dynamic
 *                                             use only for 
 * static
 * and use for all the class
 *                        explicit
 * 
 * 
 * 
 * */
 