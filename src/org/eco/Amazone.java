package org.eco;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazone {


public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\kumari\\Jcpenny\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone xr");
	driver.findElement(By.xpath("//header//div//div//div//div//div[@class='nav-right']")).click();
	//Actions a=new Actions(driver);
	List<WebElement> s=driver.findElements(By.xpath("(//span[text()='47,900'])[4]"));
	
	
	for (WebElement b : s) {
		String w=b.getText();
		System.out.println(w);
	}
	
}
}
