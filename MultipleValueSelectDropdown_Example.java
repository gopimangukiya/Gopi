import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueSelectDropdown_Example {

	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select select = new Select(fruits);
		
		//to check the if we can select the multiple value from the dropdown we can use ismultiple
		
		if(select.isMultiple())
		{
			select.selectByIndex(0);
			select.selectByValue("orange");
			select.selectByVisibleText("Grape");
		}
		select.deselectByIndex(0);
		select.deselectByValue("orange");
		select.deselectByVisibleText("Grape");
		//select.deselectAll();

	}

}
