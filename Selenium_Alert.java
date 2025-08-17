package SeleniumPack;//Lab 7 

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Alert {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://letcode.in/alert");
		Driver.findElement(By.id("accept")).click();
        Alert salert=Driver.switchTo().alert();
        System.out.println("The Message is :"+salert.getText());
        salert.accept();
        Driver.findElement(By.id("confirm")).click();
        Alert calert=Driver.switchTo().alert();
        System.out.println("Confirm alert:"+calert.getText());
        calert.dismiss();
        Driver.findElement(By.id("prompt")).click();
        Alert palert=Driver.switchTo().alert();
        System.out.println("prompt alert:"+palert.getText());
        palert.sendKeys("Hi Welcome to my world");
        palert.accept();
        
        
        
	}

}
