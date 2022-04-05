package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Mythra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/\r\n");
		WebElement txt = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txt.sendKeys("8072936867");
		WebElement btn = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btn.click();
		}
}
