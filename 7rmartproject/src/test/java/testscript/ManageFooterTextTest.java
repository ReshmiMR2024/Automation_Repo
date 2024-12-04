package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtilities;

public class ManageFooterTextTest extends Base{
	@Test
	public void updateFooterText() throws IOException
	{
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();		
		ManageFooterTextPage managefooter=new ManageFooterTextPage(driver);
		String addressvalue=ExcelUtilities.getStringData(1, 0, "ManageFooterPage");
		managefooter.clickMoreInfoButton();
		//String addressvalue="Thrissur";
		managefooter.clickOnEditButton();		
		managefooter.editAddressField(addressvalue);
		managefooter.clickOnUpdateButton();		
		boolean alertmessagedisplayed=managefooter.isAlertMessageDisplayed();
	    Assert.assertTrue(alertmessagedisplayed,"Alert Message not displayed"); 
		
	}
	@Test
	public void isUpdateButtonDisplayed() throws IOException
	{
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();		
		ManageFooterTextPage managefooter=new ManageFooterTextPage(driver);
		String addressvalue=ExcelUtilities.getStringData(1, 0, "ManageFooterPage");
		managefooter.clickMoreInfoButton();
		managefooter.clickOnEditButton();	
		managefooter.isUpdateButtonVisible();
		managefooter.clickOnUpdateButton();
		
		
	}
	
	

}
