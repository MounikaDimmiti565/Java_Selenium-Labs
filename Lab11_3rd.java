package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab11_3rd {
	
	WebDriver driver;
	public Lab11_3rd(WebDriver driver2) {
		// TODO Auto-generated constructor stub
			this.driver=driver2;
    }
	
			By desktops =By.linkText("Desktops");
			By mac = By.linkText("Mac (1)");
			By sortbyDropDown=By.id("input-sort");
			
	
			public  void clickOnDesktops() {
				driver.findElement(desktops).click();
			}
			public  void clickOnMac() {
				driver.findElement(mac).click();
			}
			public  void sortbyIndex(int index) throws InterruptedException {
				
				Thread.sleep(2000); 
			    Select srt = new Select(driver.findElement(sortbyDropDown));
			    srt.selectByIndex(index);
			}
			}
			
			
	



