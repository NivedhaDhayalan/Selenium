package POMlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCart {
   WebDriver driver;
	   
	   By AddToCart = By.xpath("//*[@id='add-to-cart-button']");
	   By Proceedingcart = By.xpath("//*[@value='Proceed to checkout']");
	   
	   public AddtoCart(WebDriver driver) {
		   this.driver = driver; 
	   }
	   
	   public void Addtocartbutton() {
		   WebElement addcart = driver.findElement(AddToCart);
		   addcart.click();
	   }
	   public void proceedingtoCart() {
		   WebElement cart = driver.findElement(Proceedingcart);
		   cart.click();  
	   }     
}
