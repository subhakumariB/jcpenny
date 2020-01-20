package org.eco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sun {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\kumari\\Jcpenny\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.sunwing.ca/");
	//driver.navigate().to("https://www.google.com");
	
	/*driver.findElement(By.xpath("//a[text()='Flights']")).click();
	driver.findElement(By.xpath("//input[@class='ui-autocomplete-input form-control']")).sendKeys("bago");
	*/
}
}