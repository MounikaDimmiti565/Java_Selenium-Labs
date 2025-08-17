package SeleniumPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*public class selenium_Keys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.automationpractice.pl/index.php");
		Driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		if(Driver.findElement(By.id("email_create")).isDisplayed())
		{
			System.out.println("email create is dispalyed");
		    Driver.findElement(By.id("email_create")).clear();
		    Driver.findElement(By.id("email_create")).sendKeys("monn@gmail.com");
		    Driver.findElement(By.id("email_create")).sendKeys(Keys.TAB);
		    Driver.findElement(By.id("email_create")).sendKeys(Keys.ENTER);
		}
		else {
			System.out.println("email create is not displayed");
		}
		 WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));

		
		    Driver.findElement(By.id("id_gender1")).click();
			if(Driver.findElement(By.id("id_gender1")).isSelected()) {
				System.out.println("gender1 is selected");
			} else {
				System.out.println("Gender2 is selected");
			}
			Driver.quit();	
		}
		    
	}*/


public class selenium_Keys {

    public static void main(String[] args) throws InterruptedException {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open site
        driver.get("http://www.automationpractice.pl/index.php");
        Thread.sleep(2000); // wait for page to load

        // Click on Sign in
        driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        Thread.sleep(2000); // wait for sign in page to load

        // Check if email_create field is displayed
        if (driver.findElement(By.id("email_create")).isDisplayed()) {
            System.out.println("email create is displayed");
            driver.findElement(By.id("email_create")).clear();
            Thread.sleep(1000);

            driver.findElement(By.id("email_create")).sendKeys("monn@gmail.com");
            Thread.sleep(1000);

            driver.findElement(By.id("email_create")).sendKeys(Keys.TAB);
            Thread.sleep(500);

            driver.findElement(By.id("email_create")).sendKeys(Keys.ENTER);
            Thread.sleep(3000); // wait for next page to load
        } else {
            System.out.println("email create is not displayed");
        }

        // Select gender1
        driver.findElement(By.id("id_gender1")).click();
        Thread.sleep(500);

        if (driver.findElement(By.id("id_gender1")).isSelected()) {
            System.out.println("gender1 is selected");
        } else {
            System.out.println("Gender1 is not selected");
        }

        // Close browser
        driver.quit();
    }
}


