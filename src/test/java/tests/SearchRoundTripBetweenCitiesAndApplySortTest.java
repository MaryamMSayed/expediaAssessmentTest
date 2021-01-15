package tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import data.CitiesSheetReader;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.FlightsWizardPage;
import pages.HomePage;
import pages.SearchResultsPage;
import test_base.TestBase;

public class SearchRoundTripBetweenCitiesAndApplySortTest extends TestBase{
	FlightsWizardPage flightsWizardPageObject;
	CitiesSheetReader citiesSheetReader;
	SearchResultsPage searchResultsPageObject;
	HomePage homePageObject;
	@Test(alwaysRun = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify that Round Trip option is selected Test case")
	public void CheckRoundTripOptionStatus()
	{
		homePageObject=new HomePage(driver);
		flightsWizardPageObject= new FlightsWizardPage(driver);
		homePageObject.openFlightsWizard();
		boolean roundTripOptionStatus= flightsWizardPageObject.roundTripOption.isSelected();
		if(roundTripOptionStatus==true)
		{
			System.out.println("Round Trip Option Is selected you could Continue");
		}
		else 
		{
			flightsWizardPageObject.clickOnRoundTripOption();
		}
	}

	@DataProvider (name="CitiesExcelSheetData")
	public Object[][] searchCitiesData () throws IOException
	{
		//For Getting Data From Excel Sheet
		citiesSheetReader=new CitiesSheetReader();
		return citiesSheetReader.getExcelFileTestData();
	}

	@Test( dataProvider ="CitiesExcelSheetData" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Search Round Trips between 2 cities and apply sorting by arrival Earlist test case")
	public void testUserCanSearchRoundTripBetweenCitiesAndCanSortByArrival(String leavingFromCity, String goingToCity)
	{
		flightsWizardPageObject= new FlightsWizardPage(driver);
		searchResultsPageObject=new SearchResultsPage(driver);
		homePageObject=new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homePageObject.openFlightsWizard();
		flightsWizardPageObject.searchRoundTripBetweenTwoCities(leavingFromCity, goingToCity);
		searchResultsPageObject.sortByArrivalEarliest();
		assertTrue(driver.getCurrentUrl().contains("Flights-Search"));
		driver.navigate().back();
		driver.navigate().back();
	}


}
