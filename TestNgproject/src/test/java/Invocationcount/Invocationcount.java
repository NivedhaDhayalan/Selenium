package Invocationcount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocationcount {
	//Invocation count -how many times my test method will need to be excuted based on this count
	// ThreadPoolSize - decides how many times my browser should be opened parallely to execute my test method
	
	public static WebDriver driver;
      @Test(invocationCount = 4, threadPoolSize = 2)
      public void Testmethod() throws Exception {
    	  WebDriverManager.chromedriver().setup();
  	      driver = new ChromeDriver();
  	      driver.get("https://randomuser.me/");
  	      driver.findElement(By.xpath("//*[@data-label='name']")).click();
  	      System.out.println("Nmae ===>"+driver.findElement(By.id("user_value")).getText());
  	      //Thread.sleep(1000);
  	      driver.findElement(By.xpath("//*[@data-label='email']")).click();
  	      System.out.println("email ===>"+driver.findElement(By.id("user_value")).getText());
          driver.quit();
      }
}
