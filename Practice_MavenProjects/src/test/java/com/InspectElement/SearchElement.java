package com.InspectElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys("iPhone");
		WebElement searchButton = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button"));
		searchButton.click();
		System.out.println("Actual Title : "+ driver.getTitle());
//		Thread.sleep(5000);
//		searchBox.clear();
//		searchBox.sendKeys("MacBook");
//		searchButton.click();
	
		String actualTitle = driver.getTitle();
		String expectedTitle = "Search - iPhone";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("testing successful");
		}
		else {
			System.out.println("testing failed");
		}
		
	}

}



