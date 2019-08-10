package Steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps {
	 public ChromeDriver driver;
@Given("Open the chromebrowser")
public void login() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\MavanProject\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();

}
@Given("Maximize the Browser")
public void maximize_the_Browser() {
	driver.manage().window().maximize();
   
}

@Given("Launch the URL")
public void launch_the_URL() {
	driver.get("http://leaftaps.com/opentaps");
    
}

@Given("Enter the Username as DemoSalesManager")
public void enter_the_Username_as_DemoSalesManager() {
	driver.findElementById("username").sendKeys("DemoSalesManager");
    
}

@Given("Enter the password as crmsfa")
public void enter_the_password_as() {
	driver.findElementById("password").sendKeys("crmsfa");
    
}

@Given("Click on login")
public void click_on_login() {
	driver.findElementByClassName("decorativeSubmit").click();
    
}

@Given("Click on CRM\\/SFA option")
public void click_on_CRM_SFA_option() {
	driver.findElementByLinkText("CRM/SFA").click();
   
}

@Given("Click on Create Lead from the options tab")
public void click_on_Create_Lead_from_the_options_tab() {
	driver.findElementByLinkText("Create Lead").click();
}

@Given("Enter the company name as Tridentsqa")
public void enter_the_company_name_as_Tridentsqa() {
	driver.findElementById("createLeadForm_companyName").sendKeys("Tridentsqa");

  
}

@Given("Enter the first name as Shriprasanna")
public void enter_the_first_name_as_Shriprasanna() {
	driver.findElementById("createLeadForm_firstName").sendKeys("Shripraanna");
}

@Given("Enter the last name as KS")
public void enter_the_last_name_as_KS() {
	driver.findElementById("createLeadForm_lastName").sendKeys("K S");
}

@Given("Enter the primary email as shri{int}@gmail.com")
public void enter_the_primary_email_as_shri_gmail_com(Integer int1) {
	driver.findElementById("createLeadForm_primaryEmail").sendKeys("shri84265@gmail.com");
   
}

@When("Click on Create Lead")
public void click_on_Create_Lead() {
	driver.findElementByClassName("smallSubmit").click();
    
}

@Then("Verify the lead is created.")
public void verify_the_lead_is_created() {
   System.out.println("Lead is created successfully");
}
}
