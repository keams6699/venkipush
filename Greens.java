package com.green;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.greenstechnologys.com/careers.html");
	Thread.sleep(3000);
	WebElement overview = driver.findElement(By.xpath("//span[@title='Overview']"));
	overview.click();
	WebElement text = driver.findElement(By.xpath("//p[contains(text(),' In this best ')]"));
	Thread.sleep(3000);
	String data = text.getText();
	System.out.println(data);
}
}
