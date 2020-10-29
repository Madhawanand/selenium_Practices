package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_auto_suggestive {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));//to list out all the suggestive in a single variable
		
		for (WebElement option : options)//to extract each element from options 
		{
			if (option.getText().equalsIgnoreCase("india"))//compares the extracted element to india 
			{
				option.click();// if entered text found then click on it
				break;//if the text found then exit the for loop
				
			}
			
		}
		Thread.sleep(4000);
		driver.close();

	}

}
