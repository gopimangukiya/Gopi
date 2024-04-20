import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpathLocator_Example {

	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1.using simple xpath method by using tag and attribute only
		
//		WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
//		
//		un.sendKeys("gopipatel18@gmail.com");
//		pass.sendKeys("gopi123");
//		login.click();
		
		
		//2.using and condition->must required both condition will be true
		
//		WebElement un = driver.findElement(By.xpath("//input[@type='text' and @class='inputtext']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass' and @tabindex='2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' and @id='u_0_b']"));
//		
//		un.sendKeys("gopipatel18@gmail.com");
//		pass.sendKeys("gopi123");
//		login.click();
		
		//3.using or condition->at list one condition will be true
		
//		WebElement un = driver.findElement(By.xpath("//input[@type='text' or @class='inputtext']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass' or @tabindex='100']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' or @id='u_0_b']"));
//		
//		un.sendKeys("gopipatel18@gmail.com");
//		pass.sendKeys("gopi123");
//		login.click();
		
		//4.using contains method->need to add key and value
		
//		WebElement un = driver.findElement(By.xpath("//input[contains(@type,'tex')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@name,'pas')]"));
//		WebElement login = driver.findElement(By.xpath("//input[contains(@value,'In')]"));
//		
//		un.sendKeys("gopipatel18@gmail.com");
//		pass.sendKeys("gopi123");
//		login.click();
//		
		
		//5.using starts-with -> need to add start character
		
//		WebElement un = driver.findElement(By.xpath("//input[starts-with(@type,'tex')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@name,'pas')]"));
//		WebElement login = driver.findElement(By.xpath("//input[starts-with(@value,'Log')]"));
//		
//		un.sendKeys("gopipatel18@gmail.com");
//		pass.sendKeys("gopi123");
//		login.click();
		
		
		//6.using text method
		
		WebElement link = driver.findElement(By.xpath("//*[text()='Agile Project']"));
		link.click();
		
		
		
		
		
	}

}
