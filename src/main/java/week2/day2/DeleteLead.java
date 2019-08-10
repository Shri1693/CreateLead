package week2.day2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {
	
		
		public static void main(String[] args) throws InterruptedException {
			CreateLead create=new CreateLead();
			create.create();
	
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
			driver.findElementByXPath("//span[text()='Email']").click();
			driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("shri84265@gmail.com");
			WebElement search = driver.findElementByXPath("//button[text()='Find Leads']");
			search.click();
			Thread.sleep(5000);
			WebElement tbl = driver.findElementByXPath("(//table)[21]");
			List<WebElement> rows = tbl.findElements(By.tagName("tr"));
			//System.out.println(rows.size());
			List<WebElement> column = tbl.findElements(By.tagName("td"));
			String text = column.get(0).getText();
			System.out.println(text);
			driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]/a[1]").click();
			//String title = driver.getTitle();
			//System.out.println("the title is"+ title);
			//if(driver.getTitle().contains("view lead")){
				//System.out.println("I am in view lead page");
			//}
			driver.findElementByLinkText("Delete").click();
			Thread.sleep(3000);
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("//span[text()='Name and ID']").click();
			driver.findElementByXPath("//input[@name='id']").sendKeys(text);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(3000);
		    
			String text2 = driver.findElementByXPath("//div[text()='No records to display']").getText();
			if(text2.equals("No records to display")) {
				System.out.println("Successfully completed");
			}
			driver.close();
		}

	}


