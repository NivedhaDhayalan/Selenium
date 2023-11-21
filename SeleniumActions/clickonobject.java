package SeleniumInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumAutomation.IntializingAmazonPage;

public class clickonobject {
	public static WebDriver driver;
	public static void main(String[] args) {
			driver = new IntializingAmazonPage().Initializingpage("https://www.calculator.net/mortgage-calculator.html");
	   	 Actions actions = new Actions(driver);
	   	 WebElement clickonobj = driver.findElement(By.xpath("//*[@value='Calculate']"));
	   	 actions.contextClick(clickonobj).perform();
	}
	


	}


