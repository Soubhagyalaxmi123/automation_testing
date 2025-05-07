//package com.msme.stepdefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.msme.pom.Applicant;
//
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoanApplicationSteps {
//	
//	WebDriver driver;
//	Applicant ap;
//	@Given("user is in the loan application screen")
//	public void user_is_in_the_loan_application_screen() {
////		driver = new ChromeDriver();
////		driver.manage().window().maximize();
////		driver.get("https://devuat.fusionfin.com/");
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
////		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("FMF049872");
////		driver.findElement(By.xpath("//input[@type=\"password\" ]")).sendKeys("Test@123");
////		driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
//		
//	}
//
//	@Given("user enters all necessary fields")
//	public void user_enters_all_necessary_fields() {
//		ap=new Applicant(driver);
//		ap.createLoanApp();
//		
//	}
//
//	@When("clicks on save button")
//	public void clicks_on_save_button() throws InterruptedException {
//		ap.savebtn();
//	}
//
//	@Then("Loan application should be created successfully")
//	public void loan_application_should_be_created_successfully() {
//		
//	}
//
//	@Then("user clicks on proceed to dde button")
//	public void user_clicks_on_proceed_to_dde_button() {
//		ap.proceedtodde();
//	}
//
//	@Then("user should moved from QDE to DDE stage")
//	public void user_should_moved_from_qde_to_dde_stage() {
//		
//	}
//
//}
//
//
