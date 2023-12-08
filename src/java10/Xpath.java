package java10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //UpCast // Browser Launch 
		driver.navigate().to("https://www.flipkart.com/"); //Launch the url in web browser
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='X")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Fashion"));
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		
		
		
	}
}
