package week4.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        
        driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("shritest456@gmail.com", Keys.TAB, "Shri@1993");
		driver.findElementByXPath("//input[@value='Log In']").click();
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Testleaf");
		driver.findElementByXPath("//button[@aria-label='Search']").click();
		Thread.sleep(3000);
		WebElement name = driver.findElementByLinkText("TestLeaf");
		
		String text = name.getText();
		System.out.println(text);
		if(text.contains("Testleaf")) {
			System.out.println("Verified");
			
		}
		String text2 = driver.findElementByXPath("(//button[@type=\"submit\"])[2]").getText();
		if(text2.equals("Like")) {
			driver.findElementByXPath("(//button[@type='submit']/i)[2]").click();
			System.out.println("like");
		}
		else if(text2.equals("Liked")) {
			System.out.println("I have already liked");
		}
		name.click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if(title.contains("Testleaf")) {
			System.out.println("Super");
		}
		String text3 = driver.findElementByXPath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yg/r/AT9YNs6Rbpt.png']/following::div").getText();
		System.out.println(text3);
		
		
		
		
		
		
	
	
	
	
	}}


