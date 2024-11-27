package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sshot {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\screenshot\\"+System.currentTimeMillis()+"scrnsh.png"));
		
		

	}

}
