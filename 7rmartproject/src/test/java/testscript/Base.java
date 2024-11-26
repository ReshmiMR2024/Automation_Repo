package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.WaitUtlities;

public class Base {

	public WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void intializeBrowser(String browser) throws Exception
	{
		
	 //driver=new ChromeDriver();//browser initialization or loading the driver
		if(browser.equalsIgnoreCase("Chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new Exception("Incorrect Browser");
		}
		
		
	 driver.get("https://groceryapp.uniqassosiates.com/admin");//to launch url
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtlities.ImplicitWait));
	 driver.manage().window().maximize();
	}
	@AfterMethod
	public void quitAndClose()
	{
		driver.close();//to close the parent window
		//driver.quit();//to close all the open windows
	}
}
