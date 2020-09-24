package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_with_elements {

	public static void main(String[] args) throws InterruptedException
	{
		
			System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise");
			driver.manage().window().maximize();
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000);
			for (int i = 1; i < 5; i++)
			{
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				driver.findElement(By.id("hrefIncAdt")).click();
				Thread.sleep(1000);
				
				
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
			
			Thread.sleep(1000);
			Select s=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
			s.selectByValue("USD");
			//System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")).getText());
			driver.close();

	}

}
