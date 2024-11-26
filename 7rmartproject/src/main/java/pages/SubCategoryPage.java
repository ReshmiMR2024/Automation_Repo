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
	@FindBy(xpath="//input[@name='password']") private WebElement passwordfield;
	@FindBy(xpath="//input[@name='username']") private WebElement usernamefield;
	@FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']") private WebElement moreinfosubcategory;		
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']") private WebElement newbuttonsubcategory;	
	@FindBy(xpath="//select[@id='cat_id']") private WebElement selectcategory;
	@FindBy(xpath="//input[@id='subcategory']") private WebElement subcategoryinput;
	@FindBy(xpath="//input[@id='main_img']") private WebElement imageuploadbutton ;
	@FindBy(xpath="//button[@type='submit']") private WebElement savebutton;	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement savemessage;
	
	
	
	
	

	public void clickmoreinfobutton()
	{
		moreinfosubcategory.click();
	}
	public void clickNewSubCategorybutton()
	{
		newbuttonsubcategory.click();
	}
		public void clickOnCategoryField(String categorydropdown) {
		PageUtlities pageutility=new PageUtlities();
		pageutility.selectByVisibleText(selectcategory, categorydropdown);
	}
		public void enterSubcateforyField(String subcategory) {
			subcategoryinput.sendKeys(subcategory);
		}
		public void fileUpload() throws AWTException {
			FileUploadUtlities fileuploadutilities=new FileUploadUtlities();
			fileuploadutilities.fileUplaodusingSendKeys(imageuploadbutton, Constants.RICECOOKER_IMAGE);
		}
		public void clickOnSavebutton() {
			savebutton.click();
		}
		public boolean isAlertMessageDisplayed() {
			return savemessage.isDisplayed();
		}

}
