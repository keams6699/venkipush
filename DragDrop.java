package com.green;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement x = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
	WebElement y = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions actions = new Actions(driver);
	actions.dragAndDrop(x, y).perform();
	
	
	WebElement a = driver.findElement(By.xpath("//a[contains(text(),' 5000')]"));
	WebElement b = driver.findElement(By.className("placeholder"));
	Actions actions1 = new Actions(driver);
	actions1.dragAndDrop(a, b).perform();
	Thread.sleep(4000);
	WebElement x2 = driver.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
	WebElement y2 = driver.findElement(By.id("loan"));
	Actions actions2 = new Actions(driver);
	actions2.dragAndDrop(x2, y2).perform();
	 
	
	//Thread.sleep(3000);
	WebElement a2 = driver.findElement(By.xpath("//a[contains(text(),' 5000')]"));
	WebElement b2 = driver.findElement(By.id("amt8"));
	Actions actions3 = new Actions(driver);
	actions3.dragAndDrop(a2, b2).perform();
	
	WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]"));
	String text = findElement.getText();
	System.out.println(text);
	
}
}
