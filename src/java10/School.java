package java10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class School {
	public static void main(String[] args) throws Throwable {
			//JSON Wire Protocol
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver(); //UpCast // Browser Launch 
			driver.navigate().to("https://www.facebook.com/"); //Launch the url in web browser
			
			driver.manage().window().maximize();
		
			
			String currentUrl=driver.getCurrentUrl();
			System.out.println(currentUrl);
		
			Thread.sleep(3000);
			driver.navigate().forward();
			driver.navigate().back();
			driver.navigate().refresh();

			

			
			driver.quit();
			
		}

	}
		
  	
