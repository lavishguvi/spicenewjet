package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.RoundTripPage;

public class RoundTripTest extends BaseClass{

	@Test
	public void SearchFlight() throws InterruptedException {
		RoundTripPage round=new RoundTripPage(driver);
		round.RoundTripButton();
		round.onBoarding(prop.getProperty("From"));
		round.destination(prop.getProperty("To"));
		round.DepartDate();
		round.ReturnDate();
		round.SearchFlight();
	}
	
}
