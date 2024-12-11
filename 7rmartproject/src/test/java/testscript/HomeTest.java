
package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class HomeTest extends Base{
	HomePage homepage;
	
	@Test
	public void verifyIfUserIsAbleToLogOut() throws IOException 
	{
		String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		//loginpage.enterusernameonusernamefield(usernamevalue);
		//loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.enterusernameonusernamefield(usernamevalue).enterpasswordonpasswordfield(passwordvalue);
		homepage=loginpage.clicksigninbutton();

        //HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminimagebutton();
		homepage.clickOnLogoutbutton();
		boolean signinbuttondisplayed = homepage.isSigninButtonDisplayed();
		Assert.assertTrue(signinbuttondisplayed, "signin button is not displayed as logout is not successful");
	}

}
