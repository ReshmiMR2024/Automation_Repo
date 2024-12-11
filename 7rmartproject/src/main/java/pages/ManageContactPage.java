package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ManageContactPage {
	WebDriver driver;
	public ManageContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']") private WebElement editbutton;	
	@FindBy(xpath="//button[@name='Update']") private WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement alertmessage;		
	
	
	public ManageContactPage clickEditButton()
	{
		editbutton.click();
		return this;
	}
	 public ManageContactPage isUpdateButtonVisible()
	 {
		
	  if (updatebutton.isDisplayed())
	   {
         System.out.println("Update button is displayed.");
       } 
	 else
	   {
         System.out.println("Update button is not displayed.");
       }
	  return this;
	 }
	 public ManageContactPage clickOnUpdateButton()
	 {
	 updatebutton.click();
	 return this;
	 }
	 public boolean isAlertMessageDisplayed()
	 {
			return alertmessage.isDisplayed();
	 }
}
