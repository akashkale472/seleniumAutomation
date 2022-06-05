package Automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/js/js_popup.asp");
			Thread.sleep(2000);
			
			 WebElement alertBox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
			 WebElement confirmBox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
			 WebElement pramotBox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
			 WebElement lineBreak=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
			 
			 alertBox.click();
			 confirmBox.click();		
			 pramotBox.click();
			 lineBreak.click();
			 
			 String mainpage =driver.getWindowHandle();//main browser
			 System.out.println(mainpage);
			 driver.getWindowHandles();//main browser +child browser
			 
			 ArrayList<String> addr  =new  ArrayList<String>(driver.getWindowHandles()); 
			 
		    for(int i= 0; i < 5; i++);	
		    {
		    	System.out.println(addr.get(0));
		    }
			
		    driver.switchTo().window(addr.get(0));
		    System.out.println(driver.getCurrentUrl());
			 
		    driver.switchTo().window(addr.get(1));
		    System.out.println(driver.getCurrentUrl());
			  
		    driver.switchTo().window(addr.get(2));
		    System.out.println(driver.getCurrentUrl());
			  
		    driver.switchTo().window(addr.get(3));
		    System.out.println(driver.getCurrentUrl());
		    
		    driver.switchTo().window(addr.get(4));
		    System.out.println(driver.getCurrentUrl());
			 
			  
}
}