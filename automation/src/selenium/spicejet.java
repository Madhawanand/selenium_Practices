package selenium;//one end to end scenario

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class spicejet {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		Thread.sleep(7000);
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isEnabled());
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();//clicking on origin
									 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();//selecting from window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXE']")).click();//arrival selector
		driver.findElement(By.xpath("//td[@class=' ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today'][//td[@data-handler='selectDay']]")).click();//date picker
	                            
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))// to check whether the window is enabled or not
		{
			System.out.println("calender is disabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("calender is enabled");
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Select c=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		c.selectByValue("AED");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(4000);
		driver.close();
	}
}