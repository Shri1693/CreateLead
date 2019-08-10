package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week5.day1.ProjectSpecificMethods;


public class MergeLead extends ProjectSpecificMethods{
	@Test
	public void merge() throws InterruptedException {
	
		login();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> win = driver.getWindowHandles();
		List<String> nee = new ArrayList<String>(win);
		driver.switchTo().window(nee.get(1));
		System.out.println(driver.getTitle());
		WebElement vv = driver.findElementByXPath("//input[@name='firstName']");
		vv.sendKeys("shri");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		/*WebElement tbl = driver.findElementByXPath("(//table)[3]");
		List<WebElement> rows = tbl.findElements(By.tagName("tr"));
		//System.out.println(rows.size());
		List<WebElement> column = tbl.findElements(By.tagName("td"));
		String text = column.get(1).getText();
		System.out.println(text);*/
		WebElement no = driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]/a[1]");
		String num = no.getText();
		no.click();
		driver.switchTo().window(nee.get(0));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		System.out.println("Clicked");
		Thread.sleep(2000);
		Set<String> win1 = driver.getWindowHandles();
		System.out.println(win1);
		List<String> nee1 = new ArrayList<String>(win1);
		System.out.println(nee1);
		driver.switchTo().window(nee1.get(1));
		System.out.println("Reached");
		WebElement vv1 = driver.findElementByXPath("//input[@name='firstName']");
		vv1.sendKeys("shri");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]/a[1])[2]").click();
		driver.switchTo().window(nee1.get(0));
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(num);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(text.equals("No records to display")) {
			System.out.println("Successfully completed");
		}
		driver.close();
	
		

}}
