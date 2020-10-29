package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown_with_index 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//selecting the from window
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();//selecting the from place
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();//selecting the arrivalplace
		Thread.sleep(3000);//for delay 3  milisec
		driver.close();//to cose the window

	}

}
