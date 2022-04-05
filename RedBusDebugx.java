package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RedBusDebugx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("[class='icon-profile-new-unsigned ']"));
		Thread.sleep(3000);

		findElement.click();
		Thread.sleep(5000);
		WebElement sign = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		Thread.sleep(3000);

		sign.click();

		WebElement mob = driver.findElement(By.xpath("(//input[@id='mobileNoInp'])[1]"));
		mob.sendKeys("7094221679");
}
}
