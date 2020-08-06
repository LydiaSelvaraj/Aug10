package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample {

	@Test(dataProvider="res")
	public void login(String s1,String s2, String s3, String s4,String first, String last, String add,String ccard, String cvv) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\DataProviderSample\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		Thread.sleep(7000);
		
		WebElement txtUserName=driver.findElement(By.id("username"));
		txtUserName.sendKeys(s1);
		
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.sendKeys(s2);
		
		WebElement btnClick=driver.findElement(By.xpath("//input[@value='Login']"));
		btnClick.click();
		
		WebElement loc=driver.findElement(By.id("location"));
		Select s=new Select(loc);
		s.selectByIndex(1);
		
		WebElement hot=driver.findElement(By.id("hotels"));
		Select hoteltype=new Select(hot);
		hoteltype.selectByIndex(1);
		
		WebElement type=driver.findElement(By.id("room_type"));
		Select roomtype=new Select(type);
		roomtype.selectByIndex(1);
		
		WebElement roomNo=driver.findElement(By.id("room_nos"));
		Select room=new Select(roomNo);
		room.selectByIndex(1);
		
		
		
		WebElement date1=driver.findElement(By.name("datepick_in"));
		date1.sendKeys(s3);
		
		WebElement date2=driver.findElement(By.name("datepick_out"));
		date2.sendKeys(s4);
		
		WebElement adult=driver.findElement(By.id("adult_room"));
		Select s5=new Select(adult);
		s5.selectByIndex(1);
		
		WebElement sub=driver.findElement(By.id("Submit"));
		sub.click();
		
		WebElement rd=driver.findElement(By.name("radiobutton_0"));
		rd.click();
		
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		
		WebElement firstname=driver.findElement(By.name("first_name"));
		firstname.sendKeys(first);
		
		
		WebElement lastname=driver.findElement(By.name("last_name"));
		lastname.sendKeys(last);
		
		WebElement address=driver.findElement(By.name("address"));
		address.sendKeys(add);
		
		WebElement ccno=driver.findElement(By.name("cc_num"));
		ccno.sendKeys(ccard);
		
		WebElement ctype=driver.findElement(By.name("cc_type"));
		Select type1=new Select(ctype);
		type1.selectByIndex(1);
		 
		WebElement expmonth=driver.findElement(By.name("cc_exp_month"));
		Select type2=new Select(expmonth);
		type2.selectByIndex(1);
		 
		 
		WebElement expyear=driver.findElement(By.name("cc_exp_year"));
		Select type3=new Select(expyear);
		type3.selectByIndex(10);
		 
		WebElement cv=driver.findElement(By.name("cc_cvv"));
		 cv.sendKeys(cvv);
		 
		 WebElement book=driver.findElement(By.id("book_now"));
		 book.click();
		 
		 Thread.sleep(7000);
		 
		 WebElement print=driver.findElement(By.id("order_no"));
			
			String store=print.getAttribute("value");
			System.out.println(store);
	}
		
		@DataProvider(name="res", parallel=true)
		public Object[][] data(){
			return new Object[][] {{"sssaravinth30","Aravinth","04/09/2020","07/09/2020","Lydia","Selvaraj","Bangalore","5678765678904323","786"},
				                   {"Suganyasugan","Suganya90","09/10/2020","10/10/2020","Suganya","meeran","Trichy","9876543212345678","980"},
				                   {"chamumadhu","4O3DR0","09/10/2020","10/10/2020","Chamu","madhu","Erode","9876543292345678","990"},
				                   {"edwinraj","edwin@123","09/10/2020","10/10/2020","Edwin","Raj","Cochin","9876543252345678","960"},
				                   {"kalaivinitha","W24133","09/10/2020","10/10/2020","Kalai","Raj","Cochin","9876543252305678","969"},
				                   {"Abhimanyuu","Password01","09/10/2020","10/10/2020","Kalai","Raj","Cochin","9876543252305678","969"},
				                   {"divyamathi","BKX9A5","09/10/2020","10/10/2020","Kalai","Raj","Cochin","9876543252305678","969"},
				                   };
			
		}
		
	
}
