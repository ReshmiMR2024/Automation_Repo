package testscript;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class AdminUserTest extends Base {
	HomePage homepage;
	AdminUserPage adminuser;

	@Test
	public void verifyIfUserIsAbleToUpdateAllFields() throws IOException {
		/*
		 * String usernamevalue="admin"; String passwordvalue="admin";
		 */// will no longer hardcode anymore ,use excel
		String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue).enterpasswordonpasswordfield(passwordvalue);
		// loginpage.enterpasswordonpasswordfield(passwordvalue);
		// loginpage.clicksigninbutton();
		homepage = loginpage.clicksigninbutton();

		// AdminUserPage adminuser=new AdminUserPage(driver);
		// adminuser.c
		String usernameupdatevalue = ExcelUtilities.getStringData(1, 0, "AdminUserPage");
		String passwordupdatevalue = ExcelUtilities.getStringData(1, 1, "AdminUserPage");
		String usertypeupdatevalue = ExcelUtilities.getStringData(1, 2, "AdminUserPage");
		adminuser = homepage.clickAdminMoreInfoButton();

		adminuser.editbutton().enterUsername(usernameupdatevalue).enterPassword(passwordupdatevalue)
				.selectUsertypeFieldUpdate(usertypeupdatevalue).clickUpdateButton();
		boolean alertmessagedisplayed = adminuser.isAlertMessageDisplayed();
		Assert.assertTrue(alertmessagedisplayed, "Alert Message not displayed");
		/*
		 * String usernameupdatevalue="reshmi";
		  
		 * adminuser.enterUsername(usernameupdatevalue); // String
		 * passwordupdatevalue="reshmi";
		 * 
		 * adminuser.enterPassword(passwordupdatevalue); // String
		 * usertypeupdatevalue="staff";
		 * 
		 * adminuser.selectUsertypeFieldUpdate(usertypeupdatevalue);
		 * adminuser.clickUpdateButton();
		 */
		

	}

}
