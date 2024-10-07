package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCatalog {
	
	@FindBy(xpath = "//input[@id='catalog_name']")
	private WebElement ctxt;
	
	public WebElement getCtxt() {
		return ctxt;
	}

	public CreateCatalog(WebDriver driver ) {
		PageFactory.initElements(driver, this);

}
	public void name(String CtgName) {
		ctxt.sendKeys(CtgName);
}
}