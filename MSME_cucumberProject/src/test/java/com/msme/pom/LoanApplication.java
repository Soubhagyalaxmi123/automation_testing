//package com.msme.pom;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//
//public class LoanApplication {
//	@FindBy(xpath = "//*[@id=\"main-wrappr\"]/div[3]/aside/div/nav/ul/li[3]/a/span[3]")
//	private WebElement losbtn;
//	@FindBy(xpath="//span[text()=\"Manage Application\"]")
//	private WebElement manageapplication;
//
//
//	@FindBy(xpath = "//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr[2]/td[1]")
//	private WebElement openapplication;
//	@FindBy(xpath = "(//*[@id=\"dropdown\"])[2]")
//	private WebElement loanpurpose;
//	@FindBy(xpath = "(//*[@id=\"dropdown\"])[3]")
//	private WebElement productCategory;
//	@FindBy(xpath = "(//*[@id=\"dropdown\"])[4]")
//	private WebElement program;
//	@FindBy(xpath = "(//*[@id=\"dropdown\"])[5]")
//	private WebElement programcode;
//	@FindBy(xpath = "(//*[@id=\"dropdown\"])[6]")
//	private WebElement subloantype;
//	@FindBy(xpath = "//input[@type=\"number\" and @name=\"requiredLoanAmount\"]")
//	private WebElement requiredLoanAmount;
//	@FindBy(xpath = "//input[@type=\"number\" and @name=\"tenure\"]")
//	private WebElement tenure;
//	@FindBy(xpath = "//input[@type=\"number\" and @name=\"appliedROI\"]")
//	private WebElement roi;
//	@FindBy(xpath = "//input[@type=\"number\" and @name=\"appliedProcessingFees\"]")
//	private WebElement pf;
//	@FindBy(xpath = "//button[text()=\"Save\"]")
//	private WebElement savebtnloan;
//	@FindBy(xpath = "//button[text()=\"Allow Login\"]")
//	private WebElement allowloginbtn;
//	@FindBy(xpath = "//button[text()=\"Proceed to DDE\"]")
//	private WebElement proceedtodde;
//	WebDriver driver;
//
//	public LoanApplication(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//
//	}
//
//	public void createLoanApp() {
//		// create loan application
//		losbtn.click();
//		manageapplication.click();
//		openapplication.click();
//		loanpurpose.click();
//		Select m1 = new Select(loanpurpose);
//		m1.selectByIndex(1);
//		productCategory.click();
//		Select m2 = new Select(productCategory);
//		m2.selectByIndex(1);
//		program.click();
//		Select m3 = new Select(program);
//		m3.selectByIndex(1);
//		programcode.click();
//		Select m4 = new Select(programcode);
//		m4.selectByIndex(1);
//		subloantype.click();
//		Select m5 = new Select(subloantype);
//		m5.selectByIndex(1);
//		requiredLoanAmount.sendKeys("1000000");
//		tenure.sendKeys("120");
//		roi.sendKeys("28");
//		pf.sendKeys("3");
//	}
//
//	public void savebtn() throws InterruptedException {
//		JavascriptExecutor jk = (JavascriptExecutor) driver;
//		jk.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		savebtnloan.click();
//
//	}
//
//	public void proceedtodde() {
//		driver.navigate().refresh();
//		driver.navigate().refresh();
//		allowloginbtn.click();
//		proceedtodde.click();
//	}
//
//	
//}
