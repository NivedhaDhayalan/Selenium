package POMlogin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	 WebDriver driver;
	    //Locators
	    By dropdown = By.id("searchDropdownBox");
	    By searchBox = By.id("twotabsearchtextbox");
		By titlesearch = By.xpath("//*[@id='twotabsearchtextbox']");
	 	By searchbutton = By.xpath("//*[@type='submit']");
		By searchproduct = By.xpath("//*[contains(@data-cel-widget,'search_result')]//h2//span");
	    //CONSTRUCTOR
		public HomePage (WebDriver driver) {
		this.driver = driver;
		}
	    //method for drop down search
		 public void selectdropdown(String dropdownvalue) {
	   	 WebElement selectdropdownobj = driver.findElement(dropdown);
	   	 Select select = new  Select(selectdropdownobj);
	   	 select.selectByVisibleText(dropdownvalue); }
		 //Method for clearing SearchBox
		 public void clearingsearchbox() {
			 WebElement searchbox = driver.findElement(titlesearch);
			 searchbox.clear(); 
		 }
	 	//method for title search
		 public void Titletobesearched(String Title) {
		 WebElement titlesearchobj = driver.findElement(titlesearch);
		 titlesearchobj.sendKeys(Title);
		   }
	 	 //METHOD FOR SUBMIT
		  public void clicksubmit(){
		  driver.findElement(searchbutton).click();
		}
	    
		  public void selectedproduct(String resulttobesearched  ) {
	   	  List<WebElement> Alltitles = driver.findElements(searchproduct);
	   	 	for(WebElement eachtitle:Alltitles)
	   	 	{
	   	    	if(eachtitle.getText().equalsIgnoreCase(resulttobesearched)) {
	   	     	eachtitle.click();
	   	    	break;
	   	 	}
        }
	}
}
