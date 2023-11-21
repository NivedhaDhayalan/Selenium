package SeleniumInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumAutomation.IntializingAmazonPage;

public class multiselection {
	public static WebDriver driver;
		public static void main(String[] args) throws Exception {
			driver = new IntializingAmazonPage().Initializingpage("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		   	  String name = "Multiple";
		   	  driver.findElement(By.xpath("//img[contains(@id,'SelectionMode')]")).click();
		   	  Thread.sleep(2000);
		      WebElement combobox=driver.findElement(By.xpath("//table[contains(@id,'SelectionMode')]//td[contains(@class,'dxeListBoxItem')][text()='"+name+"']"));
		   	  combobox.click();
		   	  WebElement comboboxselect = driver.findElement(By.xpath("//input[contains(@id,'ControlOptionsTopHolder')][contains(@class,'dxeEditArea')]"));
		   	  Actions actions = new Actions(driver);
		   	 actions.doubleClick(comboboxselect);
		   	 
		   	  comboboxselect.sendKeys(name);
		   	  Thread.sleep(2000);
		    }


	}


