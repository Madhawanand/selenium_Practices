package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class cleartrip {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		Select s=new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		s.selectByValue("3");
		//System.out.println(driver.findElement(By.xpath("//select[@id='Adults']")).getText());
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
		s1.selectByValue("3");
		Select i=new Select(driver.findElement(By.xpath("//select[@id='Infants']")));
		i.selectByValue("2");
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		Select c=new Select(driver.findElement(By.xpath("//select[@id='Class']")));
		c.selectByValue("Business");
		
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("Indi");
		Thread.sleep(5000);
		List<WebElement> drop= driver.findElements(By.xpath("//li[@class='list']"));
		for (WebElement element : drop) 
		{
			if (element.getText().equalsIgnoreCase("IndiGo (6E)"))
			{
				element.click();
				break;
			}
			
		}
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		driver.close();
							
				
	}


}
