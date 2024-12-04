package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	WebDriver driver;
	public ManageFooterTextPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']") private WebElement moreinfo;
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=2']") private WebElement editbutton;
	//@FindBy(css="a[href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']") private WebElement editbutton;
	//@FindBy(xpath="//tbody/tr[1]/td[4]/a[1]") private WebElement editbutton;	
	@FindBy(xpath="//a[contains(@href,'admin/Footertext/edit?edit=2')]")private WebElement editbutton;
	
	@FindBy(xpath="//textarea[@id='content']") private WebElement addressinput;	//  
	@FindBy(xpath=" //button[@name='Update']") private WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement alertmessage;
	
	
	
	public void clickMoreInfoButton()
	{
		moreinfo.click();
	}
	public void clickOnEditButton()
	{
		editbutton.click();
		
	}
	public void editAddressField(String address)
	{
		//addressinput.click();
		addressinput.clear();
		addressinput.sendKeys(address);
	}
	public void clickOnUpdateButton()
	{
		updatebutton.click();
	}
	 public boolean isAlertMessageDisplayed()
	 {
			return alertmessage.isDisplayed();
	 }
	 
	 public void isUpdateButtonVisible()
	 {
		
	  if (updatebutton.isDisplayed())
	   {
         System.out.println("Update button is displayed.");
       } 
	 else
	   {
         System.out.println("Update button is not displayed.");
       }
	  
	 }
	
}
