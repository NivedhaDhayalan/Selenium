package POMlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
   WebDriver driver;
       //Locators
       By email  = By.xpath("//*[@type='email']");
       By emailButton = By.xpath("//*[@type='submit']");
       By password = By.xpath("//*[@type='password']");
       By Login = By.xpath("//*[@type='submit']");
       //constructor
       public LoginPage(WebDriver driver) {
    	   this.driver = driver;
       }
       //methods
       public void EmailBox(String emailBox) {
    	   WebElement Email = driver.findElement(email);
    	   Email.sendKeys(emailBox);
       } 
       public void emailconfirm_Button() {
    	   WebElement Email = driver.findElement(emailButton);
    	   Email.click();
       }
       public void PasswordBox(String passwordBox) {
    	   WebElement PassWord = driver.findElement(password);
    	   PassWord.sendKeys(passwordBox);
       }
       public void passwordconfirm_Button() {
    	   WebElement Password = driver.findElement(Login);
    	   Password.click();
       }
}
