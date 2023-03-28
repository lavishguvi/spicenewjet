package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnewayTripPage {
	public WebDriver driver;
	

	public OnewayTripPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//locate an element
	@FindBy(xpath="//div[contains(text(),'one way')]")
	WebElement onetripbutton;
	
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement boardingFrom;

	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destination;
	
	
	@FindBy(xpath="(//div[@class=\"css-76zvg2 css-bfa6kz r-homxoj r-ubezar\"])[1]")
	WebElement departuredate;
	
	
	@FindBy(xpath="//div[@data-testid=\"home-page-flight-cta\"]")
	WebElement SearchFlight;
	
	
	public void oneWayTrip() {
		onetripbutton.click();
	}
	
	public void onBoarding(String Boarding) {
		boardingFrom.click();
		boardingFrom.sendKeys(Boarding);
	}
	
	public void destination(String Destination) {
		destination.sendKeys(Destination);
	}
	
	public void DepartDate() {
		departuredate.click();
	}
		
	public void SearchFlight() {
		SearchFlight.click();
	}
}
