package SeleniumPack;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab8_4 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String search) throws InterruptedException {
	  driver.findElement(By.linkText("Desktops")).click();
      driver.findElement(By.linkText("Mac (1)")).click();
      WebElement sort=driver.findElement(By.id("input-sort"));
	  Select sle=new Select(sort);
	  sle.selectByIndex(1);
      driver.findElement(By.xpath("//button[contains(@onclick,'cart.add')]")).click();
      Thread.sleep(2000);

      WebElement searchBox = driver.findElement(By.name("search"));
      searchBox.clear();
      searchBox.sendKeys(search);
      driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
      WebElement criteria = driver.findElement(By.name("search"));
      criteria.clear();
      criteria.sendKeys(search);
      driver.findElement(By.name("description")).click();
      driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();

      System.out.println("Search completed... ");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		System.out.println("Application launched successfully");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  System.out.println("The Application closed");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Mobiles"},
      new Object[] { "Monitors" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("The BeforeClass test");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("The BeforeClass test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("The BeforeTest test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("The after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("The beforeSuite test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("The AfterSuite test");
  }

}
