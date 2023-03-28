package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

 

import base.BaseClass;
import pageObjects.LoginPage;

//This is file where we will write testcase ->Execute test one by one =Testsuite->Maven 
public class LoginTest extends BaseClass {
	
	
	@Test(priority = 1)
	public void LoginwithValidCredentials() {
		LoginPage login=new LoginPage(driver);
		Logger logger = (Logger) LogManager.getLogger("Hello");
		logger.info("Hello");
	    
		login.Login();
		logger.info("Login Button DOne");
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		logger.info("Login Button DOne");
		login.Password(prop.getProperty("Password"));
		
		login.LoginButton();
		
	}
	

	@Test(priority = 2)
	public void LoginwithInValidCredentials() {
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("InvalidPas"));
		login.LoginButton();		
	}
		
	
	@Test(priority = 3)
	public void LoginwithInvaliduseremail() {
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("InvalidPas"));
		login.LoginButton();		
	}

	@Test(priority = 4)
	public void LoginwithInvalidpassword() {
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("InvalidPas"));
		login.LoginButton();		
	}
}
