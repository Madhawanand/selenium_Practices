package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_auto_suggestive_by_using_keysDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
	 WebElement element = driver.findElement(By.id("autosuggest"));
	 element.sendKeys("ind");
	 System.out.println(element.getAttribute("value"));
	 
		Thread.sleep(3000);
		element.sendKeys(Keys.ARROW_DOWN);
		System.out.println(element.getAttribute("value"));
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		System.out.println(element.getAttribute("value"));//which gives the value which present in that element which is alternate solution of java script usage 
		driver.close();

	}

}
