package org.eco;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\kumari\\Jcpenny\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/iframe-practice-page");
	WebElement  size = driver.findElement(By.id("IF2"));
	System.out.println(size);
	driver.switchTo().frame(0);
	driver.findElement(By.name("firstname")).sendKeys("venkat");

}
}
