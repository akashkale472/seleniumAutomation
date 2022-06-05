package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		 WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
			 Thread.sleep(2000);
			  submit.click();
			
		Alert alt =driver.switchTo().alert();	
	// alt.accept() ;        //to click on OK/YES/ACCEPT/SUBMIT/ALLOW button
	// alt.dismiss();	       // to click on NO/CANCEL/DENY/DISMISS button
	// alt.getText();	       //to get the text present on alert popup
	// alt.sendKeys("data"); // to send the data on alert popup
	 
	    String text= alt.getText();
		System.out.println(text);
		alt.accept();
		
		alt=driver.switchTo().alert();
		text=alt.getText();
		System.out.println(text);
		alt.accept();
		
		//or
	//	driver.switchTo().alert().accept();		
			
			
			
			
			
			
			
			
			
			

}
}