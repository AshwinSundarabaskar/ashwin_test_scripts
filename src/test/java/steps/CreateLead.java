package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public static RemoteWebDriver driver;
	@Given("Invoke Leaftap Application")

	public void startApp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter Username as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@And("Enter Password as (.*)")
	public void enterPassword(String passWord) {
		driver.findElementById("password").sendKeys(passWord);
	}

	@When("Click Login")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify the login is success")
	public void verifyLogin() {
		System.out.println("Login is successful");
	}

	@And("Click Crmsfa")
	public void clickCrmSfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@And("Click Leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}

	@And("Click CreateleadMenu")
	public void clickCreateLeadMenu() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("Enter Companyname as (.*)")
	public void enterCompanyName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	}

	@And("Enter Firstname as (.*)")
	public void enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@And("Enter Lastname as (.*)")
	public void enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

	@And("Click CreateLead")
	public void clickCreateLead() {
		driver.findElementByXPath("//input[@value='Create Lead']").click();
	}

	@Then("Verify the create lead is successful")
	public void verifyCreateLead() {
		System.out.println("Create lead is successful");
	}
	
	@And("Click FindLeadMenu")
	public void clickFindLeadmenu() {
		driver.findElementByLinkText("Find Leads").click();
	}
	
	@And("Enter SearchFirstName")
	public void searchFirstName(String searchFname) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(searchFname);
	}
	
	@When("Click FindLeads")
	public void clickFindLeads() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}
	
	@Then("Verify the find leads is successful")
	public void verifyFindLead() {
		System.out.println("Find lead is successful");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
