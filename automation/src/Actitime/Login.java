package Actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static Properties prop;
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","E://selenium//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		String File=("C:\\Users\\Madhav\\myjavaworks\\automation\\src\\Actitime\\actitimebase.properties");
		FileInputStream file= new FileInputStream(File);
			 new Properties();
			prop.load(file);
			String url=prop.getProperty("url");
			System.out.println(url);
			String username=prop.getProperty("username");
			System.out.println(username);
			String password=prop.getProperty("password");
			System.out.println(password);
			driver.get(url);
			driver.manage().window().maximize();
			
	}

}
