//rediff.com
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[class*='signin']")).click();
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("madhav");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("madhav");

	}

}
