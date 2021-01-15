package pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page_base.PageBase;

public class FlightsWizardPage extends PageBase {

	// Create constructor matching super 
	public FlightsWizardPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Roundtrip")
	public WebElement roundTripOption;
	@FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button[1]")
	WebElement leavingFromCityBtn;
	@FindBy(id="location-field-leg1-origin")
	WebElement leavingFromCityTxtField;
	@FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button[1]")
	WebElement goingToCityBtn;
	@FindBy(id="location-field-leg1-destination")
	WebElement goingToCityTxtField;
	@FindBy(xpath = "//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
	WebElement searchButton;

	public void clickOnRoundTripOption()
	{
		clickOnElement(roundTripOption);
	}

	protected void clickOnLeavingFromCityBtn()
	{
		clickOnElement(leavingFromCityBtn);
	}
	protected void clearLeavingFromCityTxtField() {
		clearElementText(leavingFromCityTxtField);

	}
	protected void setTextToLeavingFromCityTxtField(String Value) {
		setElementText(leavingFromCityTxtField, Value);

	}
	protected void clickOnGoingToCityBtn()
	{
		clickOnElement(goingToCityBtn);
	}
	protected void clearGoingToCityTxtField() {
		clearElementText(goingToCityTxtField);

	}
	protected void setTextToGoingToCityTxtField(String Value) {
		setElementText(goingToCityTxtField, Value);

	}
	protected void clickOnSearchBtn() {
		clickOnElement(searchButton);
	}
	public void searchRoundTripBetweenTwoCities(String depatrual, String Arrival)
	{

		clickOnLeavingFromCityBtn();
		clickOnElement(leavingFromCityTxtField);
		clearLeavingFromCityTxtField();
		setTextToLeavingFromCityTxtField(depatrual);
		sendKeyboardKeysToElement(leavingFromCityTxtField, Keys.ENTER);
		clickOnGoingToCityBtn();
		clickOnElement(goingToCityTxtField);
		clearGoingToCityTxtField();
		setTextToGoingToCityTxtField(Arrival);
		sendKeyboardKeysToElement(goingToCityTxtField, Keys.ENTER);
		clickOnSearchBtn();
	}

}
