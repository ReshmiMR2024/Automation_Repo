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
	
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/a[2]") private WebElement deletebuttonmanagenews;	
	//@FindBy(xpath="//i[@class='fas fa-trash-alt']")private WebElement confirmalertbox;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement deletemessage;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']") private WebElement newnewsbutton;
	@FindBy(xpath="//textarea[@id='news']") private WebElement newsinputfield;	//
	@FindBy(xpath="//button[@type='submit']") private WebElement savenewsbutton;
	@FindBy(xpath="//i[@class='icon fas fa-check']") private WebElement savemessage;
	
	
			
	 
	 public ManageNewsPage clickDeleteButtonManageNews()
	 {
		 deletebuttonmanagenews.click();
		 return this;
	 }
	 public ManageNewsPage isConfirmationBoxDisplayed()
	 {
		 //confirmalertbox.click();			
	     driver.switchTo().alert().getText();	     
		 driver.switchTo().alert().accept();
		 return this;
	 }
	 public boolean isAlertMessageDisplayed()
	 {
			return deletemessage.isDisplayed();
	 }
	 public ManageNewsPage clickNewNewsButton()
	 {
		 newnewsbutton.click();
		 return this;
	 }
	 public ManageNewsPage enterNewNews(String news)
	 {
		 newsinputfield.sendKeys(news);
		 return this;
	 }
	 public ManageNewsPage clickSaveNewsButton()
	 {
		 savenewsbutton.click();
		 return this;
	 }
	 public boolean isSaveMessageDisplayed()
	 {
		return savemessage.isDisplayed();
		
	 }
	

}
