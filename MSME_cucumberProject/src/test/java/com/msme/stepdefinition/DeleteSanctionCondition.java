package com.msme.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.msme.pom.SanctionCondition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteSanctionCondition {
	
	WebDriver driver;
	SanctionCondition sc;
	@Given("User is on loan sanction page")
	public void user_is_on_loan_sanction_page() throws InterruptedException {
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://devuat.fusionfin.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("FMF049872");
	    driver.findElement(By.xpath("//input[@type=\"password\" ]")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
	    sc=new SanctionCondition(driver);
	    sc.loanoriginationclick();
	    sc.loanmanagement();
	    sc.clickcreditl2();
	    sc.loanapplicationclick();
	    sc.credittab();
	    sc.loansanction();
	}

	@When("user clicks on delete sanction condition")
	public void user_clicks_on_delete_sanction_condition() {
	    sc.clickDeleteBtn();
	    driver.findElement(By.xpath("//button[text()=\"YES\"]")).click();
	}

	@Then("the sanction condition should deleted successfully")
	public void the_sanction_condition_should_deleted_successfully() {
		    
		    List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"sanction-tbl\"]/tbody"));
		    
		    Assert.assertTrue(elements.isEmpty(), "Sanction condition is still present in the list.");
		}

	
	@Then("the sanction condition should be removed from the list")
	public void the_sanction_condition_should_be_removed_from_the_list() {
	   
	}

	@Then("I should see a message {string}")
	public void i_should_see_a_message(String string) {
	    
	}

	@Given("I cancel the deletion in the confirmation popup")
	public void i_cancel_the_deletion_in_the_confirmation_popup() {
	    
	}

	@Then("the sanction condition should remain in the list")
	public void the_sanction_condition_should_remain_in_the_list() {
	    
	}

	@Then("I should not see any deletion confirmation message")
	public void i_should_not_see_any_deletion_confirmation_message() {
	    
	}
	@Then("I should see a message Sanction condition deleted successfully")
	public void i_should_see_a_message_sanction_condition_deleted_successfully() {
	   
	}




	
	
	
	
}
