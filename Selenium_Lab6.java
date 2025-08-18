package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Selenium_Lab6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		 
		 Driver.get("http://tutorialsninja.com/demo/index.php?");
		 Driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a ")).click();
		 System.out.println(Driver.getCurrentUrl());

	 //  Driver.findElement(By.linkText("Login")).click();
		
	//	Driver.findElement(By.id("input-email")).sendKeys("monn@gmail.com");
	//	Driver.findElement(By.id("input-password")).sendKeys("admin123");		
	//	Driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Thread.sleep(3000);
		Driver.findElement(By.linkText("Components")).click();
        Driver.findElement(By.linkText("Monitors (2)")).click();
        WebElement show= Driver.findElement(By.id("input-limit"));
        Select sle = new Select(show);
        sle.selectByIndex(1);
        Driver.findElement(By.xpath("(//button[@data-original-title='Add to Cart'])[1]")).click();
        Thread.sleep(3000);
        Driver.findElement(By.linkText("Specification")).click();
        Assert.assertTrue(Driver.getPageSource().contains("Specification")); 
        Driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
        Assert.assertTrue(Driver.getPageSource().contains("Success: You have added Apple Cinema 30\" to your wish list!"));
		Driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
        		System.out.println("'Success: You have added Apple Cinema 30\" to your wish list!'");
        		Driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mobile");
        		Driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
        		Driver.findElement(By.id("description")).click();
        		Driver.findElement(By.id("button-search")).click();
        		Driver.findElement(By.linkText("HTC Touch HD")).click();
        		Driver.findElement(By.id("input-quantity")).clear();
        		Driver.findElement(By.id("input-quantity")).sendKeys("3");
        		Driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        		System.out.println("'Success: You have added HTC Touch HD to your  shopping cart!'");
        		Thread.sleep(3000);
        		Driver.findElement(By.id("cart-total")).click();
        		Driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
        		System.out.println("'Products markd with *** are not available in the desired quantity or not in stock!'");
        		Driver.findElement(By.linkText("Checkout")).click();
        		
        		Thread.sleep(3000);
        		Driver.findElement(By.linkText("My Account")).click();
        		Driver.findElement(By.linkText("Logout")).click();
        		System.out.println("Verify 'Account Logout' heading in process");
        		Driver.findElement(By.linkText("Continue")).click();
            }
        


	}

    



