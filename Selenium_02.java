package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com/");
		
		WebElement search=Driver.findElement(By.id("APjFqb"));
		search.sendKeys("Automation Testing tools");
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//search.submit();
		System.out.println("Title:"+Driver.getTitle());
		//driver.quit();
		//Driver.findElement(by.name("btnk")).click();
		
		

	}

}
