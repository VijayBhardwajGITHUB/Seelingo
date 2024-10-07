package createCatalog;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CreateCatalog;

public class Script extends BaseClass {
	
	@Test
	public void cC() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.xpath("//input[@name='user_mobile_login']")).sendKeys(pdata.getPropertyData("mobile"));
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	driver.findElement(By.xpath("//input[@name='user_password_login']")).sendKeys(pdata.getPropertyData("password"));
	WebElement lgnbtn = driver.findElement(By.id("submit"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(lgnbtn));
    lgnbtn.click();
   Thread.sleep(5000);
   WebElement addctg = driver.findElement(By.xpath("//a[@class='btn btn-a add-new-catalog-bt add_new_catalog_btn']"));
  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
   wait1.until(ExpectedConditions.elementToBeClickable(addctg));
   addctg.click();
     Thread.sleep(5000);
     File f=new File(".\\src\\test\\resources\\Img.jpeg");
   String absolutePath = f.getAbsolutePath();
   Thread.sleep(5000);
  driver.findElement(By.xpath("//input[@type='file' and @name='catalog_image']")).sendKeys(absolutePath);
  Thread.sleep(5000);
  CreateCatalog ccl=new CreateCatalog(driver);
 JavascriptExecutor js=(JavascriptExecutor)driver;
  js.executeScript("arguments[0].scrollIntoView();",ccl.getCtxt());
  js.executeScript("arguments[0].click();",ccl.getCtxt());
  Thread.sleep(5000);
  ccl.name("DataGrid Shop");
   Thread.sleep(5000);
  driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
  Thread.sleep(10000);
  WebElement dD = driver.findElement(By.xpath("//select[@id='custom_label']")); 
  utilities.dropDown(dD, "Add to Cart");
  Thread.sleep(5000);
  driver.findElement(By.xpath("//button[text()='Save & Continue']")).click();
  Thread.sleep(10000);
  
  
	}}


