package Selenium_Labs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Q3 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  WebDriver Driver=new ChromeDriver();
	  Driver.get("https://www.amazon.in/");
	  WebElement searchBox = Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
      searchBox.sendKeys("laptop");
      searchBox.submit();
      Thread.sleep(3000);
      
      WebElement sort=Driver.findElement(By.id("//span[@class='a-size-medium a-color-base a-text-normal']"));
	  Select sle=new Select(sort);
      List<WebElement>products=sle.getOptions();
      System.out.println("First 5 Laptop Results:");
      for (int i = 0; i < 5 && i < products.size(); i++) {
    	  
  }
}
}
