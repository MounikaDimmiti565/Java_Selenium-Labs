package SeleniumPack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_windowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://letcode.in/window");
		Driver.findElement(By.id("home")).click();
		String pwindow=Driver.getWindowHandle();
        System.out.println("parent window:"+pwindow);
        System.out.println("url is:"+Driver.getCurrentUrl());
        Driver.findElement(By.id("multi")).click();
        Set<String>mwindows=Driver.getWindowHandles();
        for (String cwindows:mwindows)
        {
        Driver.switchTo().window(cwindows);
        System.out.println("url is:"+Driver.getCurrentUrl());
        }
        Driver.close();
        Driver.quit();
        
	}

}
