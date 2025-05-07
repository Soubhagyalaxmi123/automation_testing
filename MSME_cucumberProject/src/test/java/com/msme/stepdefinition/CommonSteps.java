package com.msme.stepdefinition;



import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.msme.pom.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSteps {
	
	static WebDriver driver;
//	LoginPage lp;
	@Given("User is in the login page")
	public void user_is_in_the_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devuat.fusionfin.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("FMF049872");
		driver.findElement(By.xpath("//input[@type=\"password\" ]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
	}
//	    driver=new ChromeDriver();
//	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    driver.get("https://devuat.fusionfin.com/");
//	}
//
//	@When("user enters vaalid {string} and {string}")
//	public void user_enters_vaalid_and(String username, String password) {
//			 lp=new LoginPage(driver);
//			lp.enterusername(username);
//			lp.enterpassword(password);
//	}
//
//	@And("Clicks on login button")
//	public void clicks_on_login_button() {
//		lp.clickloginbtn();
//		
//	}
//
//	@Then("user is navigate to dashboard page")
//	public void user_is_navigate_to_dashboard_page() {
//	   
//	    String pagetitle=driver.getTitle();
//	    System.out.println(pagetitle);
//	    String actualTitle = "MSME";
//	    Assert.assertEquals(pagetitle,actualTitle);
//	}
//
//	@And("close the browser")
//	public void close_the_browser() {
//	  driver.quit();  
//	}
//


}
