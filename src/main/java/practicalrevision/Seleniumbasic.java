package practicalrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seleniumbasic {
	                            
public static void main(String[]args) {

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pc\\eclipse-Selenium_workspace\\Selenium\\chromedriver.exe");	
	 WebDriver driver=new ChromeDriver(options);	
	 driver.get("http://localhost:8888//");
	
     driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();
// driver.findElement(By.linkText("Marketing")).click();
 
                                     //Clear//
 
    //  driver.findElement(By.xpath("//input[@name=\"user_name\"]")).clear();
 
                                    //Sendkey//
      
  //   driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
     
                                     //click//
 
   //   driver.findElement(By.xpath("//input[@name=\"user_name\"]")).click();
 
                                    //GetTagName//
      
    
     
      
                                   //Isselected//s
// boolean c= driver.findElement(By.xpath("//input[@name=\"selectall\"]")).isSelected();
//	if(c==true) {
//	 System.out.println("Checkbox is passed");	
//	}else {
//	 System.out.println("Checkbox is not passed");	
//	}
// 
//	                                 //IsEnabled//
//	
//    boolean e=driver.findElement(By.xpath("//div[@id=\"notificationDiv\"]")).isEnabled();
//	 if (e==true) {
//		 System.out.println("button is clickable  ");
//	 } else {
//System.out.println("button is not clickable");	
//	 }	      
//		                            //IsDisable//
//		
// boolean d=driver.findElement(By.xpath("//div[@id=\"notificationDiv\"]")).isDisplayed();
// if(d==true) {
//	  System.out.println("button is visible");
//	  }  else {
//System.out.println("button is not visible");	  
//	  }
//  
//                                   //Gettitle//
//               
//   String title=driver.getTitle();
// if(title.equalsIgnoreCase("admin - Marketing - Campaigns - vtiger CRM 5 - Commercial Open Source CRM")) {
//System.out.println("title match");	
// 
//}else {
//System.out.println("title mismatch");
// 
//
//                                         //Gettext//
//	String gt=driver.findElement(By.xpath("//a[text()='Marketing']")).getText();
//   if(gt.equalsIgnoreCase(gt)) {
//   System.out.println("Marketing testing is passed");
//
//} else {
//	System.out.println("Marketing testing is not passed");
//	 
//	                                       //GetAttribute//
//	
//  String valueofactual=driver.findElement(By.xpath("//input[@class='crmbutton small create']")).getAttribute("value");
// if(valueofactual.equalsIgnoreCase(valueofactual)) {
//	 System.out.println("searchnow button is pass ");
// } else {
//	 System.out.println("searchnow button is not pass "); 
//	 
// }}
////String valueof=driver.findElement(By.xpath("//input[@value=\"Delete\"]")).getAttribute("value");	 
////if(valueof.equalsIgnoreCase(valueof)) {
////	System.out.println("delete button is pass");
////}	else {	
////	System.out.println("delete button is not pass");
 
                                               //GetSize// 

//	Dimension  ObjOfDimension= driver.findElement(By.xpath("//input[@name=\"submit\"]")).getSize();
//	int height=ObjOfDimension.getHeight();
//	  int width =ObjOfDimension.getWidth();
//	System.out.println(height+","+width);
//	
//	                                         //GetLocation//
//	
//	Point ObofPoint=driver.findElement(By.xpath("//input[@name=\"submit\"]")).getLocation();
//	int valueOfx=ObofPoint.getX();
//	int valueOfy=ObofPoint.getY();
//	//System.out.println("x -"+valueOfx+",y-" +valueOfy);
//	  System.out.println("x -"+valueOfx+",y -"+valueOfy);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}























//      
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 
 
	
