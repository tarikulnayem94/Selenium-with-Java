package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSelenium_Firefox_Open {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\selenium driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}
	
}
