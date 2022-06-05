package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webExcel {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(2000);
	for(int K=2; K<=7; K++)
	{
		System.out.println("RowNo. "+K+", cell count3");
		
		for(int i=0; i<=2; i++)
		
	{
List<WebElement> norows = driver.findElements(By.xpath("//table[@id='customers']//tr["+K+"]//td"));
String text=norows.get(i).getText();

	        System.out.print(text+",");
	        }
		    System.out.println();
	}
	
	String exceptedData[] ={"Alfreds Futterkiste","Maria Anders","Germany",
			                 "Centro comercial Moctezuma","Francisco Chang","Mexico",
	                         "Ernst Handel","Roland Mendel","Austria",
			                 "Island Trading","Helen Bennett","UK",
	                         "Laughing Bacchus Winecellars","Yoshi Tannamuri","Canada",
		                     "Magazzini Alimentari Riuniti","Giovanni Rovelli","Italy",};

			
		
				List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']//td"));		
						
				int size=cells.size();		  // no of webELEMENTS
						
				for(int i= 0 ; i< cells.size(); i++)	
				{
					
					String text=cells.get(i).getText();
					System.out.println(text);
				boolean result=	text.equals(exceptedData[i]);
				if(result)
				{
					System.out.println("PASS");
				}
				else
				{
					System.out.println("FAIL");
				}
				
	
				}}}

