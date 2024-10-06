package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilites {
	//Handling drop down
		public void dropDown(WebElement ele, String text) {
			Select s=new Select(ele);
			s.selectByVisibleText(text);
		}
		
		//Handling MouseHover
		public void mouseHover(WebDriver driver ,WebElement ele) {
			Actions a=new Actions(driver);
			a.moveToElement(ele).perform();
			
		}
		
		//Handling doubleClick
		public void doubleClick(WebDriver driver, WebElement ele) {
			Actions a=new Actions(driver);
			a.doubleClick(ele).perform();
		}
		
		//Handling Right Click
		public void rightClick(WebDriver driver, WebElement ele) {
			Actions a=new Actions(driver);
			a.contextClick(ele).perform();
		}
		
		//Handling drag and drop
		public void dragDrop(WebDriver driver, WebElement src, WebElement target) {
			Actions a=new Actions(driver);
			a.dragAndDrop(src, target);
		}
		
		//Shifting control to frame
		public void switchFrame(WebDriver driver) {
			driver.switchTo().frame(0);
		}
	    
		//Shifting control to child Window
		public void switchbackframe(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
		
		//Shifting control to pop up
		public void alertPopup(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
		//Shifting control to child Window
		public void switchingtabs(WebDriver driver) {
			Set<String> child = driver.getWindowHandles();
			for(String b:child) {
				driver.switchTo().window(b);
			
			}
		}
		
		//Handling Scroll bar
		public void scrollBar(WebDriver driver, int x,int y) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("windows.scrollBy("+x+","+y+")");
		}

}
