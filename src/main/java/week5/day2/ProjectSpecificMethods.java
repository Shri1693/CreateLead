package week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	@Parameters({"url","username", "Password"})
	@BeforeMethod
	public void login(String url, String username, String Password) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(Password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void browserClose() {
	driver.close();
	
	}
}
