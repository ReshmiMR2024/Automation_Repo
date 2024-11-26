package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageProductPage;
import utilities.ExcelUtilities;

public class ManageProductTest extends Base{
	@Test
	
	public void saveProduct() throws IOException
	{
	String usernamevalue=ExcelUtilities.getStringData(1, 0, "LoginPage");
	String passwordvalue=ExcelUtilities.getStringData(1, 1,"LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterusernameonusernamefield(usernamevalue);
	loginpage.enterpasswordonpasswordfield(passwordvalue);
	loginpage.clicksigninbutton();
	
	ManageProductPage product=new ManageProductPage(driver);
	product.clickMoreinfolink();
	product.clickonNewButton();
	String title="Chicken Burger";
	product.enterTitle(title);
	product.clickonProductTypeRadioButton();
	product.clickOnSavebutton();
	boolean alertdisplayed=product.isAlertMessageDisplayed();
	Assert.assertTrue(alertdisplayed,"Alert not displayed");
	
	
	}
}
