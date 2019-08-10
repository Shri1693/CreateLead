package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	//WebElement frame = driver.findElementByXPath("//div[@id='iframecontainer']");
	
	
	driver.switchTo().frame(0);
	driver.findElementByXPath("//button[text()='Try it']").click();
	
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Shriprasanna");
	alert.accept();
	Thread.sleep(3000);;
   //System.out.println(driver.findElementByXPath("p[contains(text(),'Shriprasanna')]").isDisplayed()); 
   if(driver.getPageSource().contains("Shriprasanna")) {
	   System.out.println("true");
   }
   WebElement text = driver.findElementById("demo");
   text.getText();
   if(text.getText().contains("Shriprasanna")) {
	   System.out.println("Super");
   }
}
}
