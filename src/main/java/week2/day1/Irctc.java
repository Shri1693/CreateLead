package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("REGISTER").click();
		driver.findElementById("userName").sendKeys("Shri582");
		driver.findElementById("usrPwd").sendKeys("Shri1993");
		driver.findElementById("cnfUsrPwd").sendKeys("Shri1993");
		driver.findElementByXPath("//label[text()='Select Security Question']").click();
		driver.findElementByXPath("//span[text()='What is your pet name?']").click();
		driver.findElementByXPath("//*[@placeholder='Security Answer']").sendKeys("Tommy");
		driver.findElementByXPath("//label[text()='Select Preferred Language']").click();
		driver.findElementByXPath("//span[text()='English']").click();
		driver.findElementById("firstName").sendKeys("Shriprasanna");
		driver.findElementById("M").click();
		driver.findElementByXPath("//p-calendar[@formcontrolname='dob']").click();
		WebElement month = driver.findElementByXPath("//*[@class='ui-datepicker-month ng-tns-c14-10 ng-star-inserted']");
		Select dd = new Select(month);
		dd.selectByVisibleText("June");
		WebElement year = driver.findElementByXPath("//*[@class='ui-datepicker-year ng-tns-c14-10 ng-star-inserted']");
		Select ee = new Select(year);
		ee.selectByVisibleText("1993");
		driver.findElementByXPath("(//a[text()='1'])[1]").click();
		driver.findElementByXPath("//label[text()='Select Occupation']").click();
		driver.findElementByXPath("//span[text()='PRIVATE']").click();
		driver.findElementByXPath("//label[text()=' Married']").click();
		driver.findElementById("email").sendKeys("shri9600947598@gmail.com");
		driver.findElementById("mobile").sendKeys("9600947597");
		WebElement nationlity = driver.findElementByXPath("//*[@formcontrolname='nationality']");
		Select ff = new Select(nationlity);
		ff.selectByVisibleText("India");
		driver.findElementById("resAddress1").sendKeys("10b shenbagaraman street sheshayee nagar kk nagar");
        driver.findElementByXPath("//input[@formcontrolname='resPinCode']").sendKeys("620021");
        driver.findElementById("resState").sendKeys("Tamilnadu");
        WebElement city = driver.findElementByXPath("//*[@formcontrolname='resCity']");
        Select gg = new Select(city);
        gg.selectByVisibleText("Tiruchirappalli");
        WebElement post = driver.findElementByXPath("//*[@formcontrolname='resPostOff']");
	    Select hh = new Select(post);
	    Thread.sleep(3000);
	    hh.selectByValue("K.Sathanur B.O");
	    driver.findElementById("resPhone").sendKeys("2415648");
	    Thread.sleep(3000);
	    //driver.close();
	
	}

}
