import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile_Example {

	public static void main(String[] args) {
		

		System.setProperty("Webdriver.com.driver", " /Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("/Users/ashish/Desktop/Gopi/Automation_Practicle/Theory/Selenium Tutorials.pptx");
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();

	}

}
