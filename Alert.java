package com.green;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement al = driver.findElement(By.className("analystic"));
		al.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		WebElement alertText = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertText.click();

		Thread.sleep(4000);
		WebElement text = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		text.click();
		org.openqa.selenium.Alert x = driver.switchTo().alert(); // ?
		x.sendKeys("venki");
		x.accept();
		WebElement findElement = driver.findElement(By.xpath("//p[@id='demo1']"));
		String text2 = findElement.getText();
		System.out.println(text2);

	}
}
