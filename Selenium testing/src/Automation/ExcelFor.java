package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFor {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS)	;
		
         List<WebElement> cell = driver.findElements(By.xpath("//table[@class='ws-table-all']//td"));	
          cell.size();
//        for(int i=0; i<cell.size(); i++)
//        {
//        	String text=cell.get(i).getText();
//        	System.out.println(text+",");
//        	
//        }    
//        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
//        
//       String path="C:\\Users\\Dell\\Desktop\\Book1.xlsx"	;
//		FileInputStream file =new FileInputStream(path);
//		
//		Workbook book=WorkbookFactory.create(file);
//		for(int j=0; j<5; j++)
//		{
//        for(int i=0; i<2; i++)
//        {
//        	String excelText=book.getSheet("Sheet2").getRow(j).getCell(i).getStringCellValue();
//    	System.out.println(excelText);
    	
//    for(int i=0; i<cell.size(); i++)
//    {  
//      String text=cell.get(i).getText();
//      System.out.println(text);
//      boolean result=text.equals(text)
//    	
    }       
}
