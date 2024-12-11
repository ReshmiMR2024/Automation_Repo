package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtilities;

public class ManageFooterTextTest extends Base {
	HomePage homepage;
	ManageFooterTextPage managefooter;

	@Test
	public void verifyThatUserIsAbleToUpdateFooterText() throws IOException {
		String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue).enterpasswordonpasswordfield(passwordvalue);
		// loginpage.enterusernameonusernamefield(usernamevalue);
		// loginpage.enterpasswordonpasswordfield(passwordvalue);
		homepage = loginpage.clicksigninbutton();
		// ManageFooterTextPage managefooter=new ManageFooterTextPage(driver);
		String addressvalue = ExcelUtilities.getStringData(1, 0, "ManageFooterPage");
		managefooter = homepage.clickFooterTextMoreInfoButton();
		// String addressvalue="Thrissur";
		managefooter.clickOnEditButton().editAddressField(addressvalue).clickOnUpdateButton();
		// managefooter.editAddressField(addressvalue);
		// managefooter.clickOnUpdateButton();
		boolean alertmessagedisplayed = managefooter.isAlertMessageDisplayed();
		Assert.assertTrue(alertmessagedisplayed, "Alert Message not displayed");

	}

	@Test
	public void verifyThatUpdateButtonDisplayed() throws IOException {
		String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue).enterpasswordonpasswordfield(passwordvalue);
		// loginpage.enterusernameonusernamefield(usernamevalue);
		// loginpage.enterpasswordonpasswordfield(passwordvalue);
		homepage = loginpage.clicksigninbutton();
		// loginpage. managefooter=new ManageFooterTextPage(driver);
		String addressvalue = ExcelUtilities.getStringData(1, 0, "ManageFooterPage");
		managefooter = homepage.clickFooterTextMoreInfoButton().clickOnEditButton().isUpdateButtonVisible()
				.clickOnUpdateButton();
		// managefooter.clickFooterTextMoreInfoButton();
		// managefooter.clickOnEditButton();
		// managefooter.isUpdateButtonVisible();
		// managefooter.clickOnUpdateButton();

	}

}
