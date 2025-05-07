package com.msme.stepdefinition;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.msme.pom.Applicant;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CreateApplicantSteps {

	WebDriver driver;
	Applicant ap;
Applicant ap1;
	@Given("the user logs into the application")
	public void the_user_logs_into_the_application() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://devuat.fusionfin.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("FMF049872");
//		driver.findElement(By.xpath("//input[@type=\"password\" ]")).sendKeys("Test@123");
//		driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
	}

	@Given("navigates to the Loan Origination System")
	public void navigates_to_the_loan_origination_system() {
		ap = new Applicant(driver);
		ap.clicklos();

	}

	@Then("the user clicks on New Loan Application")
	public void the_user_clicks_on_new_loan_application() {
	}

	@Then("selects the state, cluster, and branch")
	public void selects_the_state_cluster_and_branch() throws InterruptedException {
		ap.branchloc();
	}

	@Then("enters all necessary details")
	public void enters_all_necessary_details() throws AWTException, InterruptedException {
		ap.enterAllDetails();
	}

	@When("the user clicks on the Save button")
	public void the_user_clicks_on_the_save_button() {
		ap.clicksavebtn();

	}

	@Then("the applicant should be created successfully")
	public void the_applicant_should_be_created_successfully() throws InterruptedException {
//        
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=\"Manage Application\"]")).click();
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("window.scrollTo(0, document.body.scrollHeight);");

//		System.out.println("hello word");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement table = driver.findElement(By.xpath("//*[@id=\"employee-tbl_wrapper\"]/div[1]"));
//		js.executeScript("arguments[0].scrollLeft += 200;", table); 
//		System.out.println("hello word2");
//		String actualname = "VINITA RAJAK";
//		String expectedname = driver.findElement(By.xpath("//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr[4]/td[9]"))
//				.getText();
//		System.out.println(expectedname);
//		Assert.assertEquals(actualname, expectedname);
//		System.out.println("Applicant created successfully");
//		
//		System.out.println("Applicant created successfully");
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		 
//		js1.executeScript("arguments[0].scrollLeft -= 200;", table); 
	}
	@Given("user is in the loan application screen")
	public void user_is_in_the_loan_application_screen() {
		
		
	}

	@Given("user enters all necessary fields")
	public void user_enters_all_necessary_fields() throws InterruptedException {
		ap1=new Applicant(driver);
		ap1.createLoanApp();
	}

	@When("clicks on save button")
	public void clicks_on_save_button() throws InterruptedException {
		ap1.savebtn();
	}

	@Then("Loan application should be created successfully")
	public void loan_application_should_be_created_successfully() {

	}

	@Then("user clicks on proceed to dde button")
	public void user_clicks_on_proceed_to_dde_button() throws InterruptedException {
		ap1.proceedtodde();
	}

	@Then("user should moved from QDE to DDE stage")
	public void user_should_moved_from_qde_to_dde_stage() {

	}



	
}





