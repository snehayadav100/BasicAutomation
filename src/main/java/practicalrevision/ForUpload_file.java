package practicalrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForUpload_file {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);
		
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.linkText("Documents")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Document...\"]")).click();
	   WebElement wee=driver.findElement(By.xpath("//select[@name=\"filelocationtype\"]"));
		Select select=new Select(wee);
		select.selectByValue("I");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement web =driver.findElement(By.xpath("//input[@type=\"file\"]"));
	//  web.click();
		web.sendKeys("C:\\Users\\pc\\eclipse-Selenium_workspace\\Selenium_Basicc\\repor.html");
		
		
		
		
		
		
	}

}
