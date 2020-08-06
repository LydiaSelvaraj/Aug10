package org.sample;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//display the mobiles price greater than 50000
public class ProgramTask4 {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\eclipse-workspace\\DataProviderSample\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	int last=0;
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone",Keys.ENTER);
List<WebElement> l=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	for(WebElement all:l) {
		String price=all.getText();
		String m=price.replace(",", "");
		last=Integer.parseInt(m);
		 if(last>50000)
		{
			System.out.println(last);
	}
	
	}	
	driver.quit();

	}
}
