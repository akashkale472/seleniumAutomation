package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbApplicationHeader {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
			user.sendKeys("akashkale472@gmail.com");
			
			WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("9404602983");
			Thread.sleep(3000);
			
			WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
			loginButton.click();
			Thread.sleep(3000);
			
//			WebElement messanger=driver.findElement(By.xpath("(//div[@aria-label='Messenger'])[1]"));
//			messanger.click();
//			Thread.sleep(5000);
//			
//			WebElement searchMessanger=driver.findElement(By.xpath("//input[@aria-label='Search Messenger']"));
//			searchMessanger.sendKeys("vijay shelke");
//			Thread.sleep(5000);
//			
//			WebElement vijay=driver.findElement(By.xpath("(//span[text()='Vijay Shelke'])[2]"));
//			vijay.click();
//			
//			WebElement message=driver.findElement(By.xpath("//div[@aria-label='Message']"));
//			message.sendKeys("ok boss");
//			Thread.sleep(5000);
//			
//			WebElement enter=driver.findElement(By.xpath("//div[@aria-label='Press Enter to send']"));
//			enter.click();
			
			WebElement notification=driver.findElement(By.xpath("//a[@aria-label='Notifications']"));
			notification.click();
//			
//			WebElement profile=driver.findElement(By.xpath("//div[@aria-label='Your profile']"));
//			profile.click();
//			Thread.sleep(10000);
//			
//			WebElement logout=driver.findElement(By.xpath("//span[text()='Log Out']"));
//			logout.click();
			
			
}
}