import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleiframes_Example {
//how many ways to switch in iFrame
	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(("https://demo.automationtesting.in/Frames.html"));
		
		driver.manage().window().maximize();
		
		//to fetch the no of the iFrame we will get the size of the iFrame
		List<WebElement> noOfFrame = driver.findElements(By.tagName("iframe"));
		int size = noOfFrame.size();
		System.out.println("no of iframe in HTML page is"+size);
		
		//1. switch by index
//		driver.switchTo().frame(0);
		
		//2. switch by id
//		driver.switchTo().frame("singleFrame");
		
		//3.switch by name
		driver.switchTo().frame("SingleFrame");
		
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		text.sendKeys("gopi");
		
		
	}

}
