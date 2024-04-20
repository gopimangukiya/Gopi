import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClearMethod {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("gopipate18@gmil.com");
		//to clear the populated text inntextbox we need to use clear method
		username.clear();
		
		
		WebElement text =driver.findElement(By.tagName("h1"));
		//to fetch the value of perticular elements we can use fettext method
				String value =text.getText();
				System.out.println(value);
		

	}

}
