package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page_base.PageBase;

public class SearchResultsPage extends PageBase {
// Create Constructor Matching Super
	public SearchResultsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="listings-sort")
	public WebElement sortByList;
	public String valueErilerest="ARRIVAL_INCREASING";
	public void sortByArrivalEarliest() {
		
		selectByValueFromDropDownList(sortByList, valueErilerest);
	}

}
