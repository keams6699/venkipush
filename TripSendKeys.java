package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TripSendKeys {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.cleartrip.com/trains");
		WebElement txtfrom = driver.findElement(By.xpath("//input[@title='From station']"));
		txtfrom.sendKeys("chennai");
		WebElement txtto = driver.findElement(By.xpath("//input[@title='To station']"));
		txtto.sendKeys("madurai");

		WebElement buttonsearch = driver.findElement(By.xpath("//button[@id='trainFormButton']"));

		   buttonsearch.click();
		}
		
}
