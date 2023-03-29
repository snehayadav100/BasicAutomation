package practicalrevision;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForCromeOptions {

	public static void main(String[] args) {
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	//ChromeDriver driver=new	ChromeDriver();
	//driver.get("http://localhost:8888//");
		WebDriverManager.chromedriver().setup();
	//ChromeOptions  options= new ChromeOptions();
	//options.addArguments("incognito");
	options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
//	options.addArguments();
//	options.addArguments("headless");

	WebDriver driverr=new ChromeDriver(options);
	driverr.get("http://localhost:8888//");
    driverr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  
    driverr .findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
	driverr.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin"); 
	driverr.findElement(By.xpath("//input[@name=\"Login\"]")).click();
	driverr.findElement(By.xpath("//a[text()='Marketing']")).click();
	}

}
