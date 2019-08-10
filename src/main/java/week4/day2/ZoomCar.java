package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomCar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.zoomcar.com/chennai/");
        driver.manage().window().maximize();
        driver.findElementByLinkText("Start your wonderful journey").click();
        Thread.sleep(5000);
        driver.findElementByXPath("//div[contains(text(),'Thuraipakkam')]").click();
        driver.findElementByClassName("proceed").click();
        Date date = new Date();
    	DateFormat aaa= new SimpleDateFormat("dd");
    	String today = aaa.format(date);
    	System.out.println(today);
    	int tommorow = Integer.parseInt(today)+1;
    	//System.out.println(tommorow);
    	String str3 = String.valueOf(tommorow); 
    	System.out.println(str3);
    	Thread.sleep(3000);
    		driver.findElementByXPath("(//div[contains(@class,'day picked ')]/following-sibling::div)[1]").click();
    		driver.findElementByXPath("//button[@class='proceed']").click();
    		//String pick = driver.findElementByXPath("//div[@class='day picked ']").getText();
    		//System.out.println(pick);
    	String text = driver.findElementByXPath("(//div[@class='label time-label'])[1]").getText();
    	if(text.contains(str3)) {
    		driver.findElementByXPath("//button[@class='proceed']").click();
    	}
    	Thread.sleep(3000);
    	int com = driver.findElementsByClassName("car-item").size();
    	System.out.println(com);
    	driver.findElementByXPath("//div[contains(text(),'Price: High to Low')]").click();
    	Thread.sleep(2000);
    	String price = driver.findElementByXPath("(//div[@class='car-item']/div[3]/div/div[1])[1]").getText();
    	String carname = driver.findElementByXPath("(//div[@class='details']/h3)[1]").getText();
    	System.out.println(carname+ " "+price);
    	driver.findElementByXPath("//button[@name='book-now']").click();
    	driver.close();
    	}
    	
    	    	
    	
}
