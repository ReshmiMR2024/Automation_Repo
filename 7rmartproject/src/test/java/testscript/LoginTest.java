package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	@Test
	public void verifyTheuserisabletologinusingvalidcredentials()
	{
		String usernamevalue="admin";
		String passwordvalue="admin";	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
		boolean homepageloaded=loginpage.isHomepageDisplayed();
		Assert.assertTrue(homepageloaded,"Homepage is not loaded when user is entering valid credentials");
		
		
	}
	@Test
	public void verifyTheuserisabletologinusinginvalidusernameandvalidpassword()
	{
		String usernamevalue="admin1";
		String passwordvalue="admin";	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
	    boolean loginErrorDisplayed = loginpage.isLoginErrorDisplayed();
		Assert.assertTrue(loginErrorDisplayed, "Error message is not displayed when invalid username and valid password are used");	
	}
	@Test
	
	public void verifyTheuserisabletologinusingvalidusernameandinvalidpassword()
	{
		String usernamevalue="admin";
		String passwordvalue="admin1";	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
		boolean loginErrorDisplayed = loginpage.isLoginErrorDisplayed();
		Assert.assertTrue(loginErrorDisplayed, "Error message is not displayed when valid username and invalid credentials are used");
		
	
	}
	
	
	@Test
	public void verifyTheuserisabletologinusinginvalidcredentials()
	{
		String usernamevalue="admin1";
		String passwordvalue="admin2";	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
	    boolean loginErrorDisplayed = loginpage.isLoginErrorDisplayed();
	    Assert.assertTrue(loginErrorDisplayed, "Error message is not displayed when invalid credentials are used");

	}
	
	
	

}
