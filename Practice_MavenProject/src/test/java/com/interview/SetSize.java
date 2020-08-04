package com.interview;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetSize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().setSize(new Dimension(500, 500));
		
	}

}


