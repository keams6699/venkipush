package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonClick {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("iphone");
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();


		}
}
