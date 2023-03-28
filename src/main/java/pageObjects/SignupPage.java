package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	public WebDriver driver;
	

	public SignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//Signup
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
	WebElement signup;
	
//select
		
	@FindBy(xpath="(//option[@value='MR'])[1]")
	WebElement title;
	
//firstname
		
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;

//lastname
		
	@FindBy(xpath ="//input[@id='last_name']" )
	WebElement lastname;

//country
		
	 @FindBy(xpath="//select[@class='form-control form-select']")
	 WebElement country;

//DOB

    @FindBy(xpath="	//input[@id='dobDate']")
    WebElement dateofbirth;

//mobile number:   
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobilenumber;
	    

//Email:    
    @FindBy(xpath="//input[@id='email_id']")
    WebElement email;
	    

//password
    @FindBy(xpath="//input[@id='new-password']")
    WebElement password;
	    
//confirm password:	
    @FindBy(xpath="//input[@id='c-password']")
    WebElement confirmpassword;
	    

//checkbox agreement    
    @FindBy(xpath="//input[@id='defaultCheck1']")
    WebElement agreementcheck;

//submitButton	
    @FindBy(xpath="//a/button[@type='button']")
    WebElement submitbutton;
    
    
    public void Signup() {
    	signup.click();
    }
    
    public void SelectTitle() {
    	title.click();
    }
	    
    public void Firstname(String FirstName) {
    	firstname.sendKeys(FirstName);
    }

    
    public void Lastname(String LastName) {
    	lastname.sendKeys(LastName);
    }
    
    public void EnterCountry(String Country) {
    	country.sendKeys(Country);
    }
    
    public void DateOfBirth(String DOB) {
    	dateofbirth.sendKeys(DOB);
    }

    public void MobileNumber(String MobileNumber) {
    	mobilenumber.sendKeys(MobileNumber);
    }


    public void Emailid(String Email) {
    	email.sendKeys(Email);
    }
    
    public void EnterPassword(String Password) {
    	password.sendKeys(Password);
    }
    
    public void ConfirmPassword(String ConfirmPassword) {
    	password.sendKeys(ConfirmPassword);
    }

//    public void agreementCheck() {
//    	agreementcheck.click();
//    }
    
//    public void signupSubmitForm() {
//    	submitbutton.click();
//    }
}
