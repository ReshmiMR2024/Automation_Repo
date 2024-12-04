package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtilities;

public class ManageContactTest extends Base{
		
	@Test
	public void isUpdateButtonDisplayed() throws IOException
	{
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();		
		ManageContactPage managecontact=new ManageContactPage(driver);
		managecontact.clickMoreInfoButton();
		managecontact.clickEditButton();
	}
	@Test
	public void updateManageContact() throws IOException
	{
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();		
		ManageContactPage managecontact=new ManageContactPage(driver);
		managecontact.clickMoreInfoButton();
		managecontact.clickEditButton();
		managecontact.clickOnUpdateButton();
		boolean alertmessagedisplayed=managecontact.isAlertMessageDisplayed();
	    Assert.assertTrue(alertmessagedisplayed,"Alert Message not displayed"); 
		
		
	}

}
