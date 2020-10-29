package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome\\chromedriver.exe");


        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, 5);
       
        driver.get("http://google.com");
        driver.manage().window().maximize();
      
        System.out.println(driver.getTitle());
    

     WebElement gmail = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
    //acn.moveToElement(gmail);
     Actions acn= new Actions(driver);
    Thread.sleep(2000);
    String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
    gmail.sendKeys(clickonlink);
    Set<String> windows = driver.getWindowHandles();
    Iterator<String> it = windows.iterator();
    System.out.println(driver.getCurrentUrl());
    String parentTab = it.next();
    String childTab =it.next();
    driver.switchTo().window(childTab);
    driver.findElement(By.xpath("//div[@class='h-c-header__cta']/ul[1]/li[2]/a")).click();
     
     

	}

}


/*System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("http://google.com");*/