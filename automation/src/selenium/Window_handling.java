package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.kptcl.com/");
		driver.manage().window().maximize();// to  maximize the window 
		System.out.println(driver.getCurrentUrl());// to get the current URL
		driver.findElement(By.xpath("//strong[contains(text(),'https:')]")).click();
		System.out.println(driver.getCurrentUrl());
		Set<String> id =driver.getWindowHandles();// to find the id of the window
		Iterator<String> it=id.iterator();
		//Iterator<String> it=driver.getWindowHandles().iterator();// to form the iterator 
		String parent_id=it.next();// iterator goes to the first iterator i.e parent window
		String childd_id=it.next();//iterator for child window
		System.out.println(driver.getCurrentUrl());
		WebDriver child = driver.switchTo().window(childd_id);// switching to child window
		System.out.println(driver.getCurrentUrl());
		//driver.close();//closes the child window
		WebDriver parent = driver.switchTo().window(parent_id);//switch back to the parent window
		System.out.println(child.getCurrentUrl());
		parent.getCurrentUrl();
		driver.close();//closes the parent window
		driver.switchTo().window(childd_id);
		driver.findElement(By.xpath("//div[@class='en']//a[contains(text(),'English')]")).click();
	}

}
