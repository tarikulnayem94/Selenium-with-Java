package com.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "G:\\selenium driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		WebElement dropDownDay = driver.findElement(By.id("day"));
		WebElement dropDownMonth = driver.findElement(By.id("month"));
		WebElement dropDownYear = driver.findElement(By.id("year"));
		
		Select dropdownDay = new Select(dropDownDay);
		Select dropdownMonth = new Select(dropDownMonth);
		Select dropdownYear = new Select(dropDownYear);
		
		dropdownDay.selectByIndex(10);
		dropdownMonth.selectByIndex(10);
		dropdownYear.selectByValue("1994");
			
//		System.out.println(dropDownDay.getText());
		
		Select select = new Select(driver.findElement(By.name("birthday_day")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
	}

}


