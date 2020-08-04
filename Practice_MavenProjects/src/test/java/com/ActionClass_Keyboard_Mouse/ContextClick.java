package com.ActionClass_Keyboard_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("/html/body/header/div/nav/div[6]"));
		
		actions.clickAndHold(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.DOWN)
		.sendKeys(Keys.ARROW_DOWN).click();
		
		
	}

}


