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
	String title=ExcelUtilities.getStringData(1, 0, "ManageProductPage");
	String weightvalue=ExcelUtilities.getIntegerData(1, 1,"ManageProductPage");
	String pricevalue=ExcelUtilities.getIntegerData(1, 3,"ManageProductPage");
	String stockvalue=ExcelUtilities.getIntegerData(1, 4,"ManageProductPage");
	product.clickMoreinfolink();
	product.clickonNewButton();
//	String title="Chicken Burger";
	product.enterTitle(title);
	product.clickonProductTypeRadioButton();	
	product.enterweightPrice(weightvalue);
	product.enterPrice(pricevalue);
	product.enterStock(stockvalue);
	product.clickOnSavebutton();
	
	
	boolean alertdisplayed=product.isAlertMessageDisplayed();
	Assert.assertTrue(alertdisplayed,"Alert not displayed");
	
	
	}
}
