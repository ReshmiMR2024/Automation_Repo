package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtilities;

public class SubCategoryTest extends Base{
	@Test
	public void saveSubCategory() throws IOException, AWTException
	{
			
		String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue);
		loginpage.enterpasswordonpasswordfield(passwordvalue);
		loginpage.clicksigninbutton();	
		
		
		
		String category=ExcelUtilities.getStringData(1, 0,"SubCategoryPage");
		String subcategory=ExcelUtilities.getStringData(1, 1,"SubCategoryPage");
		SubCategoryPage subcategoryobj=new SubCategoryPage(driver);
		subcategoryobj.clickmoreinfobutton();
		subcategoryobj.clickNewSubCategorybutton();		
		subcategoryobj.clickOnCategoryField(category);
		subcategoryobj.enterSubcateforyField(subcategory);
		subcategoryobj.fileUpload();
		subcategoryobj.clickOnSavebutton();
		subcategoryobj.isAlertMessageDisplayed();
		
		
		
	}

}
