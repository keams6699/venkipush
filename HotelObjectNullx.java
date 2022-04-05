package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelObjectNullx {
private static final Object user = null;

@SuppressWarnings("unused")
public static void main(String[] args) throws InterruptedException  {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
Thread.sleep(3000);
WebDriver driver = new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
Thread.sleep(3000);
WebElement a3 = driver.findElement(By.id("username"));
Thread.sleep(3000);
JavascriptExecutor s= (JavascriptExecutor)driver;
s.executeScript("arguments[0].SetAttributes('value','closon')",user);
System.out.println("name");
}
}

	