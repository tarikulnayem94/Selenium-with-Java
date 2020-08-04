package com.PageLoadTimeCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeCheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
				+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		long startTime = System.currentTimeMillis();
		driver.get("https://www.google.com/");
		long endTime = System.currentTimeMillis();
		
		long loadTime = (startTime-endTime);
		System.out.println(loadTime/1000 + " seconds");
		
	}

}


