package org.eco;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\kumari\\Jcpenny\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table");
	List<WebElement> trow = driver.findElements(By.tagName("tr"));
	for (WebElement rows : trow) {
		List<WebElement> data = driver.findElements(By.tagName("td"));
		for (WebElement tdata : data) {
			System.out.println(tdata.getText());
		}
		
	}
	/*String s=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr/td[2]")).getText();
	System.out.println(s);*/
	
	
	/* List<WebElement> row = driver.findElements(By.tagName("tr"));
	 for (WebElement trows : row) {
		List<WebElement> data = trows.findElements(By.tagName("td"));
	for (WebElement tdata: data) {
		
	
     String t=tdata.getText();
     if(t.equals("kumari")) {
    	 System.out.println(t);
     }
     else if(t.equals("Taipei")) {
    		 System.out.println(t);
    	 }
    	 }
     }*/
	}

}
