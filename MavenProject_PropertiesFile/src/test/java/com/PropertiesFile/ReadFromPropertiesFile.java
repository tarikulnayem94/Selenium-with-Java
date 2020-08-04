package com.PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\Properties File\\ObjectRepository.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);

		System.out.println("Browser Config...........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println(properties.getProperty("TestSite"));
		driver.get(properties.getProperty("TestSite"));

		driver.findElement(By.name(properties.getProperty("googleSearchBox")))
				.sendKeys(properties.getProperty("SendKeys"));
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[3]/center/input[1]")).click();

	}

}

