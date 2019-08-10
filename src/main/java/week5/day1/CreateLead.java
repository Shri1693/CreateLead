package week5.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{
	@Test
public void createlead() {
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
		
	}


	}



