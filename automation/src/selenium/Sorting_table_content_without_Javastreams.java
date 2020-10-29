package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting_table_content_without_Javastreams {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
	WebElement veg = driver.findElement(By.xpath("//th[1]"));
	
				List<WebElement> vegList = driver.findElements(By.xpath("//tr/td[1]"));
				ArrayList<String> al = new ArrayList<String>();//creating an array
				
				for (WebElement element : vegList)
				{
					al.add(element.getText());//moving elements into array
				}
				System.out.println(al);
				Collections.sort(al);//ascending order (array sorting)
				//Collections.reverse(al);//descending order(array sorting)
				System.out.println(al);
				veg.click();
				List<WebElement> aftersorting = driver.findElements(By.xpath("//tr/td[1]"));
				ArrayList<String> bl = new ArrayList<String>();//creating an array
				
				for (WebElement element : aftersorting)
				{
					bl.add(element.getText());//moving elements into array
				}
				System.out.println(bl);
				Assert.assertEquals(al, bl);
				boolean comp=al.equals(bl);
				System.out.println(comp);
				driver.close();
			
				
			}
				

	}


