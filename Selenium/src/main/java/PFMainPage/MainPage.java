package PFMainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PFHomePage.HomePage;

public class MainPage {
		public static WebDriver driver;
		public static void main(String[] args) throws Exception {
		driver = new FirefoxDriver();
		driver.get("https://www.target.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		HomePage login = new HomePage(driver);
		login.accountloginin();
		login.signinmethod();
		Thread.sleep(2000);
		login.email("guhvhb bnbvjhfgi");
		Thread.sleep(2000);
		login.passwd("jhghhhh#12");
		Thread.sleep(0);
		login.loginButton();
		driver.quit();
	}
}
