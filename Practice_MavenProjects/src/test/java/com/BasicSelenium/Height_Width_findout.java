package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_Width_findout {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.whoscored.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		int height = driver.manage().window().getSize().height;
		int width = driver.manage().window().getSize().width;
		
		System.out.println(height +";"+ width);
		System.out.println(driver.manage().window().getSize().getHeight());
//		driver.manage().window().fullscreen();
		
		String expectedTitle = "Football Statistics || Football Live Scores | WhoScored.com";
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is ok");
		}
		else
		{
			System.out.println("title is not ok" + "\n" + "actual Title"+ actualTitle);
		}
		
	}

}



