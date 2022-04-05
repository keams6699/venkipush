package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FbClick {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("keymon6699@gmail.com");
		WebElement pass = driver.findElement(By.xpath (" //input[@name='pass']"));
		pass.sendKeys("Venki@1994");
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
	}
}
