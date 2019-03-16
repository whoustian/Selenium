package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

	public By locator;
	public String valueType;

	public PageObject(By locator, String valueType) {
		this.locator = locator;
		this.valueType = valueType;
	}

	public By getLocator() {
		return locator;
	}

	public void setLocator(By locator) {
		this.locator = locator;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public void setValue(String input) {
		WebElement element = SeleniumWebDriver.driver.findElement(locator);
		element.sendKeys(input);
	}

	public void sendKeys(CharSequence keys) {
		WebElement element = SeleniumWebDriver.driver.findElement(locator);
		element.sendKeys(keys);
	}

	public void click() {
		WebElement element = SeleniumWebDriver.driver.findElement(locator);
		element.click();
	}

	public String getText() {
		WebElement element = SeleniumWebDriver.driver.findElement(locator);
		return element.getText();
	}

	public void waitForVisible(int secondsToWait) {
		WebDriverWait wait = new WebDriverWait(SeleniumWebDriver.driver, secondsToWait);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
