package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.OnewayTripPage;

public class OnewayTripTest extends BaseClass {

	@Test 
	public void SearchFlightOneWay() throws InterruptedException {
		OnewayTripPage oneway=new OnewayTripPage(driver);
		oneway.oneWayTrip();
		oneway.onBoarding(prop.getProperty("From"));
		oneway.destination(prop.getProperty("To"));	
		oneway.DepartDate();
		oneway.SearchFlight();
		Thread.sleep(8000);
		
	}

}
