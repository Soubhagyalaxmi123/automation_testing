package com.msme.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.msme.pom.SanctionCondition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditSanctionCondition {
	WebDriver driver;
	SanctionCondition sc;
	
	
	//Edit Sanction Condition
	
	
		@Given("the user is on the loan sanction page")
		public void the_user_is_on_the_loan_sanction_page() throws InterruptedException {
			driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://devuat.fusionfin.com/");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("FMF049872");
		    driver.findElement(By.xpath("//input[@type=\"password\" ]")).sendKeys("Test@123");
		    driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
		    sc=new SanctionCondition(driver);
		    sc.loanoriginationclick();
		    sc.loanmanagement();
		    sc.clickcreditl2();
		    sc.loanapplicationclick();
		    sc.credittab();
		    Thread.sleep(2000);
		    sc.loansanction();
		}

		@When("the user clicks the {string} button")
		public void the_user_clicks_the_button(String string) throws InterruptedException {
		    sc.clickeditbtn();
		}

		@When("updates the sanction condition and changes the status")
		public void updates_the_sanction_condition_and_changes_the_status() {
			sc.editsanctioncondition();
			sc.selectstatus();
		}

		@When("clicks the {string} button")
		public void clicks_the_button(String string) {
			sc.clickeditsanctionsavebtn();
		}

		@Then("the sanction condition should be successfully updated, and its status should be changed to Complete.")
		public void the_sanction_condition_should_be_successfully_updated_and_its_status_should_be_changed_to_complete() {
			WebElement sanctionStatus = driver.findElement(By.xpath("//*[@id=\"sanction-tbl\"]/tbody/tr[5]/td[3]"));
			String actualStatus = sanctionStatus.getText().trim();
			String expectedStatus = "completed";
	        Assert.assertEquals("Sanction condition is updated!", expectedStatus, actualStatus);
		}

    

}
