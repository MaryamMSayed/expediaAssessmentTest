package page_base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	 protected  static WebDriver driver;
	 Select select;

	    // create Super constructor 
	    public PageBase(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
	 // Click on a web element 
	    protected static void clickOnElement(WebElement element) {
	        element.click();
	    }
	// Set text to a web element 
	    protected static void setElementText(WebElement textElement, String value) {
	        textElement.sendKeys(value);
	    }
	    // Send Keyboard Keys to an element 
	    protected static void sendKeyboardKeysToElement(WebElement element, Keys key) {
	    	element.sendKeys(key);
		}
	    // Clear TextField Text
	    protected static void clearElementText(WebElement textElement) {
	        textElement.clear();
	    }
public void selectByValueFromDropDownList(WebElement drpDwnLst, String Value)
{
	select=new Select(drpDwnLst);
	select.selectByValue(Value);
	
}

}
