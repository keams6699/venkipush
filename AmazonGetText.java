package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonGetText {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement amazontxt = driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
		String text = amazontxt.getText();
		System.out.println(text);
	}
}
