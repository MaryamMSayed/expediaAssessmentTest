package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page_base.PageBase;

public class HomePage extends PageBase{

	// create constructor matching super 
	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText="Flights")
	WebElement flightsWizard;
	
	public void openFlightsWizard() {
		clickOnElement(flightsWizard);
	}

}
