package Day_008_Emailable_Report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Nationalities {
	
	WebDriver driver;
	
	
	
  @Parameters({"Browser3"})	
  @Test
  public void MainTest1(String Browser) throws Exception {
	  
	   if(Browser.equals("Chrome"))
	   {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	   }
	   
		  
	   
	   
		Reporter.log("Browswer logged succesfully");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		
		Reporter.log("Orange HRM Application opend succesfully");

		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		
		Reporter.log("Login Credentials entred succesfully");
		
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Indian19930");
		
		Reporter.log("Nation  details  entred succesfully");
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		
		Reporter.log("Nation  record created succesfully");

  }
  
  
  
  
  
  
  
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}

  
  
  
  
  
  
}
