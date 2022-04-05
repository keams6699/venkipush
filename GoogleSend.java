package com.green;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSend {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		        WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp\r\n");
		WebElement name = driver.findElement(By.xpath("//input[@name='firstName']"));
		name.sendKeys("venki");
		WebElement txtpass = driver.findElement(By.xpath("//input[@name='lastName']"));
		txtpass.sendKeys("keams");
		WebElement user = driver.findElement(By.xpath("//input[@name='Username']"));
		user.sendKeys("keymon6699@gmail.com");
		WebElement email = driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]"));
		email.sendKeys("123456");
		WebElement txtph = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		txtph.sendKeys("123456");


		WebElement txtgender = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]"));
		txtgender.click();
		}
}
