package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe" ) ;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("akashkale472@gmail.com");
//		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("9404602983");
		Thread.sleep(3000);
	//	WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
	//	loginButton.click();
	//	WebElement forget=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		WebElement createNew =driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNew.click();
		Thread.sleep(5000);
		
		WebElement firstName =driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Akash");
		Thread.sleep(3000);
		
		WebElement lastName =driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("kale");
		Thread.sleep(3000);
		
		WebElement moEmail =driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		moEmail.sendKeys("9503841431");
		
		WebElement password1 =driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password1.sendKeys("9503841431");
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		Select s= new Select(month)   ;
		s.selectByVisibleText("Sep");
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select a= new Select(day)   ;
		a.selectByIndex(25);
		Thread.sleep(8000);
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select y= new Select(year)   ;
		y.selectByValue("1991");
		
		WebElement custom =driver.findElement(By.xpath("(//input[@type='radio'])[3]"));	
		custom.click();
		
	}

}
