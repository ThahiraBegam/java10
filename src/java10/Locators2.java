package java10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //UpCast // Browser Launch 
		driver.navigate().to("https://www.facebook.com/"); //Launch the url in web browser
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0; i<links.size(); i++) {
			WebElement element=links.get(i);
			String text=element.getText();
		    System.out.println(text);
		   

	}

}
}