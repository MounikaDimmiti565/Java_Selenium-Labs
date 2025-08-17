package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLabDemo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.opencart.com/");
		String title=Driver.getTitle();
		if(title.equals("OpenCart - Open Source Shopping Cart Solution")) {
		System.out.println("The Title is matched");
		} else {
		System.out.println("The Title is not matched");
	    } 
		Driver.navigate().to("https://www.yahoo.com/");
		System.out.println("title is:"+Driver.getCurrentUrl());
		Driver.navigate().back();
		System.out.println("title is:"+Driver.getCurrentUrl());
		Driver.navigate().forward();
		Driver.navigate().refresh();
		System.out.println("title is:"+Driver.getCurrentUrl());
		System.out.println("page source is:"+Driver.getPageSource());
		
	   
	}
}
		
		
		//Driver.findElement(By.name("username")).sendKeys("Admin");
		//Driver.findElement(By.name("password")).sendKeys("admin123");		
        //Driver.findElement(By.xpath("//button[@type='submit']")).click();




