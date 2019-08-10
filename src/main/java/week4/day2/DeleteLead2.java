package week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead2 {
	public static void main(String[] args) throws InterruptedException {
	CreateLead step = new CreateLead();
	step.create();
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	WebElement find = driver.findElementByLinkText("Find Leads");
	find.click();
	driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("8667457959");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(3000);
	WebElement num = driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a");
	String Empid = num.getText();
	System.out.println(Empid);
	Thread.sleep(3000);
	num.click();
	driver.findElementByLinkText("Delete").click();
	Thread.sleep(3000);
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//input[@name='id']").sendKeys(Empid);
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	String text2 = driver.findElementByXPath("//div[text()='No records to display']").getText();
	if(text2.equals("No records to display")) {
		System.out.println("Successfully completed");
	}
	driver.close();
	
	
}
}