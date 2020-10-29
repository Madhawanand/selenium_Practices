package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class array_items_toCart {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait w=new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait 
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] items= {"Brocolli","Cucumber"};
		cart(driver,items);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();//rahulshettyacademy
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[class='promoBtn']")));//explicit wait 
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		Select s=new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")));
		s.selectByValue("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		Thread.sleep(8000);
		//driver.close();
		
	
	}
	public static void cart(WebDriver driver,String[] items) throws InterruptedException
	{
		int j=0;
		
		Thread.sleep(4000);
		List vegetables = Arrays.asList(items); 
		
		List<WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for (int i = 0; i < products.size(); i++)
		{
			String[] name=products.get(i).getText().split("-");//used to split the string
			String formattedName=name[0].trim();//used to remove the white space
			
			if (vegetables.contains(formattedName))
			{
				Thread.sleep(4000);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
			}
			if (j==items.length) {
				break;
			}
			
		}
		System.out.println(driver.findElement(By.xpath("//tr[1]//td[3]//strong[1]")).getText());
		System.out.println(vegetables);
		
	}

}
