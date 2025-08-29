package Selenium_Labs;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Q4 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  WebDriver Driver=new ChromeDriver();
	  Driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	  WebElement dropdown = Driver.findElement(By.id("my-select"));
	  
	 
	  Select select=new Select(dropdown);
	  select.selectByIndex(1);
	 
	  String selectedText=select.getFirstSelectedOption().getText();
	  WebElement verify=Driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select/option[2]"));
	  if(verify.getText().equals(selectedText))
	  System.out.println("correct option is selected");
	 else
	 {
		System.out.println("selected option is incorrect");
	 }

	  Thread.sleep(2000);
	  Driver.quit();
  }
  ;
    @BeforeMethod
    public void beforeMethod() {
  	  WebDriverManager.chromedriver().setup();
  	  WebDriver Driver=new ChromeDriver();
	  Driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    
    }

    @AfterMethod
    public void afterMethod() {
    }


    @DataProvider
    public Object[][] dp() {
      return new Object[][] {
    
      
      };
    }
    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }

    @BeforeSuite
    public void beforeSuite() {
    }

    @AfterSuite
    public void afterSuite() {
    }

  }