package PFHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
		//locators
		    @FindBy(xpath="//*[contains(@aria-label,'sign in')]")
		    WebElement Account;
			@FindBy(xpath="//*[@id='listaccountNav-signIn']")
			WebElement Signin;
		    @FindBy(xpath="//*[@name='username']")
		    WebElement username;
		    @FindBy(xpath="//*[@name='password']")
		    WebElement Password;
		    @FindBy(xpath="//*[@type='submit']")
		    WebElement Login;
	    
	    //constructor
	    public HomePage(WebDriver driver) {
	    	this.driver = driver;
	    	PageFactory.initElements( driver,this);
	    }
	    
		//methods
	    public void accountloginin() {
	    	
	    	Account.click();
	    }
	    public void signinmethod() {
	    	Signin.click();
	    }
	    public void email(String mailid) {
	    	username.sendKeys(mailid);
	    }
	    public void passwd(String pwd) {
	    	Password.sendKeys(pwd);
	    }
	    public void loginButton() {
	    	Login.click();
	    }
}