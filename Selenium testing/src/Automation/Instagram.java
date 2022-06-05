package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/");
			Thread.sleep(4000);
		//	WebElement user=driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		//	WebElement password=driver.findElement(By.xpath("//input[@aria-label='Password']"));
			WebElement loginFB=driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
			 Thread.sleep(5000);
			loginFB.click();
			WebElement user1=driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
             Thread.sleep(4000);
            user1.sendKeys("akashkale472@gmail.com") ;
            WebElement password1=driver.findElement(By.xpath("//input[@type='password']"));
            password1.sendKeys("9404602983");
            WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
            Thread.sleep(6000);
             loginButton.click();
             Thread.sleep(10000);
			 WebElement turnOn=driver.findElement(By.xpath("//button[text()='Not Now']"));
			 Thread.sleep(8000);
			 turnOn.click();
			 
			 WebElement image=driver.findElement(By.xpath("//span[@class='_2dbep qNELH']"));
			 Thread.sleep(5000);
			 image.click();
			 
			 WebElement logout=driver.findElement(By.xpath("//div[text()='Log Out']"));
			 Thread.sleep(5000);
			 logout.click();
			  
			 
//			 WebElement profile=driver.findElement(By.xpath("//div[text()='Profile']"));
//			 profile.click();
//			 Thread.sleep(8000);
//			 
}
}