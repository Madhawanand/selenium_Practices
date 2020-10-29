package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://skillrary.com");
		//driver.findElement(By.xpath("//*[@id=\'home_modal\']/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//button[@class='close']")).click();
		driver.findElement(By.xpath("//*[@id=\'front-header\']/div[3]/header/div/div/div[3]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("madhavanand123@mail.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Madhav@27");
		System.out.println(driver.findElement(By.xpath("//*[@id='email-error']")).getText());
	}

}
