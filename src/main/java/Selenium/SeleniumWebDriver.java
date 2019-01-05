package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {

	public static WebDriver driver;

	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserAutomation\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void goToUrl(String url) {
		driver.get(url);
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static void closeBroswer() {
		driver.quit();
	}

}
