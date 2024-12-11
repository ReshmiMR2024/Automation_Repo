package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import pages.ManageProductPage;
import utilities.ExcelUtilities;

public class ManageProductTest extends Base {
	HomePage homepage;
	ManageProductPage product;

	@Test

	public void verifyAlertIsDisplayedForMandatoryFieldsSavingAProduct() throws IOException, AWTException {
		String usernamevalue = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusernameonusernamefield(usernamevalue).enterpasswordonpasswordfield(passwordvalue);
		homepage = loginpage.clicksigninbutton();

		String title = ExcelUtilities.getStringData(1, 0, "ManageProductPage");
		String weightvalue = ExcelUtilities.getIntegerData(1, 1, "ManageProductPage");
		String pricevalue = ExcelUtilities.getIntegerData(1, 3, "ManageProductPage");
		String stockvalue = ExcelUtilities.getIntegerData(1, 4, "ManageProductPage");
		product = homepage.clickproductmoreinfobutton().clickonNewButton().enterTitle(title)
				.clickonProductTypeRadioButton().enterweightPrice(weightvalue).enterPrice(pricevalue)
				.enterStock(stockvalue).clickOnSavebutton();
		// product.fileupload();
		// product.clickOnRadioButtonFeatured();
		// product.clickOnSavebutton();
		boolean alertdisplayed = product.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed, "Alert not displayed");

	}
}
