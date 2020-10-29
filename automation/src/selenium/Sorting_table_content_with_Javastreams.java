package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting_table_content_with_Javastreams {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
	WebElement vegList = driver.findElement(By.xpath("//th[1]"));
	vegList.click();
	//finding the list of elements in the table
	List<WebElement> order = driver.findElements(By.xpath("//tr/td[1]"));
	//moving the elements into a new list
	 		List<String> originalList = order.stream().map(s->s.getText()).collect(Collectors.toList());
	 		//sorting the original list
			List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
			//to validate  weather both list are same or not
			Assert.assertEquals(originalList, sortedList);
	
				
				driver.close();
			
				
			}
				

	}


