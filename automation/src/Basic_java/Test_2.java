package Basic_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 
{
public  static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.get("http://skillrary.com");
	driver.navigate().back();
	driver.navigate().forward();
	
}
}
