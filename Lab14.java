package SeleniumPack;

import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab14 {
	
	WebDriver driver;
	String projectpath=System.getProperty("user.dir");
  @Test(dataProvider = "dp")
  public void f(String Firstname , String Lastname,String Email, String Telephone,String password,String Passwordconfirm) throws InterruptedException, IOException {
	    Thread.sleep(2000);
	  	String title=driver.getTitle();
		System.out.println("The Title is:"+title);
		//Assert.assertEquals(title,"Your Store");
	                          
		                                       
	
		if(title.equals("Your Store"))                                                   
		{                                                                               
			System.out.println("title is matched");                                              
		}                                                                               
		else                                                                            
		{                                                                               
			System.out.println("title is not mathed");
		}
		 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		 driver.findElement(By.linkText("Register")).click();
		WebElement text=driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
		 if(text.getText().equals("Register Account")) {
			 System.out.println("Text is matched");
		 }
		 else {
			 System.out.println("text is mismatched");
		 }
	    driver.findElement(By.id("input-firstname")).sendKeys(Firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(Lastname);
		driver.findElement(By.id("input-email")).sendKeys(Email);
		driver.findElement(By.id("input-telephone")).sendKeys(Telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(Passwordconfirm);
		
		driver.findElement(By.name("agree")).click();
		 driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
  }
		
		
		
		
		
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");                                                      
	  WebDriverManager.chromedriver().setup();                                                  
	  driver=new ChromeDriver();                                                              
	  driver.get("http://tutorialsninja.com/demo/");       
	                                                                                            
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");              
	  driver.quit();                                   
	                                                   
  }


  @DataProvider
  public Object[][] dp() throws IOException {
   // return new Object[][] {
   //   new Object[] { 1, "a" },
     // new Object[] { 2, "b" },
	                                                 
	                                    
	  File file1=new File(projectpath+"\\Userdet.xlsx");                                     
	                                                                                       
	     FileInputStream fs=new FileInputStream(file1);                                    
	     XSSFWorkbook workbook=new XSSFWorkbook(fs);                                       
	   XSSFSheet worksheet=workbook.getSheetAt(0);                                       
	    
	   int rowcount=worksheet.getPhysicalNumberOfRows();
	 /*  System.out.println("rows:"+rowcount);
	   
	   for(int i=0;i<rowcount;i++)
	   {
	 	  val[i][0]=worksheet.getRow(i).getCell(0).getStringCellValue();
	 	  val[i][1]=worksheet.getRow(i).getCell(1).getStringCellValue();
	 	  val[i][2]=worksheet.getRow(i).getCell(2).getStringCellValue();
	 	  val[i][3]=worksheet.getRow(i).getCell(3).toString();
	 	  val[i][4]=worksheet.getRow(i).getCell(4).getStringCellValue();
	 	  val[i][5]=worksheet.getRow(i).getCell(5).getStringCellValue();
	   }
	   
	   return data;
	   }/*
	  
	/*	File file1 = new File(projectpath + "\\Userdet.xlsx");
		FileInputStream fs = new FileInputStream(file1);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet worksheet = workbook.getSheetAt(0);

		int rowcount = worksheet.getPhysicalNumberOfRows();
		*/int colcount = worksheet.getRow(0).getPhysicalNumberOfCells();

		System.out.println("rows:" + rowcount + " cols:" + colcount);

		// Dynamic 2D array
		String[][] data = new String[rowcount][colcount];

		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				data[i][j] = worksheet.getRow(i).getCell(j).toString();
			}
		}

		workbook.close();
		fs.close();
		return data;
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
