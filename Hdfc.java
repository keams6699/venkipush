package com.green;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		//Thread.sleep(3000);
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement UserID = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		Thread.sleep(3000);
		UserID.sendKeys("hello");
		
		
		
		
		
}

}




