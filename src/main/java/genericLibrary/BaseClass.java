package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;
	
	public PropertyFile pdata=new PropertyFile();
	public WebDriverUtilites utilities=new WebDriverUtilites();
	@BeforeMethod
	public void openApp() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyData("url"));

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
     @AfterMethod
	public void closeApp()
	{
		
		driver.quit();
	}
	
	
	

}
