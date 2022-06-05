package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cbutton {
	
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
//WebElement forget=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
WebElement createNew =driver.findElement(By.xpath("//a[text()='Create New Account']"));
createNew.click();		
Thread.sleep(5000);
		
WebElement custom =driver.findElement(By.xpath("(//input[@type='radio'])[3]"));	
			
//check box / radio button
//true-> selected  false-> not selected

boolean result = custom.isSelected();

if(result==true)
{
	System.out.println(result);
	System.out.println("pass");
}
else
{
	System.out.println(result);
	System.out.println("fail");
}

result=custom.isSelected();
System.out.println(result);
	
}
}
