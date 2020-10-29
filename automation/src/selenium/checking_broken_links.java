package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
public class checking_broken_links {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		SoftAssert a = new SoftAssert();
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		for (WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn =(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			a.assertTrue(respCode<400, "the Broken link is  "+link.getText()+" And its respcode is"+respCode);
			/*if (respCode>400)
			{
				System.out.println("the Broken link is  "+link.getText()+" And its respcode is"+respCode);
			}*/
		}
		a.assertAll();
		driver.close();

	}//Exception in thread "main" java.lang.AssertionError: The following asserts failed:
	//the Broken link is  Broken Link And its respcode is404 expected [true] but found [false]

}
