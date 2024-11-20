package testscript;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class AdminUserTest extends Base{
	
	
	@Test
	public void updateAdminUser() throws IOException
	{
		/*String usernamevalue="admin";
		String passwordvalue="admin";*///will no longer hardcode anymore ,use excel		
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();
		
		AdminUserPage adminuser=new AdminUserPage(driver);
	    adminuser.clickmoreinfobutton();
	    adminuser.editbutton();
	    //String usernameupdatevalue="reshmi";
	    String usernameupdatevalue=ExcelUtilities.getStringData(1, 0, "AdminUserPage");
	    adminuser.enterUsername(usernameupdatevalue);
	  //  String passwordupdatevalue="reshmi";
	    String passwordupdatevalue=ExcelUtilities.getStringData(1, 1, "AdminUserPage");
	    adminuser.enterPassword(passwordupdatevalue);
	   // String usertypeupdatevalue="staff";
	    String usertypeupdatevalue=ExcelUtilities.getStringData(1,2, "AdminUserPage");
	    adminuser.selectUsertypeFieldUpdate(usertypeupdatevalue);
	    adminuser.clickUpdateButton();
	    boolean alertmessagedisplayed=adminuser.isAlertMessageDisplayed();
	    Assert.assertTrue(alertmessagedisplayed,"Alert Message not displayed"); 
	 
	   
	}
	
	
}
