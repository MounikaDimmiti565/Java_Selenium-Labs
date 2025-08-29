package Selenium_Labs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Q5 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  WebDriver Driver=new ChromeDriver();
	  Driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  Driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  Thread.sleep(2000);
	  Alert alert = Driver.switchTo().alert();

      // Accept the alert
      alert.accept();

      // Verify result text
      String result = Driver.findElement(By.id("result")).getText();
      Assert.assertEquals(result, "You successfully clicked an alert");
  }
	  
	  
	  
  }

