package SeleniumPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab9_4 {
    WebDriver driver;

    @Test
    public void f() throws InterruptedException {
        // Title verification
        Assert.assertEquals(driver.getTitle(), "Your Store");
        if (driver.getTitle().equals("Your Store")) {
            System.out.println("Title is matched");
            Assert.assertTrue(true);
        } else {
            System.out.println("Title is not matched");
            Assert.assertFalse(true);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Mac (1)")).click();

        WebElement sort = driver.findElement(By.id("input-sort"));
        Select sle = new Select(sort);
        sle.selectByVisibleText("Name (A - Z)");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();

        // Enter ‘Mobile’ in search box
        driver.findElement(By.name("search")).sendKeys("Mobile");
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
        Thread.sleep(2000);

        // Clear criteria, select description and search again
        driver.findElement(By.id("input-search")).clear();
        driver.findElement(By.name("description")).click();
        driver.findElement(By.id("button-search")).click();
    }

    @BeforeMethod
    @Parameters("browser")
    public void beforeMethod(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Launching Chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Launching Firefox");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.out.println("Launching Edge");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }
        driver.get("https://tutorialsninja.com/demo/index.php");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
}
