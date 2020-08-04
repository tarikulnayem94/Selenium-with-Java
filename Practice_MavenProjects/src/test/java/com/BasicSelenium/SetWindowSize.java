package com.BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowSize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.whoscored.com/");
		
		driver.manage().window().setSize(new Dimension(500, 500));
		
		driver.close();
		driver.quit();

	}

}
