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

public class ManageContactTest extends Base{
	HomePage homepage;
	ManageContactPage managecontact;
	@Test
	public void verifyThatUpdateButtonDisplayed() throws IOException
	{
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		//loginpage.enterusernameonusernamefield(usernamevalue);
		//loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.enterusernameonusernamefield(usernamevalue).enterpasswordonpasswordfield(passwordvalue);
		homepage=loginpage.clicksigninbutton();		
	//	ManageContactPage managecontact=new ManageContactPage(driver);
		managecontact=homepage.clickManageContactMoreInfoButton().clickEditButton();
		//managecontact.clickManageContactMoreInfoButton();
		//managecontact.clickEditButton();
	}
	@Test
	public void VerifyThatUserIsAbleToUpdateContact() throws IOException
	{
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue).enterpasswordonpasswordfield(passwordvalue);
	//	loginpage.enterusernameonusernamefield(usernamevalue);
	//	loginpage.enterpasswordonpasswordfield(passwordvalue);
		homepage=loginpage.clicksigninbutton();		
		//ManageContactPage managecontact=new ManageContactPage(driver);
		managecontact=homepage.clickManageContactMoreInfoButton().clickEditButton().clickOnUpdateButton();
		//managecontact.clickEditButton();
		//managecontact.clickOnUpdateButton();
		boolean alertmessagedisplayed=managecontact.isAlertMessageDisplayed();
	    Assert.assertTrue(alertmessagedisplayed,"Alert Message not displayed"); 
		
		
	}

}
