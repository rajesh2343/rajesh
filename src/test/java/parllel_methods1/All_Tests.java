package parllel_methods1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class All_Tests {
	
	WebDriver driver;
	
	
  @Test
  public void NationalityTest() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 

		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Indian111");
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();

	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
	
  @Test
  public void SkillsTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
		
		
		
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		
	
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
	
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Java111");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Java111 descr");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
	  
	  
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
