package ExtentReport;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Baseclass extends extentreport{
  public	WebDriver driver;
	public static ExtentTest extenttest;
	//constructor
	public Baseclass(WebDriver driver) {
		this.driver=driver;
	}
	@Test(testName =  "Test")
    public void Google() {
	    driver.get("https://www.google.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys("amazon");
	    extenttest.pass("Google Testis passed");
	    
}
	  @Test
	     public void Target() {
//	     WebDriverManager.chromedriver().setup();
//	     driver = new ChromeDriver();
	     driver.get("https://www.target.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 driver.findElement(By.xpath("//*[contains(@aria-label,'sign in')]")).click();
//   extenttest.pass("Target Testis passed");
} 
}
