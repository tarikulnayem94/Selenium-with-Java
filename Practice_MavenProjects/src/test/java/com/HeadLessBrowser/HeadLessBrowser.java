package com.HeadLessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();

		// Set Firefox HeadLess............................
		options.setHeadless(true);

		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());

	}

}
