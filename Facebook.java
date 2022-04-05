package com.green;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement findElement = driver.findElement(By.xpath("//div[@class='_6ltg'][2]"));
	findElement.click();
	Thread.sleep(3000);
	WebElement findElement2 = driver.findElement(By.xpath("//input[@name='firstname']"));
	findElement2.sendKeys("venki");
	
	WebElement findElement3 = driver.findElement(By.xpath("//input[@name='lastname']"));
	findElement3.sendKeys("praveen");
	
	WebElement findElement4 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	findElement4.sendKeys("keymon6699@gmail.com");

	WebElement findElement5 = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	findElement5.sendKeys("keymon6699@gmail.com");
	Thread.sleep(3000);
	WebElement findElement6 = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	findElement6.sendKeys("6699");
	
	WebElement findElement7 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	findElement7.sendKeys("20");
	


}
}
