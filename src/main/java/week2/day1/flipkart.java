package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//
		driver.switchTo().frame(1);
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement home = driver.findElementByXPath("//span[text()='Home & Furniture']");
		Actions builder = new Actions (driver);
		builder.moveToElement(home).perform();
		driver.findElementByLinkText("Paintings").click();
	}

}
