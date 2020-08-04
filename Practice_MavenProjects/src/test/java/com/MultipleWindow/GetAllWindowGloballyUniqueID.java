package com.MultipleWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllWindowGloballyUniqueID {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/windows");

		String parentGUID = driver.getWindowHandle();
		System.out.println("parent window GUID : " + parentGUID);

	}

}
