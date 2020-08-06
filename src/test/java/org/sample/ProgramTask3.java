package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//to pass values in dataprovider to search and print all the products listed 
public class ProgramTask3 {
	
	@Test(dataProvider="mobiles")
public void search(String s1)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\DataProviderSample\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s1,Keys.ENTER);
		List<WebElement> phoneList = driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));
		
		for(int i=0;i<phoneList.size();i++) {
			System.out.println(phoneList.get(i).getText());
		}
driver.quit();	
 }
	@DataProvider(name="mobiles")
	public Object[][] add(){
		return new Object[][] {{"iphone"},
		                       {"vivo"},
		                       {"samsung"},
		                       {"Oppo"},
		                       {"Honor"},
		                       {"one plus"},
		                       {"lenovo"},
		                       {"redmi"},
		                       {"Nokia"},{"mi"}};
		
	}
	
}
