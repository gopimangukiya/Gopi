import java.awt.Button;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow_Handle_Example {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		String parentwindow = driver.getWindowHandle();
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		
		WebElement button1 =driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
		button1.click();
		
		Set<String> childwindows = driver.getWindowHandles();
		Iterator<String> i = childwindows.iterator();
		while(i.hasNext())
		{
			String childwindow1 =i.next();
			if(!parentwindow.equalsIgnoreCase(childwindow1))
			{
				WebElement download = driver.findElement(By.linkText("Downloads"));
				download.click();
				Thread.sleep(5000);
				driver.close();
				
			}
			else
			{
				WebElement image = driver.findElement(By.id("image"));
				image.click();
				Thread.sleep(5000);
				driver.close();
			}
		}
		
	}
}
