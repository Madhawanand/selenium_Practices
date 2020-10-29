package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over_interactions {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://selenium//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		Actions a= new Actions(driver);
		WebElement move= driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		Thread.sleep(3000);
		//a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("skullcandy").build().perform();;
		//Thread.sleep(2000);
	
		
	}

}
