package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert1 {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fl=new File("D:\\selenium_cloudswan\\learn selenium\\Or.prpoperties");
		FileInputStream fis=new FileInputStream(fl);
		Properties prop=new Properties();
		prop.load(fis);
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url2"));
		driver.manage().window().maximize();
		
		/* * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOf(frm));*/
	WebElement salt=driver.findElement(By.xpath(prop.getProperty("simple")));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", salt);
	Alert alt=driver.switchTo().alert();
	alt.accept();  
	
	
	
	
/*	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement drg=driver.findElement(By.xpath(prop.getProperty("inter")));
		wait.until(ExpectedConditions.visibilityOf(drg));
		js.executeScript("arguements[0].click()", drg);
		Alert alt1=	driver.switchTo().alert();
		alt1.accept();
		WebElement sort=driver.findElement(By.xpath(prop.getProperty("srt")));
		sort.click();*/
	
	
	
	
	
		
	
	
		

	}

}
