package SeleniumPack;
import org.openqa.selenium.By;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title=Driver.getTitle();
		System.out.println("The Title is:"+title);
		Thread.sleep(3000);
		//WebElement username=Driver.findElement(By.name("username"));
		//username.sendKeys("Admin");
		Driver.findElement(By.name("username")).sendKeys("Admin");
		Driver.findElement(By.name("password")).sendKeys("admin123");		
        Driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
