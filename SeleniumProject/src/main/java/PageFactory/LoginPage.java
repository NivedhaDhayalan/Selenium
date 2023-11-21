package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
        //Locators
	    @FindBy(xpath="//*[@type='email']")
	    WebElement email;
	    @FindBy(xpath=("//*[@type='submit']"))
	    WebElement emailButton;
	    @FindBy(xpath="//*[@type='password']")
	    WebElement password;
	    @FindBy(xpath="//*[@type='submit']")
	    WebElement Login;
	    
	    //constructor
	    public LoginPage(WebDriver driver) {
	 	   this.driver = driver;
	 	   PageFactory.initElements(driver,this);
	    }
	    //methods
	    public void EmailBox(String emailBox) {
	 	   email.sendKeys(emailBox);
	    } 
	    public void emailconfirm_Button() {
	 	  emailButton.click();
	    }
	    public void PasswordBox(String passwordBox) {
	 	  password.sendKeys(passwordBox);
	    }
	    public void passwordconfirm_Button() {
	    	Login.click();
	    }
}

