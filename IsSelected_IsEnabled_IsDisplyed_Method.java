import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IsSelected_IsEnabled_IsDisplyed_Method {

	public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username= driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		
		//1. way
//		boolean result = username.isDisplayed();
//		boolean result1 = username.isEnabled();
//		System.out.println(result);
//		System.out.println(result1);
		
//		boolean result2 = password.isDisplayed();
//		boolean result3 = password.isEnabled();
//		System.out.println(result2);
//		System.out.println(result3);
		
		
		//2. way
		//isDisplayed method is used to validate element is present or not
		//isEnabled method is used to validate element is present or not
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("gopipatel18@gmail.com");
		}
		else
		{
			System.out.println("username is not displayed");
		}
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("gopi123");
		}
		else
		{
			System.out.println("password is not displayed");
		}
		
		//isSelected method is used to validate that the check box or radio button is already selected or not
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		boolean result4 = checkbox.isSelected();
		System.out.println(result4);
		
		
		
		
		
		
		
		
		
		
	}

}
