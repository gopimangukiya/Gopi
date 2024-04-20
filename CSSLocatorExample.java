import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorExample {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1.by using tag and class->use(.)
//		WebElement username = driver.findElement(By.cssSelector("input.inputtext"));
//		username.sendKeys("gopipatel18@gamil.com");
//		
//		//2.by using tag and id->use(#)
//		WebElement password = driver.findElement(By.cssSelector("input#pass"));
//		password.sendKeys("gopi123");
		
//		//3.by using tag and attributes->use([])
//		WebElement un= driver.findElement(By.cssSelector("input[type='text'][name='email']"));
//		un.sendKeys("gopipatel18@gmail.com");
//		
//		
//		//4.by using tag,class and attribute
//		WebElement pass = driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
//		pass.sendKeys("gopi123");
//		
//		//5.by using tag,id and attribute
//		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='Log In']"));
//		login.click();
		
		//6.by using tag and starts with- it will find the locator based on the starting character
				WebElement un =driver.findElement(By.cssSelector("input[name^='ema']"));
				un.sendKeys("gopipatel18@gmail.com");
				
				//7. by using tag and ends with- it will find the locator based on ending character
				WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
				pass.sendKeys("gpoi123");
				
				//8.by using tag and the contain - it will find the locator based on character which is present or not
				WebElement login = driver.findElement(By.cssSelector("input[type*='bm']"));
				login.click();
			
	}

}
