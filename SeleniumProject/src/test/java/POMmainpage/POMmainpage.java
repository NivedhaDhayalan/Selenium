package POMmainpage;

import java.time.Duration;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POMlogin.AddtoCart;
import POMlogin.HomePage;
import POMlogin.LoginPage;
import POMlogin.Productpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMmainpage {
 public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		  /*******PAGE OBJECT MODEL************/
		  WebDriverManager.chromedriver().setup();                  
		  driver = new ChromeDriver();
	   	  driver.get("https://www.amazon.com/");
	   	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	   	  driver.manage().window().maximize();
	   	  
	   	  //printing 1st product information
	   	  HomePage HomePage = new HomePage(driver);
	   	  HomePage.selectdropdown("Amazon Devices");
	   	  HomePage.Titletobesearched("Software equipment");
	   	  HomePage.clicksubmit();
	   	  Thread.sleep(2000);
	   	  HomePage.selectedproduct("PreSonus AudioBox 96 Studio USB 2.0 Recording Bundle with Interface, Headphones, Microphone and Studio One software");
	   	  System.out.println("first Product Details");
		  List<String> product =  Arrays.asList(" Item Weight "," Product Dimensions "," ASIN "," Item model number ");
		  Productpage productpage = new  Productpage(driver);
		  for(Map.Entry m:productpage.gettheproductdetails(product).entrySet()){
	      System.out.println(m.getKey()+"--->"+m.getValue());}
		
		  //printing 2nd product information
		  HomePage.selectdropdown("Books");
		  HomePage.clearingsearchbox();
	   	  HomePage.Titletobesearched("software development");
	   	  HomePage.clicksubmit();
	   	  Thread.sleep(2000);
	      HomePage.selectedproduct("A Philosophy of Software Design, 2nd Edition");
	   	  System.out.println("second Product Details");
	      product = new LinkedList<>(Arrays.asList("Language","Paperback","ISBN-10","ISBN-13"));
	      productpage = new Productpage(driver);
	      for(Map.Entry m:productpage.gettheproductdetails(product).entrySet()){
	   	  System.out.println(m.getKey()+"--->"+m.getValue());}
	      
	      AddtoCart AddtoCart = new AddtoCart(driver);
	      AddtoCart.Addtocartbutton();
	      AddtoCart.proceedingtoCart();
	      
	      LoginPage LoginPage = new LoginPage(driver);
	      LoginPage.EmailBox("abcdefgh@gmail.com");
	      Thread.sleep(2000);
	      LoginPage.emailconfirm_Button();
	      LoginPage.PasswordBox("ABCDEFGH");
	      Thread.sleep(2000);
	      LoginPage.passwordconfirm_Button();
	      
	   	  driver.quit();
	}
}
