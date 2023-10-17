package CrossBrowserTestNg;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class multiplebrowser {
	
	     static WebDriver driver;
	     @Parameters("browserName")
		 @BeforeTest
	     public void setup(String browserName) {
	    	switch(browserName.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
			    driver = new FirefoxDriver();
	            break;
			case "edge":
				WebDriverManager.edgedriver().setup();
			    driver = new EdgeDriver();
	            break;
			default:
				System.out.println("browser is invalid");
				break;
				
			}
	      }
		 @Parameters("url")
		 @BeforeMethod
		 public void url(String url) {
	     driver.get(url);
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 }
	     @Test
	     public void signin() {
	     driver.findElement(By.xpath("//*[contains(@aria-label,'sign in')]")).click();
	     driver.findElement(By.xpath("//*[contains(@data-test,'signIn')]")).click();
	     driver.findElement(By.xpath("//*[@name='username']")).sendKeys("ewf24Y5STRGEWRF@ghytgr.com");
	     driver.findElement(By.xpath("//*[@id ='password']")).sendKeys("EFGHTYRE");
	     driver.findElement(By.xpath("//*[@id='login']")).click();
		}
	     @AfterMethod
	      public void message() {
	    	String Actualmessage = "Please enter a valid password";
	    	String Expectedmessage = driver.findElement(By.xpath("//*[@id='password--ErrorMessage']")).getText();
	      Assert.assertEquals(Expectedmessage,Actualmessage);  }
	    
	     @AfterTest
		 public void closewindow() {
			driver.quit(); 
		 }
		 
}
