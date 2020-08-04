package com.PageLoadTimeCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoadTimeCheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
				+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		long startTime = System.currentTimeMillis();
		driver.get("https://www.google.com/");
		long endTime = System.currentTimeMillis();
		
		System.out.println("page title : " +driver.getTitle());
		
		long loadTime = (endTime-startTime)/1000;	
		System.out.println("total load Time : " +loadTime + " senond");	
		
	}

}


