package week5.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{
	
	@DataProvider(name="Fetchdata")
	public Object [][] setupData(){
		Object[][] data = new Object[2][3];
		data[0][0]="ford";
		data[0][1]="Shripraanna";
		data[0][2]="KS";
		
		data[1][0]="Infosys";
		data[1][1]="Hari";
		data[1][2]="B";
		return data;
		
	}
	@Test(dataProvider="Fetchdata")
    public void createlead(String Cname, String Fname, String Lname) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
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



