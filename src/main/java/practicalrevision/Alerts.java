package practicalrevision;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pc\\eclipse-Selenium_workspace\\Selenium\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://localhost:8888//");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();
	    driver.findElement(By.linkText("Marketing")).click();
	   // driver.findElement(By.xpath("(//a[text()=\\\"Campaigns\\\"])[1]")).click();
	    driver.findElement(By.xpath("//table[@class=\"lvt small\"]/parent::div/preceding-sibling::table//input[@value=\"Delete\"]")).click();
     Alert alertobj= driver.switchTo().alert();
     alertobj.accept();
	 System.out.println("allert will be not visible");	
	}

} 