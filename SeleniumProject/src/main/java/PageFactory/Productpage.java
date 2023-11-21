package PageFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
  public  WebDriver driver;
	
      @FindBy(xpath="//*[contains(@data-cel-widget,'search_result')]//h2//span")
	  List<WebElement> searchproduct;
      @FindBy(xpath="//*[contains(text(),'\"+ eachproductkey+\"')]//parent::*//*[2]")
      WebElement items;

      public Productpage(WebDriver driver){
	     this.driver = driver;
	     PageFactory.initElements(driver, this);
        }
      public  void selectedproduct(String resulttobesearched  ) {
	   	 	for(WebElement eachtitle:searchproduct)
	   	 	{
	   	    	if(eachtitle.getText().equalsIgnoreCase(resulttobesearched)) {
	   	     	eachtitle.click();
	   	    	break;
	   	    	}
	   	 	}
      }
      public Map<String,String> gettheproductdetails(List<String> productinfo){
	     Map<String,String> productdetail = new HashMap<String,String>();
		 for(String eachproductkey:productinfo) {
		 By items = By.xpath("//*[contains(text(),'"+eachproductkey+"')]//parent::*//*[2]");
		 String value = driver.findElement(items).getText();
		 productdetail.put(eachproductkey,value);
	 	}
	   	   return productdetail;
     }
}