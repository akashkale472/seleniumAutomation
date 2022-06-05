package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get(("https://www.amazon.in/"));
			
			WebElement accAndList=driver.findElement(By.xpath("//span[text()='Account & Lists']"))	;
			WebElement yourOrder=driver.findElement(By.xpath("//span[text()='Your Orders']"))	;
			
			// how to perfrom mouse action on browser
			Actions act= new Actions(driver);
			
//act.click();//left single click
// act.doubleClick();//left double click
//   act.contextClick();//right click	
 // act.moveToElement(yourOrder);// move to target element
//  act.dragAndDrop(accAndList, yourOrder);//drag is source element,drop is a target element
			
	//act.moveToElement(accAndList).perform();		
	//  act.moveToElement(yourOrder).perform();	
			
			
	act.moveToElement(accAndList).moveToElement(yourOrder).build().perform();		
			
		
			
			
			
			
			
			
			
}
}