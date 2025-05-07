package com.msme.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCoApplicant {
	
	@FindBy(xpath = "//*[@id=\"main-wrappr\"]/div[3]/aside/div/nav/ul/li[3]/a/span[3]")
	private WebElement losbtn;
	@FindBy(xpath="//span[text()=\"Manage Application\"]")
	private WebElement manageLoanApp;
	@FindBy(xpath="//input[@name=\"loanApplicationId\"]")
	private WebElement loanappid;
	//407724
	@FindBy(xpath="//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr/td[1]")
	private WebElement enterloan;
	@FindBy(xpath="//a[text()=\"Applicants\"]")
	
	private WebElement clickapplicant;
	@FindBy(xpath="//button[text()=\"Add New Applicant\"]")
	private WebElement addcoapplicant;
	@FindBy(xpath="//*[@id=\"main-wrappr\"]/div[3]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[9]/div[2]")
	private WebElement editicon;
	@FindBy(xpath="//input[@type=\"file\" and @name=\"pancardId\"]")
	private WebElement enterPan;
	@FindBy(xpath="//input[@type=\"text\" and @name=\"panCardNumber\"]")
	private WebElement panCardNumber;
	@FindBy(xpath="//input[@type=\"text\" and @name=\"nameOnPanCard\"]")
	private WebElement nameOnPanCard;
	@FindBy(xpath="//input[@type=\"text\" and @name=\"dateOfBirth\"]")
	private WebElement dateOfBirth;
	@FindBy(xpath="(//*[@id=\"dropdown\"])[1]")
	private WebElement addressproof;
	@FindBy(xpath="//input[@type=\"file\" and @name=\"addressProofFrontId\"]")
	private WebElement addressProofFrontId;
	@FindBy(xpath="//input[@type=\"file\" and @name=\"addressProofBackId\"]")
	private WebElement addressProofBackId;
	@FindBy(xpath="//input[@type=\"text\" and @name=\"nameOnAddressProof\"]")
	private WebElement addressproofName;
	@FindBy(xpath="//input[@type=\"text\" and @name=\"addressProofNumber\"]")
	private WebElement addressProofNumber;
	@FindBy(xpath="//input[@type=\"text\" and @name=\"firstName\"]")
	private WebElement firstName;
	@FindBy(xpath="(//*[@id=\"dropdown\"])[2]")
	private WebElement gender;
	@FindBy(xpath="//input[@type=\"text\" and @name=\"mobileNumber\"]")
	private WebElement mobileNumber;
	@FindBy(xpath="(//*[@id=\"dropdown\"])[3]")
	private WebElement maritalstatus;
	@FindBy(xpath="//input[@type=\"text\" and @name=\"fathersName\"]")
	private WebElement fathersName;
	@FindBy(xpath="//button[text()=\"Save\"]")
	private WebElement savebtn;
	
	
	
	
	
	
	WebDriver driver;

	public AddCoApplicant(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public void clicklos() throws AWTException, InterruptedException {
		losbtn.click();
		manageLoanApp.click();
		loanappid.sendKeys("407724");
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		enterloan.click();
		clickapplicant.click();
		Thread.sleep(2000);
		addcoapplicant.click();
		editicon.click();
		enterPan.sendKeys("C:\\Users\\soubhagyalaxmi\\eclipse-workspace\\MSME_cucumberProject\\src\\test\\resources\\Documents\\251376_PAN_CARD_FRONT_20241022165336948 (1).jpg");
		Thread.sleep(2000);
		panCardNumber.sendKeys("EHDPK3898G");
		//nameOnPanCard.sendKeys("VINITA RAJAK");
		Thread.sleep(1000);
		dateOfBirth.click();
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_0);

		r.keyRelease(KeyEvent.VK_0);
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		r.keyPress(KeyEvent.VK_6);
		r.keyRelease(KeyEvent.VK_6);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_9);
		r.keyRelease(KeyEvent.VK_9);
		r.keyPress(KeyEvent.VK_9);
		r.keyRelease(KeyEvent.VK_9);
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		addressproof.click();
		Thread.sleep(1000);
		Select s=new Select(addressproof);
		s.selectByIndex(1);
		Thread.sleep(2000);
		addressProofFrontId.sendKeys("C:\\Users\\soubhagyalaxmi\\eclipse-workspace\\MSME_cucumberProject\\src\\test\\resources\\Documents\\0c94e3e2-0062740102_1702889030_1702889030_1 1.jpg");
		Thread.sleep(2000);
		addressProofBackId.sendKeys("C:\\Users\\soubhagyalaxmi\\eclipse-workspace\\MSME_cucumberProject\\src\\test\\resources\\Documents\\0ce466c5-aadhar_card_back__customer__0014540302_1692948347_1692948347_2 1.jpg");
		Thread.sleep(2000);
		addressproofName.sendKeys("MOHIT");
		addressProofNumber.sendKeys("747370987641");
		firstName.sendKeys("MOHIT");
		
		Thread.sleep(1000);
		JavascriptExecutor j5 = (JavascriptExecutor) driver;
		j5.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		gender.click();
		Select s2=new Select(gender);
		s2.selectByIndex(2);
		mobileNumber.sendKeys("8774465663");
		maritalstatus.click();
		Select s3=new Select(maritalstatus);
		s3.selectByIndex(1);
		fathersName.sendKeys("test f");
		Thread.sleep(2000);		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		savebtn.click();
	}
	
	
	
	
	
}
