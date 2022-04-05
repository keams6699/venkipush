package com.green;
import java.awt.AWTException;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HotelBook {

	private static final String outputType = null;
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Venki\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
	Thread.sleep(3000);
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	Thread.sleep(3000);
	WebElement a = driver.findElement(By.id("username"));
	a.sendKeys("keymon6699");
	WebElement s = driver.findElement(By.id("password"));
	s.sendKeys("Venkat@1994");
	WebElement log = driver.findElement(By.id("login"));
	log.click();
	Thread.sleep(3000);
	WebElement loca = driver.findElement(By.id("location"));
	loca.click();
	Select select = new Select(loca);
	select.selectByIndex(5);
	WebElement hotel = driver.findElement(By.id("hotels"));
	hotel.click();
	Select s1 = new Select(hotel);
	s1.selectByIndex(3);
	WebElement room = driver.findElement(By.id("room_type"));
	room.click();
	Select s2 = new Select(room);
	s2.selectByIndex(4);
	WebElement roomNo = driver.findElement(By.id("room_nos"));
	roomNo.click();
	Select s3 = new Select(roomNo);
	s3.selectByIndex(2);
	WebElement k = driver.findElement(By.id("Submit"));
	k.click();
	WebElement l = driver.findElement(By.id("radiobutton_0"));
	l.click();
	WebElement z = driver.findElement(By.id("continue"));
	z.click();
	WebElement x = driver.findElement(By.id("first_name"));
	//tab
	x.sendKeys("venki");
	WebElement c = driver.findElement(By.id("last_name"));
	c.sendKeys("keams");
	WebElement v = driver.findElement(By.id("address"));
	v.sendKeys("perambur");
	WebElement b= driver.findElement(By.id("cc_num"));
	b.sendKeys("1234567788909976");
	WebElement cc = driver.findElement(By.id("cc_type"));
	cc.click();
	Select s6 = new Select(cc);
	s6.selectByIndex(2);
	WebElement m = driver.findElement(By.id("cc_exp_month"));
	m.click();
	Select s7 = new Select(m);
	s7.selectByIndex(2);
	m.click();
	WebElement o = driver.findElement(By.id("cc_exp_year"));
	o.click();
	Select s8 = new Select(o);
	s8.selectByIndex(5);
	o.click();
	WebElement i = driver.findElement(By.id("cc_cvv"));
	i.sendKeys("1234");
	WebElement u = driver.findElement(By.id("book_now"));
	u.click();
	Thread.sleep(6000);
	WebElement t = driver.findElement(By.id("order_no"));
	String text = t.getAttribute("value");//attribute value
	System.out.println(text);
	TakesScreenshot screenshot= (TakesScreenshot)driver;
	File u1 = screenshot.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\jerolim\\Pictures\\selenium/closon.png");
	FileUtils.copyFile(u1, dest);
	
	}


	
}
