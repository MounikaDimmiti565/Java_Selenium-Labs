package SeleniumPack;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab11_4thTest {
	WebDriver driver;
	Lab11_4th obj;
  @Test(dataProvider = "dp")
  public void f(int index, String value) {
	  obj.clickOnDesktop();
	  obj.mac();
	  obj.sortelement(index);
	  obj.addToCartBtn();
	  obj.search(value);
	  obj.searchButton();
	  driver.findElement(By.linkText("Advanced Search")).click();
	  obj.descriptionCheck();
	 
	  System.out.println("Test completed for search: " + value);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://tutorialsninja.com/demo/");
      obj = new Lab11_4th(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
      driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Mac" },
      new Object[] { 2, "Iphone" },
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
