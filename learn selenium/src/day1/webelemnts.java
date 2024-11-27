package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelemnts {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k");
		driver.manage().window().maximize();
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.isEnabled();
		search.sendKeys("earphone");
	WebElement sebu=driver.findElement(By.xpath("//input[@value='Go']"));
	sebu.click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
	WebElement it=driver.findElement(By.linkText("Mobiles"));
		Point lt1=it.getLocation();
		System.out.println(+lt1.x+lt1.y);
	String gt=it.getText();
	System.out.println("text"+gt);
	String gt1=it.getTagName();
	System.out.println("Tagname"+gt1);
	Dimension gs= it.getSize();
	System.out.println("size"+gs);
	}

}
