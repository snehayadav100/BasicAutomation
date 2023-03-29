package practicalrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass{

	

	public static void main(String[]arg) {
		
		                     //MouseOver//
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("WebDriver.driver.chrome","C:\\Users\\pc\\eclipse-Selenium_workspace\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://localhost:8888//");
	    driver .findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin"); 
		driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();
//		//driver.findElement(By.xpath(//a[text()='Marketing']")).click();
//  Actions linkofmarketing=new Actions (driver);
//		WebElement actiobj=driver.findElement(By.xpath("//a[text()='Marketing']"));
//		linkofmarketing.moveToElement(actiobj).perform();
				
		
		                   //DrangAndDrop//
	
//	Actions objofdrag= new Actions (driver);
//	WebElement drag=driver.findElement(By.xpath("//b[contains (text(), \"Tag Cloud\")]"));
//	WebElement drop=driver.findElement(By.xpath("//b[contains (text(),'Top Accounts')]"));
//	objofdrag.moveToElement(drag).clickAndHold().moveToElement(drop).build().perform();

	                       //RightClick//
	
	//	Actions objofrightclick=new Actions(driver);
//	WebElement cl= driver.findElement(By.xpath("//a[text()='Marketing']"));
//	    objofrightclick.contextClick(cl).build().perform();
	    
	                       //DoubleClick//
	    
	    Actions   dc =new Actions (driver);
	 WebElement  dcl= driver.findElement(By.xpath("//a[text()='Sales']"));
	    dc.doubleClick(dcl).build().perform();
	    
	    }}	
	
	
	
	
	
	
	
