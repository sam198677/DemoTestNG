package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	public String baseUrl = "http://google.com/";
	public WebDriver driver = new FirefoxDriver();
	
  @Test
  public void verifyHomePageTitle() {
	  driver.get(baseUrl);
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle,expectedTitle);
	  driver.quit();
  }
}
