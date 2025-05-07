package com.msme.stepdefinition;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.msme.pom.CreateLead;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps {
	
	WebDriver driver;
	CreateLead cl;

	@Given("User login to the application")
	public void user_login_to_the_application() {
		 driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://devuat.fusionfin.com/");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("FMF049872");
		    driver.findElement(By.xpath("//input[@type=\"password\" ]")).sendKeys("Test@123");
		    driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
	}

	@Then("User clicks on ground reporter")
	public void user_clicks_on_ground_reporter() throws AWTException, InterruptedException {
	cl=new CreateLead(driver)	;
     cl.clickgroundreporter();
     
	}

	@Then("User clicks on create lead")
	public void user_clicks_on_create_lead() {
		cl.clickCreateLeadbtn();
	}

	@Then("User enters all the neccessary details")
	public void user_enters_all_the_neccessary_details() throws InterruptedException, AWTException {
		cl.EnterDetails(driver);
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		
		cl.clicksubmit(driver);
	}

	@Then("Lead should created succefully")
	public void lead_should_created_succefully() {
		
		
	}

}
