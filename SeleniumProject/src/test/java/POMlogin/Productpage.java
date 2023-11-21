package POMlogin;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {
  public  WebDriver driver;
	
      public By items = By.xpath("//*[contains(text(),'\"+ eachproductkey+\"')]//parent::*//*[2]");

      public Productpage(WebDriver driver){
	     this.driver = driver;
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