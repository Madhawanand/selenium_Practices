/*
 Selecting the Calendar date from the Red bus application by selecting place 
 */
package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Basic_java.string;

public class Calender_Handling2
{
	static
	{
		System.setProperty("webdriver.chrome.driver","E://selenium//chrome//chromedriver.exe");
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
		
		String startDate = "23/Dec/2020";
		//String[] day=startDate.split("/");
		List<WebElement> destination = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		for (WebElement webElement : destination)
		{
			if (webElement.getText().equalsIgnoreCase("Katraj, Pune"))
			{
			webElement.click();
			break;
			}
		}
		//String Monthyear=day[1]++day[2];
		String combination = startDate.split("/")[1].trim() + " " + startDate.split("/")[2].trim();
		 WebElement month = driver.findElement(By.xpath("//td[@class='monthTitle']"));
		while (!month.getText().equals(combination) )
		{
			 driver.findElement(By.xpath("//td[@class='next']")).click();;
			
			 month = driver.findElement(By.xpath("//td[@class='monthTitle']"));

		}
		
		 List<WebElement> dates = driver.findElements(By.xpath("//td[@class='wd day' or @class='we day']"));
		  for(int i=0;i<dates.size();i++) {
		   if(dates.get(i).getText().equals(startDate.split("/")[0].trim())) 
		   {
		    dates.get(i).click();
		    break;
		   }
		  }
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		driver.close();
	}

}
