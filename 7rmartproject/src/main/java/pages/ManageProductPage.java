package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductPage {
	WebDriver driver;
	public ManageProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='password']") private WebElement passwordfield;
	@FindBy(xpath="//input[@name='username']") private WebElement usernamefield;
	@FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	
	
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']") private WebElement moreinfobutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']") private WebElement newbutton;	
	@FindBy(xpath="//input[@id='title']") private WebElement titleinput;
	@FindBy(xpath="//input[@name='type' and @value='Nonveg']") private WebElement producttyperadio;
	@FindBy(xpath="//button[@type='submit']") private WebElement savebutton;
	@FindBy(xpath="//h5[text()=' Alert!']") private WebElement alertmessage;
	
   public void clickMoreinfolink()
    {
	   moreinfobutton.click();
    }
   public void clickonNewButton()
   {
	   newbutton.click();
   }
   public void enterTitle(String titlename)
   {
	   titleinput.sendKeys(titlename);
   }
   public void clickonProductTypeRadioButton()
   {
	   producttyperadio.click();
   }
   public void clickOnSavebutton() 
   {
		savebutton.click();
	}
   public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}
   
}
