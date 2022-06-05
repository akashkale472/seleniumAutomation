package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.selenium.dev/downloads/");
			
	 WebElement browserTab=driver.findElement(By.xpath("(//div[@class='card-body'])[11]//button"));	
	 
	 Thread.sleep(2000);
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 
	 js.executeScript("window.scrollBy(0,2000)");   //scroll down by 2000 pixels
			
	 js.executeScript("window.scrollBy(0,-1000)");  //scroll up to 1000 pixels
	 
	 js.executeScript("window.scrollBy(-1000,0)");//scroll left by 1000 pixels
	 
	 //scroll down
	 
	 js.executeScript("arguments[0].scrollIntoView(true)", browserTab);
		//scroll down still element not displayed
					
}
}