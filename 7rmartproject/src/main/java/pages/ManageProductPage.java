package pages;

import org.openqa.selenium.JavascriptExecutor;
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
		
	
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-product']") private WebElement moreinfobutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']") private WebElement newbutton;	
	@FindBy(xpath="//input[@id='title']") private WebElement titleinput;
	@FindBy(xpath="//input[@name='type' and @value='Nonveg']") private WebElement producttyperadio;	
	@FindBy(xpath="//input[@id='m_weight']") private WebElement weightprice;
	@FindBy(xpath="//input[@id='w_price']") private WebElement price ;
	@FindBy(xpath="//input[@id='w_stock']") private WebElement stockinput;
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
   public void enterweightPrice(String weight)
   {
	   weightprice.sendKeys(weight);
   }
   public void enterPrice(String priceval)
   {
	   price.sendKeys(priceval);
   }
   public void enterStock(String stock)
   {
		stockinput.sendKeys(stock);
	}
   
   public void clickOnSavebutton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",savebutton);
		//savebutton.click();
	}
   public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}
   
}
