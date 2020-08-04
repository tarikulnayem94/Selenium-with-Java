package com.iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/iframe");	
		driver.switchTo().frame("mce_0_ifr");
		
		WebElement iFrame = driver.findElement(By.xpath("/html/body/p"));
		iFrame.clear();
		iFrame.sendKeys("selenium test automation");
		
	}

}


