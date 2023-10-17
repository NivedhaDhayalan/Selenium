package DataproviderTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderTest1 {
      public static WebDriver driver;
	/*DataProviders pass the different parameters on a single test method in a single execution, 
	  parameters pass the parameters just once per execution in TestNG */
	@Test(dataProvider = "loginData")
	public void loginTest(String username , String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@class,'userdropdown-tab')]")).isDisplayed());
		//Thread.sleep(1000);
		driver.quit();
	}
	/*@DataProvider(parallel = true)//dataprovider parallel will allow you to parallely pass the data to test method not one byone
	public Object[][] loginData(){
		Object[][] data = new Object[2][2];//2D array
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0]= "xyz";
		data[1][1] = "admin123";
		return data;	}*/

	@DataProvider(parallel =true)
	public Object[][] loginData(){
		Object[][] data = new Object[6][2];//2D array
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0]= "xyz";
		data[1][1] = "admin123";
		
		data[2][0]= "abcd";
		data[2][1] = "admin123";
		
		data[3][0]= "product";
		data[3][1] = "admin123";
		
		data[4][0]= "test";
		data[4][1] = "admin123";
		
		data[5][0]= "nive";
		data[5][1] = "admin123";
		return data;	
	}
        










}




     
      



