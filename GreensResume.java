package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GreensResume {
	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement from = driver.findElement(By.xpath("//div[@id='heading201']"));
	    from.click();
	    Thread.sleep(3000);
		WebElement resume = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
		resume.click();

		}
}
