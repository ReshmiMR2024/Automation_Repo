package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	WebDriver driver;

	public ManageFooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[contains(@href,'admin/Footertext/edit?edit=2')]")	private WebElement editbutton;
	@FindBy(xpath = "//textarea[@id='content']") private WebElement addressinput; //
	@FindBy(xpath = " //button[@name='Update']") private WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") private WebElement alertmessage;

	

	public ManageFooterTextPage clickOnEditButton() {
		editbutton.click();
         return this;
	}

	public ManageFooterTextPage editAddressField(String address) {
		// addressinput.click();
		addressinput.clear();
		addressinput.sendKeys(address);
		return this;
	}

	public ManageFooterTextPage clickOnUpdateButton() {
		updatebutton.click();
		return this;
	}

	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}

	public ManageFooterTextPage isUpdateButtonVisible() {

		if (updatebutton.isDisplayed()) {
			System.out.println("Update button is displayed.");
		} else {
			System.out.println("Update button is not displayed.");
		}
		return this;
	}

}
