package com.msme.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.msme.pom.SanctionCondition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddSanctionConditionSteps {
	WebDriver driver;
	SanctionCondition sc;
	
	@Given("the user is logged into the application")
	public void the_user_is_logged_into_the_application() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://devuat.fusionfin.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("FMF049872");
	    driver.findElement(By.xpath("//input[@type=\"password\" ]")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
	}

	@When("the user navigates to the Loan Origination module")
	public void the_user_navigates_to_the_loan_origination_module() {
		sc=new SanctionCondition(driver);
	    sc.loanoriginationclick();
	}

	@When("the user clicks on Loan Management")
	public void the_user_clicks_on_loan_management() {
	   sc.loanmanagement();
	}

	@When("the user selects Credit L2")
	public void the_user_selects_credit_l2() {
	    sc.clickcreditl2();
	}

	@When("the user opens the Loan Application")
	public void the_user_opens_the_loan_application() {
	    sc.loanapplicationclick();
	}

	@When("the user navigates to the Credit tab")
	public void the_user_navigates_to_the_credit_tab() {
	    sc.credittab();
	}

	@When("the user clicks on Loan Sanction and scrolls down the page")
	public void the_user_clicks_on_loan_sanction_and_scrolls_down_the_page() throws InterruptedException {
	    sc.loansanction();
	}

	@When("the user clicks on Add Condition")
	public void the_user_clicks_on_add_condition() throws InterruptedException {
	    sc.addsanctionconditionclick();
	}

	@When("the user enters the condition and clicks on the Save button")
	public void the_user_enters_the_condition_and_clicks_on_the_save_button() {
	   sc.savesanctioncondition();
	}

	@Then("the user should be able to add conditions successfully")
	public void the_user_should_be_able_to_add_conditions_successfully() {
		sc.addedSanctioncondionCheck();
	}}

	
	
	
//	//Edit Sanction Condition
//	
//	
//	@Given("the user is on the loan sanction page")
//	public void the_user_is_on_the_loan_sanction_page() {
//	    
//	}
//
//	@When("the user clicks the {string} button")
//	public void the_user_clicks_the_button(String string) {
//	    sc.clickeditbtn();
//	}
//
//	@When("updates the sanction condition and changes the status")
//	public void updates_the_sanction_condition_and_changes_the_status() {
//		sc.editsanctioncondition();
//		sc.selectstatus();
//	}
//
//	@When("clicks the {string} button")
//	public void clicks_the_button(String string) {
//		sc.clickeditsanctionsavebtn();
//	}
//
//	@Then("the sanction condition should be successfully updated, and its status should be changed to Complete.")
//	public void the_sanction_condition_should_be_successfully_updated_and_its_status_should_be_changed_to_complete() {
//		String actualStatus = sanctionStatus.getText().trim();
//        Assert.assertEquals("Sanction condition was not updated!", expectedStatus, actualStatus);
//	}
//
//
//
//
//
//}
