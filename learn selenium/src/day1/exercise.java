package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();//chrome access
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/"); //url launch
	String actit=driver.getTitle();//title get
	System.out.println(actit);
	String exptit="Facebook – log in or sign up";
	if(exptit==actit)
	{
		System.out.println("title is verified");
	}else {
		 System.out.println("title is not match");
	}
	    
  String acturl=driver.getCurrentUrl();
  System.out.println(acturl);
  String expurl="https://www.facebook.com";
  if(acturl==expurl) {
	  System.out.println("url is verified");
  }else {	  System.out.println("url is not verify");
  }
 String getpage= driver.getPageSource();
int actlen= getpage.length();
System.out.println(actlen);
int explen=68755;
if(actlen==explen) {
	System.out.println("length is verified");
}
	else {
		System.out.println("length is not match");
		
	}
}
}
	


