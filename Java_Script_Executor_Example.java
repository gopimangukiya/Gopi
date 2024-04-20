import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor_Example {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//1. firstly we need to create reference variable of javaScript interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//2. in java script executor  we have 2 method 
		//1)executeScript and 2)executeAsyncScript 
		
		driver.findElement(By.name("uid")).sendKeys("gopika");
		driver.findElement(By.name("password")).sendKeys("gopi123");
		
		WebElement login = driver.findElement(By.name("btnLogin"));
		
		//3.we will use below javaScript to click on login button.
//		js.executeScript("arguments[0].click();",login);
//		
//		//4.we will use below javaScript to handle the alert
//		js.executeScript("alert('user or password is not valid');");
		
		//we will use below script to get all the details of webpage like title,domain name
//		String domainName = js.executeScript("return document.domain;").toString();
//		System.out.println(domainName);
//		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println(url);
//		
//		//we will use below script to launch the new url
//		js.executeScript("https://www.myntra.com/men-demo");
		
		
		
		
		
		

	}

}
