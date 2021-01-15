package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.HomePage;
import test_base.TestBase;

public class OpenFlightsWizardFromHomePageTest extends TestBase{
	@Test 
	@Severity(SeverityLevel.CRITICAL)
	@Description(" open Flights Wizard from Home Page Test Case")
	public void openFlightsPageFromHome()
	{
		HomePage homePage= new HomePage(driver);
		homePage.openFlightsWizard();
	}
	

}
