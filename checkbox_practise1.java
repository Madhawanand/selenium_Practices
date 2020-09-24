package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox_practise1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();										//for maximising screen	
		
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());//to check whether the check box is clicked or not
		Assert.assertFalse(false);																	//false
		System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());//prints false as check box isnt clicked 
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());//validate whether check box is clicked or not 
		Assert.assertTrue(true);																	//check box clicked
		System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());//prints true as check box is selected 
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());//prints false as check box is unchecked 
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		Assert.assertFalse(false);
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());//prints no of check boxes 
		Thread.sleep(3000);
		driver.close();

	}

}
