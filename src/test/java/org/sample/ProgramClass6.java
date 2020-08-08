package org.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramClass6 {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Admin\\eclipse-workspace\\DataProviderSample\\src\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				int last=0;
				String price=null;
				Set<Integer> s=new TreeSet<Integer>();
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone",Keys.ENTER);
			List<WebElement> l=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
				for(WebElement all:l) {
					 price=all.getText();
					String m=price.replace(",", "");
					
					 last=Integer.parseInt(m);
				     s.add(last);}
					for(Integer print: s) {
						System.out.println(print);
					}
					System.out.println("----------------");
					System.out.println("Second maximum amount is");
					System.out.println("----------------");
					List<Integer> store=new ArrayList(s);
					Collections.sort(store);
					
	
		System.out.println(store.get(store.size()-2));

					
					
					
						
				driver.quit();

				}
			}

