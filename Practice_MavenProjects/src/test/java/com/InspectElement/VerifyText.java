package com.InspectElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement logoTest = driver.findElement(By.cssSelector("#logo > h1 > a"));
		System.out.println(logoTest.getText());

		WebElement price = driver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.caption > p.price"));      
		System.out.println(price.getText());
		
		WebElement tax = driver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.caption > p.price > span"));
		System.out.println(tax.getText());

	}

}



