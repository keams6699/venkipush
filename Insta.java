package com.green;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	WebElement findElement = driver.findElement(By.xpath("//span[(text()='Sign up')]"));
	findElement.click();
	Thread.sleep(3000);
	WebElement findElement2 = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
	findElement2.sendKeys("keymon6699@gmail.com");
	WebElement findElement3 = driver.findElement(By.xpath("//input[@name='fullName']"));
	findElement3.sendKeys("venkatesh");
	WebElement findElement4 = driver.findElement(By.xpath("//input[@name='username']"));
	findElement4.sendKeys("keymon6699");
	WebElement findElement5 = driver.findElement(By.xpath("//input[@name='password']"));
	findElement5.sendKeys("keymon6699@");
	WebElement findElement6 = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
	findElement6.click();
	
}
}
