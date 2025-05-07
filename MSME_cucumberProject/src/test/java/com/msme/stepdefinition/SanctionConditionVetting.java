//package com.msme.stepdefinition;
//
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import com.msme.pom.SanctionCondition;
//
//
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class SanctionConditionVetting {
//	WebDriver driver;
//	SanctionCondition sc;
//	
//
//
//	@When("the user navigates to the Loan Origination module")
//	public void the_user_navigates_to_the_loan_origination_module() {
//		sc=new SanctionCondition(driver);
//	    sc.loanoriginationclick();
//	}
//
//	@When("the user clicks on Loan Management")
//	public void the_user_clicks_on_loan_management() {
//	   sc.loanmanagement();
//	}
//
//	@When("the user selects Credit L2")
//	public void the_user_selects_credit_l2() {
//	    sc.clickcreditl2();
//	}
//
//	@When("the user opens the Loan Application")
//	public void the_user_opens_the_loan_application() {
//	    sc.loanapplicationclick();
//	}
//
//	@When("the user navigates to the Credit tab")
//	public void the_user_navigates_to_the_credit_tab() {
//	    sc.credittab();
//	}
//
//	@When("the user clicks on Loan Sanction and scrolls down the page")
//	public void the_user_clicks_on_loan_sanction_and_scrolls_down_the_page() throws InterruptedException {
//	    sc.loansanction();
//	}
//
//	@When("the user clicks on Add Condition")
//	public void the_user_clicks_on_add_condition() throws InterruptedException {
//	    sc.addsanctionconditionclick();
//	}
//
//	@When("the user enters the condition and clicks on the Save button")
//	public void the_user_enters_the_condition_and_clicks_on_the_save_button() {
//	   sc.savesanctioncondition();
//	}
//
//	@Then("the user should be able to add conditions successfully")
//	public void the_user_should_be_able_to_add_conditions_successfully() {
//		sc.addedSanctioncondionCheck();
//	}
//
//	//edit condition
//
//@When("the user clicks the  button")
//public void the_user_clicks_the_button() throws InterruptedException {
//    sc.clickeditbtn();
//}
//
//@When("updates the sanction condition and changes the status")
//public void updates_the_sanction_condition_and_changes_the_status() {
//	sc.editsanctioncondition();
//	sc.selectstatus();
//}
//
//@When("clicks the  button")
//public void clicks_the_button() {
//	sc.clickeditsanctionsavebtn();
//}
//
//@Then("the sanction condition should be successfully updated, and its status should be changed to Complete.")
//public void the_sanction_condition_should_be_successfully_updated_and_its_status_should_be_changed_to_complete() {
//	WebElement sanctionStatus = driver.findElement(By.xpath("//*[@id=\"sanction-tbl\"]/tbody/tr[5]/td[3]"));
//	String actualStatus = sanctionStatus.getText().trim();
//	String expectedStatus = "completed";
//    Assert.assertEquals("Sanction condition is updated!", expectedStatus, actualStatus);
//}
//
////
//
//}
//
//
