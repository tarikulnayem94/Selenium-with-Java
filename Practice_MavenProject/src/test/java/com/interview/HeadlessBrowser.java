package com.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "G:\\selenium driver\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		
		options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}




