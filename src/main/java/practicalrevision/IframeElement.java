package practicalrevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.Implementation;

public class IframeElement {

                               //   IframeHandleByIndex//
	
	
public static void main(String[] args) {

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");	
     WebDriverManager.chromedriver().setup();                    
//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pc\\eclipse-Selenium_workspace\\Selenium\\chromedriver.exe");	
WebDriver driver=new ChromeDriver(options);	
driver.get("http://localhost:8888//");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();
driver.findElement(By.xpath("//a[text()=\"Gmail Bookmarklet\"]")).click();
driver.switchTo().frame("__vtigerBookmarkletFrame__");//
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='__vtigerBookmarkletFrame__']")));
//  driver.switchTo().frame(0);

driver.findElement(By.xpath("//input[@id=\"__searchaccount__\"]")).sendKeys("admin");
  
}}






                   







