package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class select_practice {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		driver.manage().window().maximize();
		List<WebElement> selectable= driver.findElements(By.xpath("//ul[@id='verticalListContainer']//li"));
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();

	}

		
	}


