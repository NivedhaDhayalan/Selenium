package SeleniumInteractions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumAutomation.IntializingAmazonPage;

public class draganddrop {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver = new IntializingAmazonPage().Initializingpage("https://www.globalsqa.com/demo-site/draganddrop/");
	   	 driver.findElement(By.xpath("//*[text()='Drag And Drop'][@class='link_span']")).click();
	   	 WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']"));
	   	 driver.switchTo ().frame( iframe);
	   	 List<WebElement> source = driver.findElements(By.xpath("//*[@id='gallery']//img"));
	   	 WebElement destination = driver.findElement(By.xpath("//*[@id='trash']"));
	   	 Actions action = new Actions(driver);
	   	 for(WebElement eachimage : source) {
	   		 action.clickAndHold(eachimage).release(destination).build().perform();
	   		 Thread.sleep(3000);
	   	 }
	   	 driver.findElement(By.xpath("//*[text()='Select Elements'][@class='link_span']")).click();
	    }


	}


