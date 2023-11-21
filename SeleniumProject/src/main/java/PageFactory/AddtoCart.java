package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddtoCart {
   WebDriver driver;
	   
	   @FindBy(xpath="//*[@id='add-to-cart-button']")
	   WebElement AddToCart;
	   @FindBy(xpath="//*[@value='Proceed to checkout']")
	   WebElement Proceedingcart;
	   
	   public AddtoCart(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements( driver,this);
	   }
	   
	   public void Addtocartbutton() {
		   AddToCart.click();
	   }
	   public void proceedingtoCart() {
		   Proceedingcart.click();  
	   }     
}
