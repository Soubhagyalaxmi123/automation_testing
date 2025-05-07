package com.msme.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GeoLocationDistance {
	@FindBy(xpath = "//*[@id=\"main-wrappr\"]/div[3]/aside/div/nav/ul/li[3]/a/span[3]")
	private WebElement losbtn;
	@FindBy(xpath="//span[text()=\"Manage Application\"]")
	private WebElement manageLoanApp;
	@FindBy(xpath="//input[@name=\"loanApplicationId\"]")
	private WebElement loanappid;
	
	@FindBy(xpath="//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr/td[1]")
	private WebElement enterloan;
	@FindBy(xpath="//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr/td[1]")
	private WebElement clickapplicant;
	//407724
	
	
@FindBy(xpath="//a[text()=\"Applicants\"]")
private WebElement applicant  ;

@FindBy(xpath="//*[@id=\"main-wrappr\"]/div[3]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div[9]/div[2]")
private WebElement editbtnclick ;	
	
@FindBy(xpath="//span[text()=\"Address\"]")
private WebElement clickaddressbtn;	


//add address

@FindBy(xpath="(//*[@id=\"dropdown\"])[1]")
private WebElement addresstype;

@FindBy(xpath="(//*[@id=\"dropdown\"])[2]")
private WebElement ownershipType ;	
	
@FindBy(xpath="//input[@type=\"text\" and @name=\"address1\"]")
private WebElement address1;	
	
@FindBy(xpath="")
private WebElement ;
	
WebDriver driver;	
	
public 	GeoLocationDistance(WebDriver driver) {
	PageFactory.initElements(driver,this );
}

	public void addAddressUnderMainApplicant() {
		manageLoanApp.click();
		loanappid.sendKeys("407724");
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		enterloan.click();
		clickapplicant.click();
		Thread.sleep(2000);
		applicant.click();
		editbtnclick.click();
		clickaddressbtn.click();
		
		
		//add address of main applicant
		addresstype.click();
		Select s=new Select(addresstype);
		s.selectByIndex(1);
		ownershipType.click();
		Select s1=new Select(ownershipType);
		s1.selectByIndex(2);
		address1.sendKeys("delhi delhi");
		
	}
	
	
	
	
}
