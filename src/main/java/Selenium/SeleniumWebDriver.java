package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver {

	public static WebDriver driver;

	public static void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserAutomation\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver(options);
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

	public static void closeBrowser() {
		driver.quit();
	}

}
