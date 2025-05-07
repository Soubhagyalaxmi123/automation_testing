package com.msme.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Applicant {

	@FindBy(xpath = "//*[@id=\"main-wrappr\"]/div[3]/aside/div/nav/ul/li[3]/a/span[3]")
	private WebElement losbtn;
	@FindBy(xpath = "//span[text()=\"New Loan Application\"]")
	private WebElement newloanapplication;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[4]")
	private WebElement state;
    @FindBy(xpath="(//*[@id=\"dropdown\"])[5]")
    private WebElement cluster;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[6]")
	private WebElement branch;
	@FindBy(xpath = "//input[@type=\"file\" and @name=\"pancardId\"]")
	private WebElement pan;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"panCardNumber\"]")
	private WebElement panNum;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"nameOnPanCard\"]")
	private WebElement panName;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[1]")
	private WebElement addressproofdropdown;
	@FindBy(xpath = "//input[@type=\"file\" and @name=\"addressProofFrontId\"]")
	private WebElement addressProofFrontId;
	@FindBy(xpath = "//input[@type=\"file\" and @name=\"addressProofBackId\"]")
	private WebElement addressProofBackId;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"nameOnAddressProof\"]")
	private WebElement nameOnAddressProof;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"addressProofNumber\"]")
	private WebElement addressProofNumber;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"firstName\"]")
	private WebElement firstName;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[2]")
	private WebElement gender;
	@FindBy(xpath = "//input[@name=\"dateOfBirth\" and @type=\"text\"]")
	private WebElement dob;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"mobileNumber\"]")
	private WebElement mobileNumber;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"fathersName\"]")
	private WebElement fathersName;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[3]")
	private WebElement maritalstatus;
	@FindBy(xpath = "//button[text()=\"Save\"]")
	private WebElement savebtn;
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	private WebElement otpbox;
	@FindBy(xpath = "//button[text()=\"Submit\"]")
	private WebElement otpsavebtn;
    @FindBy(xpath="//span[text()=\"Manage Application\"]")
    private WebElement manageapplication;
	// Create Loan application
	@FindBy(xpath = "//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr[4]/td[1]")
	private WebElement openapplication;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[2]")
	private WebElement loanpurpose;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[3]")
	private WebElement productCategory;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[4]")
	private WebElement program;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[5]")
	private WebElement programcode;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[6]")
	private WebElement subloantype;
	@FindBy(xpath = "//input[@type=\"number\" and @name=\"requiredLoanAmount\"]")
	private WebElement requiredLoanAmount;
	@FindBy(xpath = "//input[@type=\"number\" and @name=\"tenure\"]")
	private WebElement tenure;
	@FindBy(xpath = "//input[@type=\"number\" and @name=\"appliedROI\"]")
	private WebElement roi;
	@FindBy(xpath = "//input[@type=\"number\" and @name=\"appliedProcessingFees\"]")
	private WebElement pf;
	@FindBy(xpath = "//button[text()=\"Save\"]")
	private WebElement savebtnloan;
	@FindBy(xpath="//button[text()=\"Allow Login\"]")
	private WebElement allowloginbtn;
	@FindBy(xpath = "//button[text()=\"Proceed to DDE\"]")
	private WebElement proceedtodde;
	@FindBy(xpath="//input[@type=\"text\" and @name=\"stageChangeRemarks\"]")
	private WebElement stageChangeRemarks;
	@FindBy(xpath="//button[text()=\"CONFIRM\"]")
	private WebElement confirmbtn;
	
	
	
	
	WebDriver driver;

	public Applicant(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clicklos() {
		losbtn.click();
		newloanapplication.click();

	}

	public void branchloc() throws InterruptedException {

		Select s1 = new Select(state);
		s1.selectByIndex(2);
	    // Select ss=new Select(cluster);
	    // ss.selectByIndex(2);
		Thread.sleep(1000);
		Select s2 = new Select(branch);
		s2.selectByIndex(2);

	}

	public void enterAllDetails() throws AWTException, InterruptedException {
		pan.sendKeys(
				"C:\\Users\\soubhagyalaxmi\\eclipse-workspace\\MSME_cucumberProject\\src\\test\\resources\\Documents\\251376_PAN_CARD_FRONT_20241022165336948 (1).jpg");
		Thread.sleep(2000);
		panNum.sendKeys("GDSPR1782M");
		//panName.sendKeys("VINITA RAJAK");
		Thread.sleep(1000);
		Select s2 = new Select(addressproofdropdown);
		s2.selectByIndex(1);
		Thread.sleep(1000);
		addressProofFrontId.sendKeys(
				"C:\\Users\\soubhagyalaxmi\\eclipse-workspace\\MSME_cucumberProject\\src\\test\\resources\\Documents\\0c94e3e2-0062740102_1702889030_1702889030_1 1.jpg");
		Thread.sleep(3000);
		addressProofBackId.sendKeys(
				"C:\\Users\\soubhagyalaxmi\\eclipse-workspace\\MSME_cucumberProject\\src\\test\\resources\\Documents\\0ce466c5-aadhar_card_back__customer__0014540302_1692948347_1692948347_2 1.jpg");
		Thread.sleep(2000);
		nameOnAddressProof.sendKeys("VINITA RAJAK");
		addressProofNumber.sendKeys("789876546534");
		 firstName.sendKeys("VINITA");
		Thread.sleep(1000);
		Select s3 = new Select(gender);
		s3.selectByIndex(1);

		dob.click();
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
		mobileNumber.sendKeys("8917443122");
		fathersName.sendKeys("test father");
		Select s4 = new Select(maritalstatus);
		s4.selectByIndex(2);
		savebtn.click();
		otpbox.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Wait for OTP field for up to 60
																				// seconds

		// Wait until the OTP input field is visible
		WebElement otpField = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@type=\"number\" and @name=\"otpCode\"]")));

		// Prompt user to enter OTP manually
		System.out.println("Please enter the OTP received on your phone/email:");

		// Using Scanner to take manual input from the user
		Scanner scanner = new Scanner(System.in);
		String otp = scanner.nextLine();
		scanner.close();

		// Enter OTP into the field
		otpField.sendKeys(otp);
		otpsavebtn.click();
		driver.findElement(By.xpath("//*[@id=\"main-wrappr\"]/div[3]/div/div/div[2]/div[1]/ul/li[2]/a")).click();
	}

	
	
	
	// create loan application
	public void createLoanApp() throws InterruptedException {
//		Thread.sleep(2000);
//		manageapplication.click();
//		openapplication.click();
		loanpurpose.click();
		Select m1 = new Select(loanpurpose);
		m1.selectByIndex(1);
		productCategory.click();
		Select m2 = new Select(productCategory);
		m2.selectByIndex(1);
		program.click();
		Select m3 = new Select(program);
		m3.selectByIndex(1);
		programcode.click();
		Select m4 = new Select(programcode);
		m4.selectByIndex(1);
		subloantype.click();
		Select m5 = new Select(subloantype);
		m5.selectByIndex(1);
		requiredLoanAmount.sendKeys("1000000");
		tenure.sendKeys("120");
		roi.sendKeys("28");
		pf.sendKeys("3");
	}

	public void savebtn() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		savebtnloan.click();
		Thread.sleep(2000);
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	}

	public void proceedtodde() throws InterruptedException {
		Thread.sleep(2000);
		
		proceedtodde.click();
		stageChangeRemarks.sendKeys("test");
		confirmbtn.click();
		driver.navigate().refresh();
		JavascriptExecutor j11 = (JavascriptExecutor) driver;
		j11.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(2000);
		allowloginbtn.click();
		proceedtodde.click();
		stageChangeRemarks.sendKeys("test");
		confirmbtn.click();

	}

	public void clicksavebtn() {

	}

}
