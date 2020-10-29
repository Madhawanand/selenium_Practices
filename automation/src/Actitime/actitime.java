package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E://selenium//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().window().maximize();// for maximising the screen		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");//User name
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");//password
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();//clicing on login button
		Thread.sleep(3000);
		//driver.close();
		driver.findElement(By.xpath("//a[@class='content tasks']//img[@class='sizer']")).click();//clicking on tasks tab
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]")).click();//clicking on project &customer
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@value='Create New Customer']")).click();//click on create new customer
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("madhav");//customer name
		System.out.println(driver.findElement(By.xpath("//input[@id='active_customers_action']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='active_customers_action']")).isEnabled());
		//System.out.println(driver.findElement(By.xpath("//input[@id='add_project_action']")).isSelected());
		
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		
		

	}

}






