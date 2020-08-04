package com.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NormalAlert {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}


