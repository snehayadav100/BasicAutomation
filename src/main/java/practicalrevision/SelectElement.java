package practicalrevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectElement {
	                            //DropDown//
	
public static void main(String[] args) throws InterruptedException {

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pc\\eclipse-Selenium_workspace\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(options);
        driver.get("http://localhost:8888//");
        driver.findElement( By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
        driver.findElement( By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
      driver.findElement( By.xpath ("//input[@name=\"Login\"]")).click();
      driver.findElement(By.xpath("//a[text()=\"Marketing\"]")).click();
   
   //     WebElement td= driver.findElement(By.xpath("//select[@name=\"login_theme\"]"));
  //  Select  objofSelect =new Select(td);
   //  objofSelect.selectByIndex(1);
  //   Thread.sleep(2000);
  
   // objofSelect.selectByValue("softed");
  //    Thread.sleep(1000);
  //   objofSelect.selectByVisibleText("woodspice") ;
     
//       
//                             //GetAllSelectedOption//
//      
//        List <WebElement> ga= objofSelect.getAllSelectedOptions(); 
//       for (WebElement webElement: ga) {
//     	System.out.println(webElement.getText());
//       }}}                               
//     	                  //GetFirstSelectedOption//
//     	
//     	
       // WebElement gfso=objofSelect.getFirstSelectedOption();
       //System.out.print(gfso.getText());
      
//     
//                              //GetCountOptions//
//
//              List< WebElement> gf= objofSelect.getOptions();  
//        for (WebElement webElement : gf) {
//      	
//        	System.out.println(webElement.getText());
//        }}}    
//                              //CustomDropdowns//
      

//      WebElement marketing=driver.findElement(By.linkText("Marketing"));
//      Actions actobj=new Actions(driver);
//        actobj.moveToElement(marketing).build().perform();
        
}}
//    //    WebElement leads=driver.findElement(By.linkText("Leads"));
//    //    actobj.moveToElement(leads).build().perform();
//    //   actobj.click().build().perform();
//    //    actobj.moveToElement(marketing).build().perform();
//    //    WebElement  accounts=driver.findElement(By.linkText("Accounts"));
//    //    actobj.moveToElement(accounts).click().build().perform();
//
//                               
//
//}
//}}