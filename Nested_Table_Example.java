import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Table_Example {

	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
		driver.manage().window().maximize();
		
		List<WebElement> NTR = driver.findElements(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr"));
		int size =NTR.size();
		
		for(int i=0;i<size; i++)
		{
			String value = NTR.get(i).getText();
			System.out.println(value);
		}
		

	}

}
