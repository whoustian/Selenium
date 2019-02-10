package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {

	public static void type(By object, String input) {
		WebElement element = SeleniumWebDriver.driver.findElement(object);
		element.sendKeys(input);
	}

	public static void sendKeys(By object, CharSequence keys) {
		WebElement element = SeleniumWebDriver.driver.findElement(object);
		element.sendKeys(keys);
	}

	public static void click(By object) {
		WebElement element = SeleniumWebDriver.driver.findElement(object);
		element.click();
	}

	public static String getText(By object) {
		WebElement element = SeleniumWebDriver.driver.findElement(object);
		return element.getText();
	}

	public static void waitForElementVisible(By object, int secondsToWait) {
		WebDriverWait wait = new WebDriverWait(SeleniumWebDriver.driver, secondsToWait);
		wait.until(ExpectedConditions.presenceOfElementLocated(object));
	}

}
