package selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_box_handling
    {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
	
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		Thread.sleep(5000);
		driver.close();
		

	}

    }
