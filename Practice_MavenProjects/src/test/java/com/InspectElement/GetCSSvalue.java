package com.InspectElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSvalue {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement nameBox = driver.findElement(By.cssSelector("#input-firstname"));
		Dimension size = nameBox.getSize();
		System.out.println(size);
		
		String bgColor = nameBox.getCssValue("background-color");
		System.out.println(bgColor);
		
		String borderRadius = nameBox.getCssValue("border-radius");
		System.out.println(borderRadius);
		
		String padding = nameBox.getCssValue("padding-top");
		System.out.println(padding);
		
		String lineHeight = nameBox.getCssValue("line-height");
		System.out.println(lineHeight);
		
		String color = nameBox.getCssValue("color");
		System.out.println(color);
		
		
	}

}

