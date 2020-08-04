package com.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium driver\\chromedriver_83\\chromedriver.exe");

		final ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.google.com/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
