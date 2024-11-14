package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		/*//@FindBy(xpath="//input[@type='text']")private WebElement usernameField;
		//WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		@FindBy(xpath="//input[@name='username']")private WebElement usernamefield;
		//WebElement password=driver.findElement(By.name("password"));
		@FindBy(name="password")private WebElement passwordfield;		
		//WebElement btnsignin=driver.findElement(By.xpath("//button[@type='submit']"));
		@FindBy(xpath="//button[@type='submit']")private WebElement btnsignin;		
		//WebElement dashboardvalue=driver.findElement(By.xpath("//p[text()='Dashboard']"));
		@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboardvalue;*/
	@FindBy(xpath="//input[@name='password']") private WebElement passwordfield;
	@FindBy(xpath="//input[@name='username']") private WebElement usernamefield;
	@FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") private WebElement alertmsg;
	@FindBy(xpath="//p[text()='Dashboard']") private WebElement dashboardvalue;
		public void enterusernameonusernamefield(String username)
		{
			usernamefield.sendKeys(username);
		}
		public void enterpasswordonpasswordfield(String password)
		{
			passwordfield.sendKeys(password);
		}
		public void clicksigninbutton()
		{
			signinbutton.click();
		}
		public boolean isHomepageDisplayed()
		{
			return dashboardvalue.isDisplayed();
		}
		public boolean isLoginErrorDisplayed()
		{
			return alertmsg.isDisplayed();
		}
	}
	


