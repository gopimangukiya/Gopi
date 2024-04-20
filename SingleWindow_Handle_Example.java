import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindow_Handle_Example {

	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//getwindowHandles() method  will store the Unique session id of opened window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		//it will store the all the opened window after clicking on button
		Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> i = childwindow.iterator();
		while(i.hasNext())
		{
			String childwindow1 = i.next();
			System.out.println(childwindow1);
			if(!parentWindow.equalsIgnoreCase(childwindow1))
			{
				driver.switchTo().window(childwindow1);
				WebElement download = driver.findElement(By.linkText("Downloads"));
						download.click();
						driver.close();
			
			}
			
		}
		driver.switchTo().window(parentWindow);
		
		
		
		
		

	}

}
