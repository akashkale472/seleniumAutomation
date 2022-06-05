package Automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/js/js_popup.asp");
			Thread.sleep(2000);
			 WebElement tryItYourSelf=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	            Thread.sleep(2000);
	            tryItYourSelf.click(); 
	            
	            String url=driver.getCurrentUrl();
	            System.out.println(url);
	            
	            //switch to child browser
	   ArrayList<String> addr  =new  ArrayList<String>(driver.getWindowHandles());
	   String addrOfChildBrowser =addr.get(1);
	   driver.switchTo().window(addrOfChildBrowser);
	   url=driver.getCurrentUrl();
	   
	   //return to main page
	   String addrOfMainrowser =addr.get(0); 
	   driver.switchTo().window(addrOfMainrowser);
	   
}
}