package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com");
	driver.findElement(By.id("yDmH0d")).sendKeys("madhavanand");
	//driver.close();
	
	}

}
