package org.eco;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Jcpenney {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\kumari\\Jcpenny\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jcpenney.com/");
	Actions a=new Actions(driver);
	WebElement ca=driver.findElement(By.id("shopDepartmentBtn"));
	a.moveToElement(ca).perform();
    WebElement women=driver.findElement(By.xpath("//a[text()='Women']"));
    a.moveToElement(women).perform();
    WebElement paint=driver.findElement((By.xpath("//a[text()='Pants']")));
  paint.click();
  List<WebElement> allpaints=driver.findElements(By.xpath("//h6[@data-automation-id='product-title']"));
	for (WebElement w: allpaints) {
		String p=w.getText();
		System.out.println(p);
		if (p.contains("Liz Claiborn")) {
			w.click();
		}
	}
		
	}
}





