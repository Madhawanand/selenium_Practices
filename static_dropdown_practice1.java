package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class static_dropdown_practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		Select s= new Select(driver.findElement(By.id("dropdown-class-example")));//for selecting static drop down
		s.selectByValue("option1");
		Thread.sleep(3000);
		driver.close();
		
	}

}
