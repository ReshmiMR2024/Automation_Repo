package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base{
	@Test
		
	public void deleteManageNews() throws IOException 
	{
		
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
		
		ManageNewsPage managenews=new ManageNewsPage(driver);
		managenews.clickManageNewsMoreinfo();
		managenews.clickDeleteButtonManageNews();
		managenews.isConfirmationBoxDisplayed();
		 boolean alertmessagedisplayed=managenews.isAlertMessageDisplayed();
		 Assert.assertTrue(alertmessagedisplayed,"Alert Message not displayed"); 
		
	
	}

}
