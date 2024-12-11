package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtlities;
import utilities.WaitUtlities;

public class ManageProductPage {
	WebDriver driver;
	public ManageProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']") private WebElement newbutton;	
	@FindBy(xpath="//input[@id='title']") private WebElement titleinput;
	@FindBy(xpath="//input[@name='type' and @value='Nonveg']") private WebElement producttyperadio;	
	@FindBy(xpath="//input[@id='m_weight']") private WebElement weightprice;
	@FindBy(xpath="//input[@id='w_price']") private WebElement price ;
	@FindBy(xpath="//input[@id='w_stock']") private WebElement stockinput;
	@FindBy(xpath="//input[@id='main_img']") private WebElement imgupload ;
	@FindBy(xpath="//input[@name='featured' and @value='yes']") private WebElement featuredyes ;
	@FindBy(xpath="//button[@type='submit']") private WebElement savebutton;	
	@FindBy(xpath="//h5[text()=' Alert!']") private WebElement alertmessage;
	
   
   public ManageProductPage clickonNewButton()
   {
	   newbutton.click();
	   return this;
   }
   public ManageProductPage enterTitle(String titlename)
   {
	   titleinput.sendKeys(titlename);
	   return this;
   }
   public ManageProductPage clickonProductTypeRadioButton()
   {
	   producttyperadio.click();
	   return this;
   }
   public ManageProductPage enterweightPrice(String weight)
   {
	   weightprice.sendKeys(weight);
	   return this;
   }
   public ManageProductPage enterPrice(String priceval)
   {
	   price.sendKeys(priceval);
	   return this;
   }
   public ManageProductPage enterStock(String stock)
   {
		stockinput.sendKeys(stock);
		 return this;
	}
   public ManageProductPage fileupload() throws AWTException
   {
	   WaitUtlities waitutilities=new WaitUtlities();
	   waitutilities.waitForElementToBeClickable(driver, imgupload);
	 //  waitutilities.waitForElement(driver, imgupload);
	   FileUploadUtlities fileuploadutilities=new FileUploadUtlities();
	  // fileuploadutilities.fileUplaodUsingRobotClass(imgupload, Constants.CHICKEN_BURGER_IMAGE);
	   fileuploadutilities.fileUplaodUsingSendKeys(imgupload, Constants.CHICKEN_BURGER_IMAGE);
	   return this;
   }
   public ManageProductPage clickOnRadioButtonFeatured()
   {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",featuredyes);
	    //featuredyes.click();
		//featuredno.click();
		 return this;
   }
   public ManageProductPage clickOnSavebutton() {
		
	   WaitUtlities waitutilities=new WaitUtlities();
	   waitutilities.waitForElementToBeClickable(driver, savebutton);
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();",savebutton);
		//savebutton.click();
	   return this;
	}
   public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}
   
}
