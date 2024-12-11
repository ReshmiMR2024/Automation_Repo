package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base{
	HomePage homepage;
	ManageNewsPage managenews;
	@Test
		
	public void verifyThatUserIsAbleToDeleteManageNews() throws IOException 
	{
		
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		//loginpage.enterusernameonusernamefield(usernamevalue);
	//	loginpage.enterpasswordonpasswordfield(passwordvalue);
	    loginpage.enterusernameonusernamefield(usernamevalue).enterpasswordonpasswordfield(passwordvalue);
	    homepage = loginpage.clicksigninbutton();

		//ManageNewsPage managenews=new ManageNewsPage(driver);
		managenews=homepage.clickManageNewsMoreinfo().clickDeleteButtonManageNews().isConfirmationBoxDisplayed();
		//managenews.clickDeleteButtonManageNews();
		//managenews.isConfirmationBoxDisplayed();
		 boolean alertmessagedisplayed=managenews.isAlertMessageDisplayed();
		 Assert.assertTrue(alertmessagedisplayed,"Alert Message not displayed"); 
		
	
	}
	@Test
	public void verifyThatUserIsAbleToSaveNewNews() throws IOException 
	{
		
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		String newsvalue=ExcelUtilities.getStringData(1, 0, "ManageNewsPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue).enterpasswordonpasswordfield(passwordvalue);
		homepage=loginpage.clicksigninbutton();
		//loginpage.enterusernameonusernamefield(usernamevalue);
		//loginpage.enterpasswordonpasswordfield(passwordvalue);		
		//ManageNewsPage managenews=new ManageNewsPage(driver);
		
	    managenews=homepage.clickManageNewsMoreinfo().clickNewNewsButton().enterNewNews(newsvalue).clickSaveNewsButton();
		//managenews.clickNewNewsButton();
		//String newnews="news new";
		//managenews.enterNewNews(newnews);
		//managenews.clickSaveNewsButton();
		boolean alertmessagedisplayed=managenews.isAlertMessageDisplayed();
		 Assert.assertTrue(alertmessagedisplayed,"Alert Message not displayed"); 
	}
}
