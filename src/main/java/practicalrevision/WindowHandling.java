package practicalrevision;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	System.setProperty("WebDriver.driver.chrome","C:\\Users\\pc\\eclipse-Selenium_workspace\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver(options);
    driver.get("http://localhost:8888//");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
   driver .findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
   driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin"); 
   driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();
//   driver.findElement(By.xpath("//a[text()='About Us']")).click();
//      List<WebElement> NameOfElement= driver.findElements(By.xpath("//table[@class='rollOver']//td"));
//     for (int i = 0; i < NameOfElement.size() ; i++) {
//    WebElement web= NameOfElement.get(i);	
//    System.err.println(web.getText());
//	}
//  Set<String> ss= driver.getWindowHandles();  
//// for (int i = 0; i < ss.size(); i++) {
//for (String hndlvalue : ss) {
//	driver.switchTo().window(hndlvalue);
//	      String gettitle=driver.getTitle();
//	      if(gettitle.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) ;
//	      break;
//	      List<WebElement> NameOfElement= driver.findElements(By.xpath("//table[@class='rollOver']//td"));
//	      for (int i = 0; i < NameOfElement.size() ; i++) {
//	     WebElement web= NameOfElement.get(i);	
//	     System.err.println(web.getText());
//	 	}    
//}	
//   driver.findElement(By.xpath("//a[text()=\"Help\"]")).click();
//// driver.findElement(By.xpath("//a[text()=\"Modules\"]")).click();
//// driver.findElement(By.xpath("//a[text()=\"Overview\"]")).click();
//   Set<String> handleValus= driver.getWindowHandles();
//  System.out.println(handleValus.size());
//  System.out.println(handleValus);
	  
   driver.findElement(By.xpath("//a[text()='Help']")).click();
  Set<String>handleValues2= driver.getWindowHandles();
   System.out.println(handleValues2.size());
   System.out.println(handleValues2);
   
   for(String hValue :handleValues2) {
		String actualTitle=driver.switchTo().window(hValue).getTitle();
		   if(actualTitle.contains("Vtiger CRM - vtiger")) {
			   break;
		   }
   }driver.findElement(By.xpath("//a[text()=\"Modules\"]")).click();
 driver.findElement(By.xpath("//a[text()=\"Overview\"]")).click();
   }	   
	}
//   
//   driver.findElement(By.xpath("//a[text()='Overview']")).click();
//   driver.findElement(By.xpath("//a[text()='Modules']")).click();
//   
//   
//   
//   for(String handleValue :handleValues2) {
//		String actualTitle=driver.switchTo().window(handleValue).getTitle();
//		   if(actualTitle.contains("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM")) {
//			   break;
//
//	        }
//     }
//		   
//   driver.findElement(By.xpath("//a[text()='Marketing']")).click();
//  
//   
//   
//   for(String handleValue :handleValues2) {
//		String actualTitle=driver.switchTo().window(handleValue).getTitle();
//		   if(actualTitle.contains("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM")==false) {
//			   driver.close();
//
//		   }}}
//}