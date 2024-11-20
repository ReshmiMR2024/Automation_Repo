package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
	WebDriver driver;
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='password']") private WebElement passwordfield;
	@FindBy(xpath="//input[@name='username']") private WebElement usernamefield;
	@FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	
	@FindBy(xpath="//a[text()='More info ']") private WebElement moreinfo;	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=10744&page_ad=1']") private WebElement editbutton;
	@FindBy(xpath="//input[@id='username']") private WebElement usernameinput;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordinput;
	@FindBy(xpath="//select[@id='user_type']") private WebElement selectusertype;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']") private WebElement updatebutton;
	@FindBy(xpath="//h5[text()=' Alert!']")private WebElement alertupdatemessage;
	
	
	
	
	public void clickmoreinfobutton()
	{
		moreinfo.click();
	}
	public void editbutton()
	{
		
		editbutton.click();
	}
	 public void enterUsername(String username)
	 {
		 usernameinput.clear();	    
		 usernameinput.sendKeys(username);
	 }
	 public void enterPassword(String password)
	 {
		 passwordinput.clear();	    
		 passwordinput.sendKeys(password);
	 }
	 public void selectUsertypeFieldUpdate(String usertype) 
	 {
			Select select=new Select(selectusertype);
			select.selectByValue(usertype);
	 }
	 public void clickUpdateButton()
	 {
		 updatebutton.click();
	 }
	 public boolean isAlertMessageDisplayed()
	 {
			return alertupdatemessage.isDisplayed();
	 }
	
	 
	
	

}
