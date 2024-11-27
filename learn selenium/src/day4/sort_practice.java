package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sort_practice {
	
 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/sortable");
		driver.manage().window().maximize();
		List<WebElement> frame= driver.findElements(By.xpath("//div[@class='list-group-item list-group-item-action']"));
		WebElement fromeElement=frame.get(5);
		WebElement toElement=frame.get(1);
		
		Actions action=new Actions(driver);
		action.clickAndHold(fromeElement);
		action.moveToElement(toElement);
		action.release();
		action.build().perform();
		

	}

}
