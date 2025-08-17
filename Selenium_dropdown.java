package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://tutorialsninja.com/demo/index.php?");
		Driver.findElement(By.linkText("Desktops")).click();
		Driver.findElement(By.linkText("Mac (1)")).click();
		WebElement sort=Driver.findElement(By.id("input-sort"));
		Select sle=new Select(sort);
		//sle.selectByIndex(5);
		
		
		List<WebElement>elecount=sle.getOptions();
		for(int i=0;i<=elecount.size();i++) {
			System.out.println("The values:"+elecount.get(i).getText());
		}
		
		
		
	}

}
