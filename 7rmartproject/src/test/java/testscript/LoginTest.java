package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	@Test(retryAnalyzer=retry.Retry.class)
	public void verifyTheuserisabletologinusingvalidcredentials() throws IOException
	{
		//String usernamevalue="admin";
		//String passwordvalue="admin";	
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
		boolean homepageloaded=loginpage.isHomepageDisplayed();
		Assert.assertTrue(homepageloaded,"Homepage is not loaded when user is entering valid credentials");
		
		
	}
	@Test
	public void verifyTheuserisabletologinusinginvalidusernameandvalidpassword() throws IOException
	{
		//String usernamevalue="adminHello";
		//String passwordvalue="admin";	
		String usernamevalue=ExcelUtilities.getStringData(2, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(2, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
	    boolean loginErrorDisplayed = loginpage.isLoginErrorDisplayed();
		Assert.assertTrue(loginErrorDisplayed, "Error message is not displayed when invalid username and valid password are used");	
	}
	@Test
	
	public void verifyTheuserisabletologinusingvalidusernameandinvalidpassword() throws IOException
	{
		//String usernamevalue="admin";
		//String passwordvalue="admin1";	
		String usernamevalue=ExcelUtilities.getStringData(3, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(3, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
		boolean loginErrorDisplayed = loginpage.isLoginErrorDisplayed();
		Assert.assertTrue(loginErrorDisplayed, "Error message is not displayed when valid username and invalid credentials are used");
		
	
	}
	
	
	@Test
	public void verifyTheuserisabletologinusinginvalidcredentials() throws IOException
	{
		//String usernamevalue="admin1";
		//String passwordvalue="admin2";
		String usernamevalue=ExcelUtilities.getStringData(4, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(4, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
	    boolean loginErrorDisplayed = loginpage.isLoginErrorDisplayed();
	    Assert.assertTrue(loginErrorDisplayed, "Error message is not displayed when invalid credentials are used");

	}
	
	
	

}
