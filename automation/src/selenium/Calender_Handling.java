/*
 Selecting the Calendar date from the Red bus application by selecting place 
 */
package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_Handling
{
	static
	{
		System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver//chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		driver.findElement(By.xpath("//*[@id='src']")).sendKeys("BANGLORE");
		List<WebElement> List = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		for (WebElement element : List) 
		{
			if (element.getText().equalsIgnoreCase("Bangalore (All Locations)"))
			{
			element.click();
			break;
			}
		}
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("pune");
		
		
		List<WebElement> destination = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		for (WebElement webElement : destination)
		{
			if (webElement.getText().equalsIgnoreCase("Katraj, Pune"))
			{
			webElement.click();
			break;
			}
		}
		Thread.sleep(4000);
		WebElement month = driver.findElement(By.xpath("//td[@class='monthTitle']"));
		
		while (!month.getText().contains("Nov")) 
		{
			
			WebElement NextMonth = driver.findElement(By.xpath("//td[@class='next']"));
		//	WebElement month1 = driver.findElement(By.xpath("//td[@class='monthTitle']"));
		//	month1=month;
			NextMonth.click();
		}
		Thread.sleep(4000);
		List<WebElement> dates = driver.findElements(By.xpath("//td[@class='wd day']"));
		
		for (WebElement  date : dates)
		{
			if (date.getText().contains("24")) {
				date.click();
			}
		}
		
			
			
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		driver.close();
}

	}


