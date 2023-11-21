package SeleniumInteractions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import SeleniumAutomation.IntializingAmazonPage;

public class windowhandling {
public static WebDriver driver;
public static void main(String[] args) throws Exception {
	driver = new IntializingAmazonPage().Initializingpage("https://demoqa.com/browser-windows");
  	 WebElement newtab = driver.findElement(By.xpath("//button[@id='tabButton']"));
  	 newtab.click();
  	 
  	 String mainwindow = driver.getWindowHandle();
  	 System.out.println(mainwindow);
  	 Set<String> allwindow = driver.getWindowHandles();
  	 System.out.println(allwindow);
  	 for(String eachwindow : allwindow) {
  	 if(!eachwindow.equalsIgnoreCase(mainwindow)) {
  		 driver.switchTo().window(eachwindow);
  		 System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
  		 }
  	 }
  	 driver.switchTo().window(mainwindow);
  	 driver.findElement(By.xpath("//button[@id='tabButton']")).click();
  	  allwindow = driver.getWindowHandles();
  		 System.out.println(allwindow);
   


	}

}
