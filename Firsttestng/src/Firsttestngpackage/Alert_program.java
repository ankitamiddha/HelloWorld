package Firsttestngpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert_program {
	WebDriver driver;
	@BeforeTest
	public void initiate_variables() throws InterruptedException {
	
	String baseurl = "http://demo.guru99.com/test/delete_customer.php";
	String driverpath = "C://Users/amiddha/Downloads/geckodriver-v0.19.1-win64/geckodriver.exe";
	System.setProperty("webdriver.gecko.driver",driverpath );
	 driver = new FirefoxDriver();
	 driver.get(baseurl);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2424");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	Thread.sleep(1000);
	}
  @Test
  public void delete_custid() throws InterruptedException {
	  Alert alert = driver.switchTo().alert();
	  String message = alert.getText();
	  System.out.println("Title of the alert is " + message);
	  alert.accept();
	  Thread.sleep(500);
	  driver.close();
	  
	  
  }
}
