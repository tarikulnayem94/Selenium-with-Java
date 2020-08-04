package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {

	public static void main(String[] args) throws InterruptedException   {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		// find drop down option.............
		WebElement dropDownElementDay = driver.findElement(By.name("birthday_day"));
		WebElement dropDownEelementMonth = driver.findElement(By.name("birthday_month"));

		// create object for select class.............
		dropDownElementDay.click();
		Thread.sleep(3000);
		Select dropDownDay = new Select(dropDownElementDay);
		dropDownDay.selectByIndex(10);

		dropDownEelementMonth.click();
		Thread.sleep(3000);
		Select dropDownMonth = new Select(dropDownEelementMonth);
		dropDownMonth.selectByValue("10");
		
	}

}


