package com.TestNGDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Util.TestUtil;

public class LoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void openSite() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");		
	}
	
	@DataProvider
	public Object[][] getLoginData(){
		Object data [][] = TestUtil.getTestData("login");
		return data;
	}
	
	@Test (dataProvider = "getLoginData")
	public void loginTest(String userName, String passWord)
	{
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input[1]")).click();	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
}

