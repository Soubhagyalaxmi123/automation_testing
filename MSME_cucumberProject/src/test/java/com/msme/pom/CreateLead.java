package com.msme.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	@FindBy(xpath = "//*[@id=\"main-wrappr\"]/div[3]/aside/div/nav/ul/li[2]/a/span[3]/span")
	private WebElement groundReporter;
	@FindBy(xpath = "//span[text()=\"Create Lead\"]")
	private WebElement createlead;

	@FindBy(xpath = "//input[@type=\"text\" and @name=\"firstName\"]")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name=\"middleName\" and @type=\"text\"]")
	private WebElement middlename;
	@FindBy(xpath = "//input[@name=\"lastName\" and @type=\"text\"]")
	private WebElement lastname;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[1]")
	private WebElement gender;
	@FindBy(xpath = "(//*[@id=\"date\"])[1]")
	private WebElement dateofbirth;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"mobileNumber\"]")
	private WebElement mobilenum;

	@FindBy(xpath = "//input[@type=\"text\" and @name=\"businessName\"]")
	private WebElement businessname;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[2]")
	private WebElement businesstypedropdown;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[3]")
	private WebElement microindustry;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[4]")
	private WebElement businessvintage;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"businessAddress1\"]")
	private WebElement businessaddress1;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"businessAddress2\"]")
	private WebElement businessaddress2;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[5]")
	private WebElement leadaddresstype;
	@FindBy(xpath = "//input[@type=\"text\" and @name=\"pincode\"]")
	private WebElement pincode;
	@FindBy(xpath = "//*[@id=\"main-wrappr\"]/div[3]/div/div/div[2]/form/div[2]/div/div/div/div/div[9]/div/ul/li[1]")
	private WebElement pincodedrpdwn;

	@FindBy(xpath = "//input[@type=\"number\" and @name=\"requiredLoanAmount\"]")
	private WebElement loanamount;
	@FindBy(xpath = "/html/body/div/div[2]/div[4]/div/form/div[3]/div/div/div/div/div[2]/div/input")
	private WebElement leadinteractiondate;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[5]")
	private WebElement typesofinteraction;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[6]")
	private WebElement leadsource;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[8]")
	private WebElement selectstate;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[10]")
	private WebElement selectbranch;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[11]")
	private WebElement bdo;
	@FindBy(xpath = "//textarea[@name=\"remark\"]")
	private WebElement remark;
	@FindBy(xpath = "//button[text()=\"Submit\"]")
	private WebElement submit;

	// EDIT LEAD

	@FindBy(xpath = "//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr[1]/td[7]/a[1]")
	private WebElement edit;
	@FindBy(xpath = "//button[text()=\"Update\"]")
	private WebElement update;
	@FindBy(xpath = "//button[text()=\"Proceed to Login\"]")
	private WebElement proceedToLogin;
	@FindBy(xpath = "//button[text()=\"CONFIRM\"]")
	private WebElement confirm;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[4]")
	private WebElement state;
	@FindBy(xpath = "(//*[@id=\"dropdown\"])[6]")
	private WebElement branch;
	@FindBy(xpath = "//button[text()=\"Save\"]")
	private WebElement save;

	WebDriver driver;

	public CreateLead(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickgroundreporter() throws AWTException, InterruptedException {
		groundReporter.click();

	}

	public void clickCreateLeadbtn() {
		createlead.click();

	}

	public void EnterDetails(WebDriver driver) throws InterruptedException, AWTException {
		firstname.sendKeys("Joe");
		middlename.sendKeys("");
		lastname.sendKeys("duo");
		gender.click();
		Select dropdown = new Select(gender);
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		// dateofbirth.click();
		dateofbirth.click();
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

		// Generate a random mobile number
		String randomMobileNumber = generateMobileNumber();

		Thread.sleep(3000);
		mobilenum.sendKeys(randomMobileNumber);

		// mobilenum.sendKeys("8077787654");

		businessname.sendKeys("Fitness Center");
		businesstypedropdown.click();
		Select dropdown1 = new Select(businesstypedropdown);
		dropdown1.selectByIndex(1);
		microindustry.click();
		Select dropdown2 = new Select(microindustry);
		dropdown2.selectByIndex(1);
//			businessvintage.click();
//			Select dropdown3 = new Select(businessvintage);
//			dropdown3.selectByIndex(1);
		businessaddress1.sendKeys("choudwar");
		businessaddress2.sendKeys("cuttack");

//			leadaddresstype.click();
//			Select dropdown4 = new Select(leadaddresstype);
//			dropdown4.selectByIndex(1);
		JavascriptExecutor j4 = (JavascriptExecutor) driver;
		j4.executeScript("window.scrollBy(0,400)");
		pincode.sendKeys("110001");

		Thread.sleep(3000);
		pincodedrpdwn.click();

		Thread.sleep(3000);

		// loandetails.click();

		loanamount.sendKeys("1000000");

		typesofinteraction.click();
		Select dropdown5 = new Select(typesofinteraction);
		dropdown5.selectByIndex(1);
		leadsource.click();
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Select dropdown6 = new Select(leadsource);
		dropdown6.selectByIndex(1);
		Thread.sleep(10000);
		selectstate.click();
		Select j = new Select(selectstate);
		j.selectByIndex(2);
		Thread.sleep(2000);
		JavascriptExecutor j5 = (JavascriptExecutor) driver;
		j5.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		selectbranch.click();
		Select j1 = new Select(selectbranch);
		j1.selectByIndex(2);

		bdo.click();
		Select j3 = new Select(bdo);
		j3.selectByIndex(2);
		
		remark.sendKeys("test");
	}

	public void clicksubmit(WebDriver driver) throws InterruptedException {
		JavascriptExecutor j6 = (JavascriptExecutor) driver;
		j6.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		submit.click();
		// submit.click();

	}
//			
//			//edit lead
//			Thread.sleep(2000);
//			edit.click();
//			JavascriptExecutor je = (JavascriptExecutor) driver;
//			je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//			update.click();
//			JavascriptExecutor jl = (JavascriptExecutor) driver;
//			jl.executeScript("window.scrollTo(document.body.scrollHeight,0)");
//			proceedToLogin.click();
//			confirm.click();

	public static String generateMobileNumber() {
		StringBuilder mobileNumber = new StringBuilder("9");
		for (int i = 0; i < 10; i++) {
			int digit = ThreadLocalRandom.current().nextInt(0, 10);
			mobileNumber.append(digit);
		}
		return mobileNumber.toString();
	}

}
