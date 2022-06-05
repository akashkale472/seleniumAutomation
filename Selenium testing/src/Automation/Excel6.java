package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel6 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		String path="C:\\Users\\Dell\\Desktop\\Book1.xlsx"	;
		FileInputStream file =new FileInputStream(path);
		
		Workbook book=WorkbookFactory.create(file);	
	   // System.out.println("company");
     	for(int i=0; i<6; i++)
	{
		String A=book.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
		System.out.print(A+",");
	}	
	System.out.println();
	for(int i=0; i<6; i++)
	{
		String B=book.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
		System.out.print(B+",");
	}	
	System.out.println();
	for(int i=0; i<6; i++)
	{
		String c=book.getSheet("Sheet2").getRow(i).getCell(2).getStringCellValue();
		System.out.print(c+",");
	}	
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
        List<WebElement> company = driver.findElements(By.xpath("//table[@class='ws-table-all']//td[1]"));		
        List<WebElement> contact = driver.findElements(By.xpath("//table[@class='ws-table-all']//td[2]"));		
        List<WebElement> country = driver.findElements(By.xpath("//table[@class='ws-table-all']//td[3]"));	
        
        company.size();
        contact.size();
        country.size();
        System.out.println("company");
      //  System.out.println();
        for(int i=0; i<company.size(); i++)
        {
        	String text=company.get(i).getText();
        	System.out.println(text+",");
        }
        System.out.println();
        System.out.println("contact");
      
        for(int i=0; i<contact.size(); i++)
        {
        	String text=contact.get(i).getText();
        	System.out.println(text+",");
        } 
        System.out.println();
        System.out.println("country");
     
        for(int i=0; i<country.size(); i++)
        {
        	String text=country.get(i).getText();
        	System.out.println(text+",");
        }
                //  int size=cells.size();		  // no of webELEMENTS
        
	
	
	
	}	
}
