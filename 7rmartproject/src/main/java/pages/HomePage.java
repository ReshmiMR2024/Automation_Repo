package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='More info ']") private WebElement adminmoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']") private WebElement contactlistmoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']") private WebElement managenewsmoreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']") private WebElement footertextmoreinfo;
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']") private WebElement productmoreinfobutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']") private WebElement moreinfosubcategory;	

	
	@FindBy(xpath="//a[@data-toggle='dropdown']")private WebElement adminimagebutton;
	@FindBy(css="a.dropdown-item[href='https://groceryapp.uniqassosiates.com/admin/logout']")private WebElement logoutbutton;
	@FindBy(xpath="//button[@type='submit']")private WebElement signinbutton;
	
	public AdminUserPage clickAdminMoreInfoButton()
	{
		adminmoreinfo.click();
		return new AdminUserPage(driver);
	}
	public ManageContactPage clickManageContactMoreInfoButton()
	{
		contactlistmoreinfo.click();
		return new ManageContactPage(driver);
	}
	public ManageNewsPage clickManageNewsMoreinfo()
	 {
		 managenewsmoreinfo.click();
		 return new ManageNewsPage(driver);
	 }
	public ManageFooterTextPage clickFooterTextMoreInfoButton() {
		footertextmoreinfo.click();
		return new ManageFooterTextPage(driver);
	}
	
	public ManageProductPage clickproductmoreinfobutton()
    {
	   productmoreinfobutton.click();
	   return new ManageProductPage(driver);
    }
	public SubCategoryPage clickmoreinfosubcategorybutton()
	{
		moreinfosubcategory.click();
		return new SubCategoryPage(driver);
	}
	public void clickOnAdminimagebutton() {
		adminimagebutton.click();
		
	}
	public void clickOnLogoutbutton() {
		logoutbutton.click();
	
	}
	public boolean isSigninButtonDisplayed() {
		return signinbutton.isDisplayed();
	}

	
	
}
