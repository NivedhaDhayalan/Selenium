package SeleniumInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import SeleniumAutomation.IntializingAmazonPage;

public class Radiobutton {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception  {
		driver = new IntializingAmazonPage().Initializingpage("https://www.calculator.net/investment-calculator.html");
	   	 Thread.sleep(2000);
	   	 driver.findElement(By.xpath("//*[@value='beginning']//parent::label//span")).click();
	    }


	}


