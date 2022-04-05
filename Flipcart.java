package com.green;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);

		WebElement user= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		user.sendKeys("keymon6699@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    pass.sendKeys("123456");
		Thread.sleep(4000);
		WebElement buttonlogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		buttonlogin.click();
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		search.sendKeys("iphone 13");
//		WebElement c = driver.findElement(By.id("nav-search-submit-button"));
//		c.click();
//		
//		List<WebElement> all = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 13')]"));
//		for (int i=0; i<all.size();i++){
//		      System.out.println(all.get(i).getText());



		}

}
