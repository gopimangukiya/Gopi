import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Example {

	public static void main(String[] args) {

		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//for digle radio button
//		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@value='Male']"));
//		//radiobutton1.click();
//		
//		
//		if(radiobutton1.isSelected()) {
//			System.out.println("radiobutton is alredy selected");
//		}
//		else
//		{
//			radiobutton1.click();
//		}
		
		List<WebElement> allradio = driver.findElements(By.xpath("//*[@type='radio']"));
		for(int i=0;i<allradio.size();i++)
		{
			String value = allradio.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("female"))
			{
				allradio.get(i).click();
			}
		}
		
	}

}
