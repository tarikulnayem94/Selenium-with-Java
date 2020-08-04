package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium_Chrome_Open {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\selenium driver\\chromedriver_83\\chromedriver.exe");
				
//				System.getProperty("\\src\\Driver\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
