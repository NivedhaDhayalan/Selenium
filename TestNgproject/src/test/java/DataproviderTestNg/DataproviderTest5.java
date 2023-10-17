package DataproviderTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderTest5 {
	public static WebDriver driver;
	@Test(dataProvider = "logindetails", dataProviderClass = DatproviderTest5EXCEL.class)
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
		driver.quit();
	}
	
}
