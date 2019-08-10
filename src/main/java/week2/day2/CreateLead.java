package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	//public static void main(String[] args) throws InterruptedException {
	public static void create() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Tridentsqa");
		driver.findElementById("createLeadForm_firstName").sendKeys("Shripraanna");
		driver.findElementById("createLeadForm_lastName").sendKeys("K S");
		//driver.findElementByClassName("smallSubmit").click();
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dd = new Select(industry);
		dd.selectByVisibleText("Computer Software");
		
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select ee = new Select(marketing);
		List<WebElement> txt = ee.getOptions();
		int size = txt.size();
		ee.getOptions().get(size-1).click();
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("shri84265@gmail.com");
		driver.findElementByClassName("smallSubmit").click();
		driver.close();
	
	}}

//}

