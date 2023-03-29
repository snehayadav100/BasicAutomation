package practicalrevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pc\\eclipse-Selenium_workspace\\Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://localhost:8888//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
        // jsc.executeScript("window.scrollBy(300,34)", "");
         
        /// jsc.executeScript("arguments[0].click();", args);
         
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		
		WebElement we= driver.findElement(By.xpath("//input[@name='Login']"));
		jsc.executeScript("arguments[0].click();", we);
		
		
	//	driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();
	   // driver.findElement(By.linkText("Marketing")).click();
	   //JavascriptExecutor jsc = (JavascriptExecutor) driver;
      //  jsc.executeScript("jh", "jhjk");
	}

}
