package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromeDriver\\chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.get("http://skillrary.com");
        driver.navigate().back();
        driver.quit();


	}

}


/*System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("http://google.com");*/