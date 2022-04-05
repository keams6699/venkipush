package com.green;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {


		public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");

		WebElement element = driver.findElement(By.xpath("(//div[@class='leftD'])"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\Venki\\Pictures/Venki.png");
		Thread.sleep(3000);
		FileUtils.copyFile( source, dst);

		driver.close();

		}

		}


