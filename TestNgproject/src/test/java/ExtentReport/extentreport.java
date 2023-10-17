package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extentreport  {
	
	public static ExtentReports extentreports;
	public static WebDriver driver;
	public static ExtentTest extenttest;
	
	
	@BeforeTest
	public void Setup(ITestContext context) {
		    driver = new ChromeDriver();
		driver.manage().window().maximize();
		Baseclass base = new Baseclass(driver);
    	extenttest = extentreports.createTest(context.getName());
	}
	// @Parameters("browserName")
	/* @BeforeTest
     public void setup(ITestContext  context) {
		 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		 
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
    	driver.manage().window().maximize();
    	extenttest = extentreports.createTest(context.getName());
    
      }*/

	  @AfterTest
	  public void closewindow() {
		  driver.quit();
	  }
	  
	  @AfterMethod
	  public void status(ITestResult Result, Method M) {

		        if (Result.getStatus() == ITestResult.FAILURE) {
		            extenttest.fail(Result.getThrowable());}
		        else if (Result.getStatus() == ITestResult.SKIP) {
		            extenttest.skip(Result.getThrowable());}
		        else {
		            extenttest.pass("Test passed");
		        }
		    }
	 
	  @BeforeSuite
	  public void Initializereport() {
		  ExtentSparkReporter Reports = new ExtentSparkReporter("AllTests.html");
		  extentreports = new ExtentReports();
		  extentreports.attachReporter(Reports);
	  }
	  @AfterSuite
	  public void GenerateReport() throws Exception {
		  extentreports.flush();
		  Desktop.getDesktop().browse(new File("AllTests.html").toURI());
	  }
}
