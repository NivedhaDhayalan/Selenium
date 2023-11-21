package SeleniumInteractions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SeleniumAutomation.IntializingAmazonPage;

public class dropdown {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver = new IntializingAmazonPage().Initializingpage("https://www.calculator.net/investment-calculator.html");
	    Thread.sleep(2000);
	    WebElement dropdown =  driver.findElement(By.xpath("//*[@id='ccompound']"));
	    Select select = new Select(dropdown);
		select.selectByVisibleText("monthly");
	   // select.selectByValue("daily");
		List<WebElement> options =  select.getOptions();
		for(int i=0;i<options.size();i++) {
	   	 System.out.println(options.get(i).getAttribute("value"));
		}

	

	}

}
