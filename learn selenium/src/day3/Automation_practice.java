package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import day1.webelemnts;

public class Automation_practice {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		File f1=new File("/learn selenium/Or.prpoperties");
		FileInputStream fis=new FileInputStream(f1);
		Properties prop=new Properties();	
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url1"));
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
WebElement nm=driver.findElement(By.xpath(prop.getProperty("name")));
nm.sendKeys("surya");
Thread.sleep(2000);
WebElement mn=driver.findElement(By.xpath(prop.getProperty("number")));
Thread.sleep(1000);
mn.sendKeys("9876543210");
WebElement ml=driver.findElement(By.xpath(prop.getProperty("email")));
ml.sendKeys("foxsuri@gmail.com");
WebElement pw=driver.findElement(By.xpath(prop.getProperty("pass")));
pw.sendKeys("surya@123");
WebElement ad=driver.findElement(By.xpath(prop.getProperty("address")));
ad.sendKeys("44,puliakulam,redfieldroad,cbe-65456");
WebElement sm=driver.findElement(By.xpath(prop.getProperty("submit")));
sm.click();
WebElement male=driver.findElement(By.xpath(prop.getProperty("radio")));
male.isEnabled();male.isDisplayed();male.click();
WebElement week=driver.findElement(By.xpath(prop.getProperty("mon")));
week.isDisplayed();week.isSelected();week.click();
WebElement wd=driver.findElement(By.xpath(prop.getProperty("wed")));
wd.isEnabled();wd.isDisplayed();wd.click();
//Thread.sleep(1000);
WebElement dd=driver.findElement(By.xpath(prop.getProperty("travel")));
Select tr=new Select(dd);
tr.selectByIndex(5);
WebElement yr=driver.findElement(By.xpath(prop.getProperty("year")));
yr.isEnabled();yr.isSelected();yr.click();
WebElement  at=driver.findElement(By.xpath(prop.getProperty("tool1")));
at.isEnabled();at.isSelected();
WebElement fw=driver.findElement(By.xpath(prop.getProperty("tool2")));
fw.isDisplayed();fw.isEnabled();fw.click();
WebElement fw1=driver.findElement(By.xpath(prop.getProperty("tool3")));
fw1.isSelected();fw1.click();
WebElement fi=driver.findElement(By.xpath(prop.getProperty("file")));
fi.sendKeys("C:\\Users\\ELCOT\\OneDrive\\Documents\\New folder");




	}

}
