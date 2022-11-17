package Altoro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class autoaltoro {
	
	WebDriver driver;
    @Test
	public  void main () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//usrin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testfire.net/index.jsp");
		driver.manage().window().maximize();
		
		//invalid credentials
		driver.findElement(By.xpath("//*[@id=\"LoginLink\"]/font")).click();
		driver.findElement(By.id("uid")).sendKeys("demo_user");
		driver.findElement(By.id("passw")).sendKeys("demo_password");
		driver.findElement(By.name("btnSubmit")).click();
	
		Thread.sleep(3000);
		
		//valid credentials
		driver.findElement(By.id("uid")).sendKeys("admin");
		driver.findElement(By.id("passw")).sendKeys("admin");
		driver.findElement(By.name("btnSubmit")).click();
		
		Thread.sleep(3000);
		
		//selecting account
		driver.findElement(By.id("MenuHyperLink1")).click();
		driver.findElement(By.name("listAccounts"));
		driver.findElement(By.xpath("//*[@id=\"listAccounts\"]/option[2]")).click();
		driver.findElement(By.id("btnGetAccount")).click();
		driver.findElement(By.id("btnGetAccount")).click();
		driver.findElement(By.id("MenuHyperLink3")).click();
		
		Thread.sleep(3000);		
		
		//Transfering the amount 
		driver.findElement(By.xpath("//*[@id=\"fromAccount\"]/option[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"toAccount\"]/option[2]")).click();
		
		driver.findElement(By.name("transferAmount")).sendKeys("9876");
		driver.findElement(By.id("transfer")).click();
		
		Thread.sleep(3000);
		
		//Contact us 
		driver.findElement(By.id("MenuHyperLink2")).click();
		
		driver.findElement(By.id("HyperLink3")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div[1]/p[2]/a")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("comments")).sendKeys("seen the recent transactions and balance is 147873388 ");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.xpath("//*[@id=\"LoginLink\"]/font")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
	    
	
		
	}
		
	


