package week5.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethods{
	@Test
	public void main() throws InterruptedException {
		
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
		String text = column.get(0).getText();
		//System.out.println(text);
		driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]/a[1]").click();
		String title = driver.getTitle();
		System.out.println("the title is"+ title);
		if(driver.getTitle().contains("view lead")){
			System.out.println("I am in view lead page");
		}
		driver.findElementByLinkText("Edit").click();
		WebElement company = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		company.clear();
		company.sendKeys("tsqa");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		String text2 = driver.findElementById("viewLead_companyName_sp").getText();
		//System.out.println(text2);
		if(text2.contains("tsqa")) {
			System.out.println("The company name is updated successfully");
		}
	
	}

}
