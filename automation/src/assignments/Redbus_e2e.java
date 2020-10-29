package assignments;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Redbus_e2e {
 WebDriver driver;
 @BeforeClass
 public void setup() {
  System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver//chromedriver.exe");
  ChromeOptions option = new ChromeOptions();
  option.addArguments("--disable-notifications");
  WebDriver driver = new ChromeDriver(option);
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("https://www.redbus.in/");
 }
 
 @Test
 public void testCalenderWithValidInputs() {
  
  String startDate = "23/Dec/2020";
 
  // Select the source Field
  WebElement source = driver.findElement(By.id("src"));
  String sourcePlace = "Katraj, Pune";
  String partialKeywordSource = "pun";
  selectPlaces(driver,partialKeywordSource,source,sourcePlace);
  
  // Select the destination field
  WebElement destination = driver.findElement(By.id("dest"));
  String destinationPlace = "Electronic City, Bangalore";
  String partialKeywordDestination = "bang";
  selectPlaces(driver,partialKeywordDestination,destination,destinationPlace);
  
  // now select the dates which is mentioned..
  // wait for the calender to open
  WebDriverWait wait = new WebDriverWait(driver,5);
  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("rb-calendar_onward_cal")));
  
  String monthYear = driver.findElement(By.cssSelector(".monthTitle")).getText();
  String combination = startDate.split("/")[1].trim() + " " + startDate.split("/")[2].trim();
  
  while(!monthYear.equals(combination)) {
   driver.findElement(By.cssSelector(".next")).click();    // month Year do not match the requrement move to next month
   monthYear = driver.findElement(By.cssSelector(".monthTitle")).getText(); // after next update month and year
  }
  
  // after month and year selection click on date
  List<WebElement> dates = driver.findElements(By.xpath("//td[@class='wd day' or @class='we day']"));
  for(int i=0;i<dates.size();i++) {
   if(dates.get(i).getText().equals(startDate.split("/")[0].trim())) {
    dates.get(i).click();
    break;
   }
  }
  
  //now search for busses
  driver.findElement(By.id("search_btn")).click();
  String searchResultPageTitle = driver.getTitle();
  
  Assert.assertEquals(searchResultPageTitle, "Search Bus Tickets","Search page not found");
  
 }
 
 public static void selectPlaces(WebDriver driver,String partialKey,WebElement placeField,String place) {
  placeField.click();
  //enter partial keyword for pune as pun
  placeField.sendKeys(partialKey);
  
  // capture all the elements from the source dropdown
  List<WebElement> sourceValues = driver.findElements(By.cssSelector("ul[class='autoFill'] li"));
  
  
  for(int i=0;i<sourceValues.size();i++) {
   if(sourceValues.get(i).getText().equalsIgnoreCase(place)) {
    sourceValues.get(i).click();
    break;
   }
  }
 }

 @AfterClass
 public void tearDown() {
  driver.quit();
 }

}


