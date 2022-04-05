package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwiggySendKeys {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement txt = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		txt.click();
		WebElement text = driver.findElement(By.xpath("//input[@id='mobile']"));
		text.sendKeys("8072936867");
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("venki");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("keymon6699@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("123456");
	}
	
	
	
}
