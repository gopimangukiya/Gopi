import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Example {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		//to click on the single checkbox we need to find out the element and need to click
//		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
//		checkbox1.click();
		
//		if(checkbox1.isSelected())
//		{
//			System.out.println("checkbox1 is selected by default");
//		}
//		else
//		{
//			checkbox1.click();
//		}
		
		
		//1) to click on the multiple check box in single code we will use below method
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		int size = checkboxes.size();
		System.out.println(size);
//		
//		//2) if you have multiple check boxes and you want to perform operation on specific index click
//		checkboxes.get(0).click();
		
//		for(int i=0;i<size;i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		//3) get attribute method is used to fetch the value of element attribute as per the given key
		
		for(int i=0;i<size;i++)
		{
			String value = checkboxes.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("hockey"))
			{
				checkboxes.get(i).click();
			}
			
		}
		
		
	
		
	}

}
