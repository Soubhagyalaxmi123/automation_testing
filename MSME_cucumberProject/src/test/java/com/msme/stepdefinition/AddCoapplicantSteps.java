package com.msme.stepdefinition;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.msme.pom.AddCoApplicant;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCoapplicantSteps {

	WebDriver driver;
	AddCoApplicant acp;
	
	@Given("User click on los")
	public void user_click_on_los() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devuat.fusionfin.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("FMF049872");
		driver.findElement(By.xpath("//input[@type=\"password\" ]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
		
	}

	@Given("User click on manage application")
	public void user_click_on_manage_application() throws AWTException, InterruptedException {
		acp=new AddCoApplicant(driver);
		acp.clicklos();
		
		
	}

	@Given("user eneters the application id in search bar")
	public void user_eneters_the_application_id_in_search_bar() {
		
		
	}

	@Given("User clicks on applicant and then click on add applicant")
	public void user_clicks_on_applicant_and_then_click_on_add_applicant() {
		
		
	}

	@When("user enters all necessary details and clicks on save button")
	public void user_enters_all_necessary_details_and_clicks_on_save_button() {
		
		
	}

	@Then("co applicant should add succesfully")
	public void co_applicant_should_add_succesfully() {
		
		
	}



	
	
	
}
