package com.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\selenium driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement search_Option = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input"));
		search_Option.sendKeys("iPhone");
		WebElement click_Search_Button = driver.findElement(By.cssSelector("#search > span > button"));
		click_Search_Button.click();

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).clear();
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("Mac");
		driver.findElement(By.cssSelector("#search > span > button")).click();
		
		
	}

}
