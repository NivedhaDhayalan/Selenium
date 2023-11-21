package SeleniumInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumAutomation.IntializingAmazonPage;

public class checkbox {
	public static  WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		driver = new IntializingAmazonPage().Initializingpage("https://www.calculator.net/mortgage-calculator.html");
	   	 WebElement checkbox = driver.findElement(By.xpath("//*[@id='caddoptional']//parent::label//span"));
	    	Thread.sleep(2000);
	   	 checkbox.click();
	   	 WebElement checkboxinput = driver.findElement(By.xpath("//*[@id='caddoptional']"));
	       
	   	 /*is selected-->
	   	   System.out.println(checkboxinput.isSelected());
	   	 checkbox.click();
	   	 System.out.println(checkboxinput.isSelected());*/
	   	 
	   	 
	   	 //is displayed
	   	 /*System.out.println("displayedresult1");
	   	 System.out.println(checkboxinput.isDisplayed());
	   	 System.out.println(checkbox.isDisplayed());
	   	 System.out.println(driver.findElement(By.xpath("//*[text()='Include Options Below'])").isDisplayed());*/
	   	 
	   	 //is enabled
	   	 System.out.println("displayedresult");
	   	 System.out.println(checkboxinput.isEnabled());
	   	 System.out.println(checkbox.isEnabled());
	   	 System.out.println("displayed result"+driver.findElement(By.xpath("//*[text()='Include Options Below']")).isEnabled());
	   	 
	   	 driver.close();
	}
	

	/*isSelected()-->returnType-->boolean
	This method is often used on radio buttons, checkboxes or options in a menu.
	It is used to determine is an element is selected. If the specified element is selected, the value returned is true.
	If not, the value returned is false.*/
	/*isEnables()-->returnType--->Boolean
	if object or button is enabled returns true else false*/
	/*isdisplayed()--->ReturnType---->boolean
	 if object or element is displayes on the UI(webpage) returns true else false
	 */


	}


