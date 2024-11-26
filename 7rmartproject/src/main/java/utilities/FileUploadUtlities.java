package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtlities {
	public void fileUplaodusingSendKeys(WebElement element,String path)
	{
		element.sendKeys(path);
	}
	public void fileUplaodUsingRobotClass(WebElement element,String path) throws AWTException
	{
		StringSelection stringselection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		Robot robot = new Robot();
		robot.delay(2500);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL); //copy
		robot.keyPress(KeyEvent.VK_V); //paste
		robot.keyRelease(KeyEvent.VK_CONTROL); // button release
		robot.keyRelease(KeyEvent.VK_V); // button release
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}


}
