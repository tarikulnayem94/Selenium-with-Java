package com.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium driver\\chromedriver_83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement searchOption = driver
				.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));

		searchOption.sendKeys("The capital city of Bangladesh");

		WebElement searchButton = driver
				.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[3]/center/input[1]"));

		searchButton.click();
		
		
		
	}

}
