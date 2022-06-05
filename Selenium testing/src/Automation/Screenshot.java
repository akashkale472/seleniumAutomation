package Automation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get(("https://www.amazon.in/"));
			
		TakesScreenshot t=  (TakesScreenshot)driver;	
		
	//	File source=t.getScreenshotAs(OutputType.FILE);
			
	//	File dest=new File("E:\\SCREENSHOT\\.jpeg")	;
		
	//	FileHandler.copy(source, dest);
		
		Random random=new Random();
		int a=random.nextInt(30);
			
	for(int i=1; i<=5; i++)
	{
		LocalDateTime now=LocalDateTime.now();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		DateTimeFormatter format= DateTimeFormatter.ofPattern("MM.dd.yyyy HH.mm.ss");
		File dest=new File("E:\\SCREENSHOT\\"+a+i+"  "+now.format(format)+".jpeg")	;
		FileHandler.copy(source, dest);
		Thread.sleep(3000);
		
		
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}