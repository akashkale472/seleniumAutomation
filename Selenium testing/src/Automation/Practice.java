package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
		//	user.sendKeys("akashkale472@gmail.com");
			WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		//	password.sendKeys("9404602983");
			Thread.sleep(3000);
		//	WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		//	loginButton.click();
		//	WebElement forget=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
			WebElement createNew =driver.findElement(By.xpath("//a[text()='Create New Account']"));
			createNew.click();
			Thread.sleep(5000);
			
			//how to handle the list box/drop down
			
			WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
			
			Select s= new Select(month)   ;

	    //   s.selectByIndex(8);
		//	 s.selectByValue("9");
			s.selectByVisibleText("Sep");
			 
}
}