package POMHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
		WebDriver driver;
				//locators
				By account = By.xpath("//*[contains(@aria-label,'sign in')]");
		        By  signin = By.xpath("//*[@id='listaccountNav-signIn']");
		        By  name = By.xpath("//*[@name='username']");
		        By  password = By.xpath("//*[@name='password']");
		        By  login = By.xpath("//*[@type='submit']");
		        
		        //constructor
		        public HomePage(WebDriver driver) {
		        	this.driver = driver;
		        }
		        
				//methods
		        public void accountloginin() {
		        	WebElement Account = driver.findElement(account);
		        	Account.click();
		        }
		        public void signinmethod() {
		        	WebElement Signin = driver.findElement(signin);
		        	Signin.click();
		        }
		        public void email(String mailid) {
		        	WebElement username = driver.findElement(name);
		        	username.sendKeys(mailid);
		        }
		        public void passwd(String pwd) {
		        	WebElement Password = driver.findElement(password);
		        	Password.sendKeys(pwd);
		        }
		        public void loginButton() {
		        	WebElement Login = driver.findElement(login);
		        	Login.click();
		        
		        }
		        
}
