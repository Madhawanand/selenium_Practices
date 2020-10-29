package sunilClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice1
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		//driver.findElement(By.className("_2AkmmA _29YdH8")).click();
	/*WebElement book = driver.findElement(By.xpath("//th[contains[text(),'java']]"));
		String price=book.getText();
		System.out.println("The price of java book is :-"+ price);*/
		WebElement phone = driver.findElement(By.name("q"));
		Actions highca= new Actions(driver);
		highca.moveToElement(phone).click().keyDown(Keys.SHIFT).sendKeys("redmi").build().perform();
		System.out.println("hi");
		Thread.sleep(5000);
	//WebElement price = driver.findElement(By.xpath("//div[text()='Redmi 6A (Rose Gold, 32 GB)']/../../div[2]/div[1]/div[1]/div[2]"));
	//System.out.println(price.getText());
	//driver.close();
	}

}
