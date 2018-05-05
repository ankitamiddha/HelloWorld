package Firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firsttestngfile {
	
	WebDriver driver;
	String baseurl = "http://www.google.com";
	String driverpath = "C://Users/amiddha/Downloads/geckodriver-v0.19.1-win64/geckodriver.exe";
	String title;
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver",driverpath );
		 driver = new FirefoxDriver();
		 driver.get(baseurl);
		driver.manage().window().maximize();
		title = driver.getTitle();
		System.out.println("Title of the screen is " + title);
		
  }
}
