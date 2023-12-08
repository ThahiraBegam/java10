package java10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //UpCast // Browser Launch 
		driver.navigate().to("https://www.facebook.com/"); //Launch the url in web browser
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));

		if(username.isDisplayed()) {
			String name = "Java";
			username.sendKeys(name);
			String attribute = username.getAttribute("name");
			if (attribute.isEmpty()) {
				System.out.println("Not accepting alphabets");
			}
			else if(!attribute.equals(name)) {
				System.out.println("Expected value should be: "+name+" instead we got"+ attribute);
			}
			else {
				System.out.println("As per requirements Expected Value entered: "+attribute);
			}
		}
		else {
			System.err.println("Username text box ix not displayed");
			}
		
			WebElement pass = driver.findElement(By.name("pass"));
			pass.sendKeys("234567890");
			
			WebElement user =driver.findElement(By.partialLinkText("Create new account\r\n"+ ""));
			String text = user.getText();
			if(user.isSelected()) {
			System.out.println(text+ "is selected");
			user.click();
		}
		else {
			System.out.println(text+ "is not selected");
		}
		
	  }
	}
