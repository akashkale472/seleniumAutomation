package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get(("https://www.w3schools.com/html/html5_draganddrop.asp"));	
	
			WebElement drag=driver.findElement(By.xpath("//img[@id='drag1']"))	;
			WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"))	;
			
	//how to perfrom mouse action on the browser
	
	Actions act= new Actions(driver);
	
	act.dragAndDrop(drag, drop).perform();
	
	System.out.println("end");
	
//	act.click();//left hand side click
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}