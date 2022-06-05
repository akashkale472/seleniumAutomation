package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
String exceptedData[] ={
};
		
	List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']//td"));		
			
	int size=cells.size();		  // no of webELEMENTS
			
	for(int i= 0 ; i< cells.size(); i++)	
	{
		String text=cells.get(i).getText();
		System.out.println(text);
	boolean result=	text.equals(exceptedData);
	if(result)
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL"); 
		
	}

	}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}