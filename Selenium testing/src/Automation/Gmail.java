package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com/");
	WebElement user=driver.findElement(By.xpath("//input[@type='email']"));
	user.sendKeys("akashkale472@gmail.com");
	
//	WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
//	next.click();
	
	WebElement crAcc=driver.findElement(By.xpath("//span[text()='Create account']"));
        crAcc.click();
        
    WebElement myS=driver.findElement(By.xpath("//span[text()='For myself']")) ;   
    myS.click();
    Thread.sleep(5000);
    
    WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']")) ; 
    firstName.sendKeys("Akash");
    
    WebElement lastName=driver.findElement(By.xpath("//input[@name='lastName']")) ; 
    lastName.sendKeys("kale");
    Thread.sleep(5000);
    
    WebElement user1=driver.findElement(By.xpath("//input[@type='email']"));
	user1.sendKeys("kale94562akashkale");
	 Thread.sleep(5000);
	 
	 WebElement passWord=driver.findElement(By.xpath("//input[@type='password']"));
		passWord.sendKeys("7620072983");
		Thread.sleep(5000);
		
	 WebElement ConfirmPassWord=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		 ConfirmPassWord.sendKeys("7620072983");
		 
	 WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
			next.click(); 
			Thread.sleep(5000);	
			
	WebElement phNo=driver.findElement(By.xpath("//input[@id='phoneNumberId']"));	
	phNo.sendKeys("7620072983");
	
	WebElement next1=driver.findElement(By.xpath("//span[text()='Next']"));
	next1.click(); 
	Thread.sleep(35000);	
	
	WebElement veri=driver.findElement(By.xpath("//span[text()='Verify']"));
	veri.click(); 
	Thread.sleep(5000);
	
	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("akashkale472@gmail.com");
	
	WebElement day=driver.findElement(By.xpath("//input[@name='day']"));
	day.sendKeys("26");
}
}