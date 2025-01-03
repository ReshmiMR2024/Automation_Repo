package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtlities {

	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}
	
	public void dragAndDrop(WebElement dragableItem, WebElement dropItem, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dragableItem, dropItem);
	}

	public void singleClick(WebElement dragableItem, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(dragableItem).click().perform();
	}

	public void doubleClick(WebElement dragableItem, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick(dragableItem).perform();

	}

	public void rightClick(WebElement dragableItem, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.contextClick(dragableItem);
	}
}
