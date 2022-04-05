package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoRadio {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		        WebDriver driver= new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Register.html");
		WebElement first = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		first.sendKeys("venki");
		WebElement last = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		last.sendKeys("keams");
		WebElement txtadd = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtadd.sendKeys("perambur");
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("keymon6699@gmail.com");
		WebElement txtph = driver.findElement(By.xpath("//input[@type='tel']"));
		txtph.sendKeys("8072936867");


		WebElement txtgender = driver.findElement(By.xpath("//input[@value='Male']"));
		txtgender.click();

		WebElement txt = driver.findElement(By.xpath("//input[@value='Movies']"));
		txt.click();
}
}