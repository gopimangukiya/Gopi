import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		//to fetch the all the columns the table we will use the below code
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int size = columns.size();
		System.out.println("total no of colimn are:"+size);
		
		for(int i =0;i<size;i++)
		{
			String columnName = columns.get(i).getText();
			System.out.println(columnName);
//			if(columnName.equalsIgnoreCase("Company"))
//			{
//				System.out.println("we have column name as per the requirement");
//			}
		}
		
		//to fetch the all rows the table we will use the below code
		List<WebElement> raws = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int size1 = raws.size();
		System.out.println("total no of raws are:"+size1);
		
		for(int j = 0;j<size1; j++)
		{
			String rawsName = raws.get(j).getText();
			System.out.println(rawsName);
			
		}
		
		
		//to fetch the cell data we will use the below code
		WebElement celldata = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[5]"));
		String data = celldata.getText();
		System.out.println(data);
		
		
	}

}
