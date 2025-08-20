package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.SearchItem;

public  class Lab11_4th {

	
	WebDriver driver;
	public Lab11_4th(WebDriver driver) {
		this.driver=driver;
	}
	By desktop = By.linkText("Desktops");
    By mac = By.linkText("Mac (1)");
    By sortelement = By.id("input-sort");
    By addToCartBtn = By.xpath("//button[contains(@onclick,'cart.add')]");
    By searchBox = By.name("search");
    By searchButton = By.cssSelector("button.btn.btn-default.btn-lg");
    By descriptionCheck = By.name("description");
    
	
    

	public  void clickOnDesktop() {
		driver.findElement(desktop).click();
	}

	public  void mac() {
		driver.findElement(mac).click();
	}

	public  void sortelement(int index) {
		Select srt=new Select(driver.findElement(sortelement));
		srt.selectByIndex(index);
	}
	public void addToCartBtn()
	{
		driver.findElement(addToCartBtn).click();
	}
	public void search(String product)
	{
		driver.findElement(searchBox).clear();
		driver.findElement(searchBox).sendKeys(product);
    }
	public void searchButton( )
	{
		driver.findElement(searchButton).click();
	}
	public void descriptionCheck()
	{
		driver.findElement(descriptionCheck).click();
	}
	
	
}
		
