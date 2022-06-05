package Automation;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/js/js_popup.asp");
			Thread.sleep(2000);
			
			 WebElement alertBox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
			 alertBox.click();
	
			 ArrayList<String> addr  =new  ArrayList<String>(driver.getWindowHandles()); 
	         driver.switchTo().window(addr.get(1));
	
	         WebElement iframeWindow=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	         
	         //to switch from main page to iframe
	       // driver.switchTo().frame(2);//index
	      //   Thread.sleep(5000);
	       //  driver.switchTo().frame("iframeResult");//attribute value id
	         driver.switchTo().frame(iframeWindow); //web element
	         Thread.sleep(5000);
	        WebElement tryIt=driver.findElement(By.xpath("//button[text()='Try it']"));
	         Thread.sleep(2000);
	         tryIt.click();
	         Alert alt= driver.switchTo().alert();
	         String text= alt.getText();
	         System.out.println(text);
	         alt.accept();
	         
	         Thread.sleep(5000);
	         driver.switchTo().parentFrame();  //to switch from iframe to parent frame
	         
	         WebElement web=driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
	         web.click();
	         
	         driver.switchTo().defaultContent();//to switch from any iframe to main page
}
}