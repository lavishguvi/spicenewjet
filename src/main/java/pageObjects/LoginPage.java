package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	
public WebDriver driver ;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locating an element 
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")
	WebElement loginkey;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[4]")
	WebElement emailbutton;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement enteremailid;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterpassword;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterinvalidpassword;
	
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement loginbutton;
	
	
	//Lets create as many methods that you can create here
	public void Login() {
		loginkey.click();
		
	}
	
	public void EmailButton() {
		emailbutton.click();
	}
	
	public void EmailId(String Emailid) {
		enteremailid.sendKeys(Emailid);
	}
	
	public void Password(String Password) {
		enterpassword.sendKeys(Password);
	}
	
	public void invalidPassword(String invalidPassword) {
		enterinvalidpassword.sendKeys(invalidPassword);
	}
	
	
	public void LoginButton() {
		loginbutton.click();
	}
}