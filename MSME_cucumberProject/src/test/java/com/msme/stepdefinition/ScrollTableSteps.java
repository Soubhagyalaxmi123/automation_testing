package com.msme.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.msme.pom.ScrollTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollTableSteps {
   WebDriver driver;
   ScrollTable st;
	@Given("user login to the application")
	public void user_login_to_the_application() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devuat.fusionfin.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("FMF049872");
		driver.findElement(By.xpath("//input[@type=\"password\" ]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
	}

	@Given("user click on los")
	public void user_click_on_los() throws InterruptedException {
		st=new ScrollTable(driver);
		st.scrollTablebar();
		
		
	}

	@When("user click on manage loan application")
	public void user_click_on_manage_loan_application() {
	}

	@Then("user scroll the table and fetch the applicant name succefully")
	public void user_scroll_the_table_and_fetch_the_applicant_name_succefully() {
	}



	
	
	
	
	
	
	
	
	
}
