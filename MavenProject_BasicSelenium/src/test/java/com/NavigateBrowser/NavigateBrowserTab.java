package com.NavigateBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBrowserTab {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
					+ "\\src\\test\\resources\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.whoscored.com/");
			System.out.println(driver.getTitle());
			
			driver.navigate().to("https://www.google.com/");
			System.out.println(driver.getTitle());
			
			Thread.sleep(3000);
			driver.navigate().back();
			System.out.println(driver.getTitle());
			
			driver.navigate().forward();
			System.out.println(driver.getTitle());
			
			Thread.sleep(3000);
			driver.close();

	}

}
	
	
	