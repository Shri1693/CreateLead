package week5.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificMethods{
	@Test
	public void duplicate() throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("shri84265@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		WebElement tbl = driver.findElementByXPath("(//table)[21]");
		List<WebElement> rows = tbl.findElements(By.tagName("tr"));
		//System.out.println(rows.size());
		List<WebElement> column = tbl.findElements(By.tagName("td"));
		String text = column.get(2).getText();
		System.out.println(text);
		driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]/a[1]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("the title is"+ title);
		if(title.contains("Duplicate Lead")) {
			System.out.println("Launched successfully");
			
		}
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		Thread.sleep(5000);
		String text2 = driver.findElementById("viewLead_firstName_sp").getText();
		if(text2.equals(text)) {
			System.out.println("Done");
		}

}}
