package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='password']") private WebElement passwordfield;
	@FindBy(xpath="//input[@name='username']") private WebElement usernamefield;
	@FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']") private WebElement managenewsmoreinfo;
	@FindBy(xpath="//tbody/tr[1]/td[2]/a[2]") private WebElement deletemanagenews;	
	@FindBy(xpath="//i[@class='fas fa-trash-alt']")private WebElement confirmalertbox;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement deletemessage;
	
	
	
	 public void clickManageNewsMoreinfo()
	 {
		 managenewsmoreinfo.click();
	 }
	 public void clickDeleteButtonManageNews()
	 {
		 deletemanagenews.click();
	 }
	 public void isConfirmationBoxDisplayed()
	 {
		 //confirmalertbox.click();			
	     driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
	 }
	 public boolean isAlertMessageDisplayed()
	 {
			return deletemessage.isDisplayed();
	 }
	

}
