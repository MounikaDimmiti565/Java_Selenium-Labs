package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab8_4th {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php");
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test1() throws InterruptedException {
        // title verification
        String title = driver.getTitle();
        if (title.equals("Your Store")) {
            System.out.println("Title is verified");
        } else {
            System.out.println("Title is not verified");
        }

        // go to desktop tab, click on Mac, select Name (A-Z) from Sort dropdown, add to cart
        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Mac (1)")).click();  // corrected space

        WebElement sort = driver.findElement(By.id("input-sort"));
        Select sle = new Select(sort);
        sle.selectByVisibleText("Name (A - Z)");

        driver.findElement(By.xpath("(//button[@data-original-title='Add to Cart'])[1]")).click();

        // Search "Mobile"
        driver.findElement(By.name("search")).sendKeys("Mobile");
        driver.findElement(By.xpath("//*[@id='search']/span/button")).click();
        Thread.sleep(2000);

        // Clear search and search again with description
        driver.findElement(By.id("input-search")).clear();
        driver.findElement(By.name("description")).click();
        driver.findElement(By.id("button-search")).click();

        // Search "Monitor"
        driver.findElement(By.name("search")).sendKeys("Monitor");
        driver.findElement(By.xpath("//*[@id='search']/span/button")).click();

        String title1 = driver.getTitle();
        if (title1.contains("Mac")) {
            System.out.println("Mac is verified");
        } else {
            System.out.println("Mac is not verified");
        }
    }

    @DataProvider
    public Object[][] dp() {
        return new Object[][]{
                new Object[]{1, "a"},
                new Object[]{2, "b"},
        };
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

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}
