package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;
import utilities.FileUploadUtlities;
import utilities.PageUtlities;

public class SubCategoryPage {
	WebDriver driver;
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']") private WebElement newbuttonsubcategory;	
	@FindBy(xpath="//select[@id='cat_id']") private WebElement selectcategory;
	@FindBy(xpath="//input[@id='subcategory']") private WebElement subcategoryinput;
	@FindBy(xpath="//input[@id='main_img']") private WebElement imageuploadbutton ;
	@FindBy(xpath="//button[@type='submit']") private WebElement savebutton;	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement savemessage;
	

	
	public SubCategoryPage clickNewSubCategorybutton()
	{
		newbuttonsubcategory.click();
		return this;
	}
		public SubCategoryPage clickOnCategoryField(String categorydropdown) {
		PageUtlities pageutility=new PageUtlities();
		pageutility.selectByVisibleText(selectcategory, categorydropdown);
		return this;
	}
		public SubCategoryPage enterSubcateforyField(String subcategory) {
			subcategoryinput.sendKeys(subcategory);
			return this;
		}
		public SubCategoryPage fileUpload() throws AWTException {
			FileUploadUtlities fileuploadutilities=new FileUploadUtlities();
			fileuploadutilities.fileUplaodUsingSendKeys(imageuploadbutton, Constants.RICECOOKER_IMAGE);
			return this;
		}
		public SubCategoryPage clickOnSavebutton() {
			savebutton.click();
			return this;
		}
		public boolean isAlertMessageDisplayed() {
			return savemessage.isDisplayed();
		}

}
