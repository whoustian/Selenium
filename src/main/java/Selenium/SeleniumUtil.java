package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

}
