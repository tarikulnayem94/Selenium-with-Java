package com.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchProduct {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("razer blade laptop");

		WebElement searchButton = driver
				.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		searchButton.click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Search - razer blade laptop";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("title pass");
		} else {
			System.out.println("title fail");
			System.out.println(driver.getTitle());
		}

	}

}
