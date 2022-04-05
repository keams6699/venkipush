package com.green;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenscart.in/");
	Thread.sleep(4000);	
	WebElement login = driver.findElement(By.xpath("//input[@id='loginEmailId']"));
	login.sendKeys("keymon6699@gmail.com");
	driver.manage().window().maximize();
	
	WebElement psw = driver.findElement(By.id("loginPassword"));
	psw.sendKeys("Venki@6699");
//	Thread.sleep(4000);	
	WebElement logIn = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
	logIn.click();
	Thread.sleep(3000);
	WebElement mobile = driver.findElement(By.xpath("//a[text()='MOBILE']"));
	mobile.click();
	
	WebElement iphone = driver.findElement(By.xpath("//img[@class='card-img-top']"));
    iphone.click();
    
    WebElement buy = driver.findElement(By.xpath("//button[@class='btn btn-warning btn-long buy buttonKart']"));
	buy.click();
	
    WebElement gift = driver.findElement(By.xpath("//button[@class='btn btn-block btn-outline-primary btn-lg']"));
    gift.click();
	
	WebElement code = driver.findElement(By.xpath("//span[text()='GRN10']"));
	Actions actions = new Actions(driver);
	actions.doubleClick(code).perform();
	
	WebElement x = driver.findElement(By.xpath("//span[@class='px-1 close']"));
	Actions actions2=new Actions(driver);
	actions2.contextClick(x).perform();
	Thread.sleep(3000);

	WebElement removex = driver.findElement(By.xpath("//div[text()='Remove Promo Code ']"));
	removex.click();
}
}
