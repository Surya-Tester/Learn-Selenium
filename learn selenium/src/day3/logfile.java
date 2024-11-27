package day3;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logfile {
public static WebDriver driver;
public static Logger log=Logger.getLogger(logfile.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("D:\\selenium_cloudswan\\learn selenium\\log4j.properties");
		driver=new ChromeDriver();
		log.info("browser launch successfully");
		driver.get("https://www.facebook.com");
		log.info("url launch successfully");
	WebElement em=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	em.sendKeys("surya");
		log.info("element choosen and action successfully");

	}

}

