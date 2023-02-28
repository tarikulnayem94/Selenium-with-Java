package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://omayo.blogspot.com/");
		WebElement blog = driver.findElement(By.cssSelector("#cssmenu > ul > li.has-sub > a"));
		System.out.println(driver.getTitle());
		
		Actions action = new Actions(driver);
		action.moveToElement(blog).perform();
		
		blog.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		Thread.sleep(2000);
		WebElement targetElement = driver.findElement(By.cssSelector("#cssmenu > ul > li.has-sub > ul > li:nth-child(3) > a"));
//      targetElement.click();
		action.click(targetElement).perform();
		System.out.println(driver.getTitle());


		driver.navigate().to("https://www.cricbuzz.com/");
		System.out.println(driver.getTitle());

                WebElement team = driver.findElement(By.cssSelector("#teamDropDown > a"));
		
		action.moveToElement(team).perform();
		team.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		Thread.sleep(2000);
		WebElement targetElement2 = driver.findElement(By.cssSelector("#teamDropDown > nav > div > div:nth-child(1) > a:nth-child(5)"));
//       targetElement2.click();
		action.click(targetElement2).perform();
		System.out.println(driver.getTitle());

		driver.quit();
	}

}



