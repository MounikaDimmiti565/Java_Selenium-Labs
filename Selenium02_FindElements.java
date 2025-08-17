package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02_FindElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.amazon.in/");
		List<WebElement> alllinks=Driver.findElements(By.tagName("a"));
		for(WebElement link:alllinks)
		{
			System.out.println("The link is:"+link.getAttribute("href"));
			System.out.println("The link is:"+link.getText());
		}
}
}
