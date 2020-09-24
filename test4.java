package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.get("http://skillrary.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("udemy");
		//driver.close();
	}

}
