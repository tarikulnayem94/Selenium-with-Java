package com.ActionClass_Keyboard_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///G:/8th%20Class/11.%20Mouse%20and%20Keyboard/MouseHover.html");
		WebElement element = driver.findElement(By.cssSelector("body > p"));

		Actions actions = new Actions(driver);

		Thread.sleep(3000);
		actions.moveToElement(element).build().perform();

	}

}


