import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorsExample {

	public static void main(String[] args) {
		
	
        //System.setProperty("Webdriver.chrome.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		//to find the element by using id locators firstly we need to reference variable of WebElements interface and need to use below syntex
		WebElement userId = driver.findElement(By.id("email"));
		
		//sendKey method is used to enter the value in textbox
		userId.sendKeys("gopipatel18@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("gopi123");

		WebElement login = driver.findElement(By.id("u_0_b"));
		//click method is used to click any button , radio , button checkbox or link
		login.click();
		//login.submit();
		
		driver.close();
	}	

}
