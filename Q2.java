package Selenium_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Q2 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  WebDriver Driver=new ChromeDriver();
	  Driver.get("https://the-internet.herokuapp.com/login");
	  String title=Driver.getTitle();
	  System.out.println("The Title is:"+title);
	  Thread.sleep(3000);
	 
	  Driver.findElement(By.id("username")).sendKeys("tomsmith");
	  Driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  Driver.findElement(By.xpath("//*[@id='login']/button")).click();
	  
	  WebElement flashMessage = Driver.findElement(By.id("flash"));
	  String message = flashMessage.getText();

     // System.out.println("Captured Message: [" + message + "]"); 
      
      //message = message.replace("×", "").trim();
      if (message.startsWith("You logged into a secure area!")) {
          System.out.println("Login Successful");
      } else {
          System.out.println(" Unexpected message: " + message);
      }
	}
}
