package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	 WebDriver driver;
	    //Locators
	     @FindBy(id=("searchDropdownBox"))
	     WebElement dropdown; 		 
	     @FindBy(id="twotabsearchtextbox")
	     WebElement searchbox;
		 @FindBy(xpath="//*[@id='twotabsearchtextbox']")
		 WebElement titlesearch;
	 	 @FindBy(xpath="//*[@type='submit']")
	 	 WebElement searchbutton;
	    //CONSTRUCTOR
		public HomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
		}
	    //method for drop down search
		 public void selectdropdown(String dropdownvalue) {
	   	 Select select = new  Select(dropdown);
	   	 select.selectByVisibleText(dropdownvalue); }
		 //Method for clearing SearchBox
		 public void clearingsearchbox() {
			 searchbox.clear(); 
		 }
	 	//method for title search
		 public void Titletobesearched(String Title) {
		 titlesearch.sendKeys(Title);
		   }
	 	 //METHOD FOR SUBMIT
		  public void clicksubmit(){
			  searchbutton.click();
		}
}
