package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class Selenium_lab5Part2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://tutorialsninja.com/demo/index.php?");
		//String title=Driver.getTitle();
	    //System.out.println("The Title :"+title);
		String title=Driver.getTitle();
		if(title.equals("Your Store")) {
		System.out.println("The Title gets verified");
		} else {
		System.out.println("The Title not gets verified");
	    } 
		Driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		
	    } 

	}


