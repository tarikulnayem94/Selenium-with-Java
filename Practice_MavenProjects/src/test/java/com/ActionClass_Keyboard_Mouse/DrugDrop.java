package com.ActionClass_Keyboard_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrugDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement dragbox1 = driver.findElement(By.id("box1"));
		WebElement dropbox101 = driver.findElement(By.id("box101"));

		WebElement dragbox3 = driver.findElement(By.id("box3"));
		WebElement dropbox103 = driver.findElement(By.id("box103"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(dragbox1, dropbox101);
		actions.dragAndDrop(dragbox3, dropbox103);
		
		actions.perform();
		
		
	}

}


