package com.green;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PressKeys {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venki\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	//to get url
	driver.get("http://greenscart.in/");
	Thread.sleep(3000);
	
	//To find and verify the locator of user Id name--> DUMMY1
	WebElement txtUserEmail = driver.findElement(By.id("loginEmailId"));
	txtUserEmail.sendKeys("keymon6699@gmail.com");
		
	Robot robot= new Robot();
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_SHIFT);
	
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_SHIFT);
	
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	
	robot.keyPress(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_N);
	
	robot.keyPress(KeyEvent.VK_K);
	robot.keyRelease(KeyEvent.VK_K);
	
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_A);
	
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_2);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_1);
	robot.keyRelease(KeyEvent.VK_1);
	
	robot.keyPress(KeyEvent.VK_9);
	robot.keyRelease(KeyEvent.VK_9);
	
	robot.keyPress(KeyEvent.VK_9);
	robot.keyRelease(KeyEvent.VK_9);
	
	robot.keyPress(KeyEvent.VK_4);
	robot.keyRelease(KeyEvent.VK_4);
	
	
	
	for (int i = 0; i < 2; i++) {
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	}
}


