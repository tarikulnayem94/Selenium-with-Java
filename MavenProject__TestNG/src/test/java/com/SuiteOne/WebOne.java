package com.SuiteOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebOne {
	WebDriver driver;
	String username = "tarikul.ewu@gmail.com"; // Change to your username and passwrod
	String password = "Nayem2888";

	// This method is to navigate flipkart URL
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}

	// To log in opencart
	@Test
	public void login() {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input[1]")).click();
	}

	// Search For product
	@Test
	public void searchAndSelectProduct() {
		driver.findElement(By.name("search")).sendKeys("iPhone");
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
	}

	@Test
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
	}

	@AfterClass
	public void quit() {
		driver.close();
	}
	
}


