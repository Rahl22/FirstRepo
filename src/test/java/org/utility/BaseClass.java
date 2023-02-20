package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public  static WebDriver driver;
	
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void fill(WebElement ele, String val) {
		ele.sendKeys(val);
	}
	public static void click(WebElement ele) {
		ele.click();
	}
	public static void close() {
		driver.close();
	}
	public static void move_cursor(WebElement ele) {
		Actions acc = new Actions(driver);
		acc.moveToElement(ele);

	}
	
}