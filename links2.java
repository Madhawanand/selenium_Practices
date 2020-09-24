package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links2 {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		//finding the number of links in the page
	//System.out.println(	driver.findElements(By.tagName("a")).size());
	//limiting the scope of the driver to the footer 
	WebElement footerDriver= driver.findElement(By.id("navFooter"));
	//System.out.println(footerDriver.findElements(By.tagName("a")).size());
	int loop=footerDriver.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility']")).size();
	for (int i = 0; i<loop; i++) 
	{
		if (i==0) 
		{System.out.println("links in "+ driver.findElement(By.xpath("//div[contains(text(),'Get to Know Us')]")).getText());
			WebElement columnDriver= footerDriver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[1]//ul[1]"));
			System.out.println(columnDriver.findElements(By.tagName("li")).size());
			for (int j = 0; j < columnDriver.findElements(By.tagName("li")).size(); j++) 
			{
				System.out.println(columnDriver.findElements(By.tagName("li")).get(j).getText());
			}
			
		}
		if (i==1)
		{System.out.println("links in "+ driver.findElement(By.xpath("//div[contains(text(),'Make Money with Us')]")).getText());
			WebElement columnDriver= footerDriver.findElement(By.xpath("div[@class='navFooterVerticalColumn navAccessibility']//div[3]"));
			System.out.println(columnDriver.findElements(By.tagName("li")).size());	
			for (int k = 0; k <  columnDriver.findElements(By.tagName("li")).size(); k++)
			{
				System.out.println(columnDriver.findElements(By.tagName("li")).get(k).getText());
			}
		}
		if (i==2)
		{System.out.println("links in "+ driver.findElement(By.xpath("//div[contains(text(),'Amazon Payment Products')]")).getText());
			WebElement columnDriver= footerDriver.findElement(By.xpath("div[@class='navFooterVerticalColumn navAccessibility']//div[5]"));
			System.out.println(columnDriver.findElements(By.tagName("li")).size());	
			for (int l = 0; l < columnDriver.findElements(By.tagName("li")).size(); l++)
			{
				
				System.out.println(columnDriver.findElements(By.tagName("li")).get(l).getText());
			}
		}
		if (i==3)
		{System.out.println("links in "+ driver.findElement(By.xpath("//div[contains(text(),'Let Us Help You')]")).getText());
			WebElement columnDriver= footerDriver.findElement(By.xpath("div[@class='navFooterVerticalColumn navAccessibility']//div[7]"));
			System.out.println(columnDriver.findElements(By.tagName("li")).size());	
			for (int m = 0; m < args.length; m++)
			{
				System.out.println(columnDriver.findElements(By.tagName("li")).get(m).getText());	
			}
		}
		
	}
	
	
	
	driver.close();
		

	}


}
