package practicalrevision;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AboutWindowHandle {

	//public static void main(String[] args) {

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
       driver.findElement(By.xpath("//a[text()='About Us']")).click();
       driver.findElement(By.xpath("//a[text()='Help']")).click();
      Set<String> objOfWindows = driver.getWindowHandles();
      for (String string : objOfWindows) {
	 driver.switchTo().window(string);
//	 if (driver.getCurrentUrl().equalsIgnoreCase("http://wiki.vtiger.com/index.php/Main_Page")) {
//     driver.close();
// break;
 
 if(!driver.getTitle().equalsIgnoreCase("wiki.vtiger.com")) {
	 
 driver.close();
 break;
	}
	 
	}
		
	} 
	}


