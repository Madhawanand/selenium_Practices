package assignments;//Handling the nested frame works 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());//for finding the num of frames present in the page
		//driver.switchTo().frame(0);//selecting the 0th index frame
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		//driver.switchTo().frame(1);//selecting the second index frame inside the frame
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		System.out.println( driver.findElement(By.id("content")).getText());
	
		
	}
	

}
