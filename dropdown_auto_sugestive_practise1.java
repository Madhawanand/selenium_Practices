package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropdown_auto_sugestive_practise1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("chi");
		Thread.sleep(3000);
		
		List<WebElement> options= driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		
		for (WebElement option : options) 
		{
		       if (option.getText().equalsIgnoreCase("china"))
		       {
				option.click();
				break;
			}	
		}
		Thread.sleep(3000);
		//driver.close();
	}

}
