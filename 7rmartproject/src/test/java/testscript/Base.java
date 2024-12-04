package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;
import utilities.ScreenShotUtiility;
import utilities.WaitUtlities;

public class Base {

	public WebDriver driver;
	public Properties properties;
	public FileInputStream fileinputstream;
	public  ScreenShotUtiility scrshot;
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void intializeBrowser(String browser) throws Exception
	{
		try {
			properties = new Properties();
			fileinputstream = new FileInputStream(Constants.CONFIG_FILE);
			properties.load(fileinputstream);
			
		}
		catch(Exception e){
			System.out.println("Error");
		}
		
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
		
		
	// driver.get("https://groceryapp.uniqassosiates.com/admin");//to launch url
		driver.get(properties.getProperty("url"));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtlities.ImplicitWait));
	 driver.manage().window().maximize();
	}
	@AfterMethod(alwaysRun=true)
	/*public void quitAndClose()
	{
		//driver.close();//to close the parent window
		//driver.quit();//to close all the open windows
		

			driver.quit();
		}*/
	public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			scrshot = new ScreenShotUtiility();
			scrshot.getScreenShot(driver, iTestResult.getName());
		}
	}
}
