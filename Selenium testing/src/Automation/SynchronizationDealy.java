package Automation;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;




public class SynchronizationDealy {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
		WebDriver driver=new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS)	;
		

driver.get("https://www.w3schools.com/html/html_tables.asp");
		
WebElement elel1 = (WebElement) driver.findElements(By.xpath("//table[@id='cuss']//td"));

WebElement elel2 = (WebElement) driver.findElements(By.xpath("//table[@id='customers']//td"));

WebElement elel3 = (WebElement) driver.findElements(By.xpath("//table[@id='cuss']//td"));


	//synchronization  delay /wait
	
	//implicit ->Waiting time
	// Explicit->waiting time + condition
	//fluent-> waiting time+condition+frequency

//Explicit wait -> waiting Time+ condition
//WebDriverWait wait= new WebDriverWait(driver,10);//10sec
}
}