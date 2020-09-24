package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_1 
{

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
	WebElement column=driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[1]//ul[1]"));
	System.out.println("No of links in this columns are  "+ column.findElements(By.tagName("li")).size());
	int num=column.findElements(By.tagName("li")).size();
	
	for (int i = 0; i <num; i++)
	{
		System.out.println(column.findElements(By.tagName("li")).get(i).getText());
		Thread.sleep(3000);
	String clickontab=	Keys.chord(Keys.CONTROL,Keys.ENTER);
	column.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
		
		
	}
	
	//driver.close();
	}

}
