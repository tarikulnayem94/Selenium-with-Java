package com.SecureSocketsLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLcheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		

		// Accept Secure Sockets Layer Certificate...............
//		firefoxOptions.setAcceptInsecureCerts(true);

		// Deny Secure Sockets Layer Certificate...............
//		firefoxOptions.setAcceptInsecureCerts(false);

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cacert.org/");

		System.out.println(driver.getTitle());

	}

}
