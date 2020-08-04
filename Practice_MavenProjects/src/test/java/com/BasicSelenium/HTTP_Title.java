package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTTP_Title {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.whoscored.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}


