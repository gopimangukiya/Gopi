import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPrecticals {

	public static void main(String[] args) {
		
		//This method will help you to set the browser path which we need to use to run the automation script
		System.setProperty("Webdriver.chrome.driver", "/Users/ashish/Desktop/Gopi/Automation_Practicle/Software/Crome/chromedriver.exe");
		
		//To create Chromedriver object we need to create web driver interface reference variable and need to create object for browser
		WebDriver driver = new ChromeDriver();
		
		//1. get()-> This method will help you to open the any URL
		driver.get("https://www.amazon.in/");
		
		
		//2.gettitle() -> this is use for fetch the title and to get the title of current open Url to get title method
	    String title = driver.getTitle();
		System.out.println(title);
		
		//3.getCurrentUrl()-> to get the currently opend url we can use get current url method
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//4.getPageSource()-> to get the source code of opened url we can use this method to get pagesource code 
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		
		//5.quit()->to close the all the opend url we need to use quit method
		driver.quit();
		
		//6.close()-> This method use for close the window and to close the current URL we need to use close method
		driver.close();
		
		
	}

}
