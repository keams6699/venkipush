package com.green;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closon {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
 WebElement s = driver.findElement(By.id("customers"));
 List<WebElement> f = s.findElements(By.tagName("tr"));
 for (int i = 5; i < f.size(); i++) {
	  
		
	
	WebElement element = f.get(i);

 List<WebElement> elements = element.findElements(By.tagName("td"));
 for (int j = 0; j < elements.size(); j++) {
	

 WebElement text = elements.get(j);
 
 if (text.equals("UK")) {
	

 System.out.println(text);
 }
 }
 }
	}	
}		
	


