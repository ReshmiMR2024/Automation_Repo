package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public WebDriver driver;
	@BeforeMethod
	public void intializeBrowser()
	{
		
	 driver=new ChromeDriver();//browser initialization or loading the driver
	 driver.get("https://groceryapp.uniqassosiates.com/admin");//to launch url
	 driver.manage().window().maximize();
	}
	@AfterMethod
	public void quitAndClose()
	{
		//driver.close();to close the parent window
		//driver.quit();//to close all the open windows
	}
}
