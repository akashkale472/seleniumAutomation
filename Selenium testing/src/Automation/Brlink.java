package Automation;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brlink {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			List<WebElement> links = driver.findElements(By.tagName("a"));				
			Thread.sleep(3000);
			System.out.println(links.size());
			
			for(int i=0; i<links.size(); i++)
			{
				WebElement element=links.get(i);
				String url=element.getAttribute("href");
				
				URL link= new URL(url);
				
				HttpURLConnection httpconn= (HttpURLConnection ) link.openConnection();
				Thread.sleep(2000);
				
				httpconn.connect();
				
				int rescode= httpconn.getResponseCode();
				
				if(rescode>200)
				{
					System.out.println(url+" - "+" is broken link "); 
				}
//				else
//				{
//				    System.out.println(url+" - "+" is valid link "); 
//				
//					
//				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}			
}
