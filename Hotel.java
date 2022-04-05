package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches The Adactin Hotel App!')]"));
		String data = txt.getText();
		System.out.println(data);



		}

}
