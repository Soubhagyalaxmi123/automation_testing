package com.msme.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SanctionCondition {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"main-wrappr\"]/div[3]/aside/div/nav/ul/li[3]/a/span[3]")
	private WebElement loanorigination;
	@FindBy(xpath = "//span[text()=\"Manage Application\"]")
	private WebElement manageapplication;
	@FindBy(xpath = "//button[text()=\"CREDIT_L2\"]")
	private WebElement creditl2btn;
	@FindBy(xpath = "//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr[2]/td[1]")
	private WebElement loanapp;
	@FindBy(xpath = "//a[text()=\"Credit\"]")
	private WebElement creditstage;
	@FindBy(xpath = "//span[text()=\"Loan Sanction\"]")
	private WebElement loansanctionbtn;
	@FindBy(xpath = "//button[text()=\"Add Condition\"]")
	private WebElement sanctioncondition;
	@FindBy(xpath = "(//textarea[@type=\"text\"])[3]")
	private WebElement conditiontxtbox;
	@FindBy(xpath = "(//button[text()=\"Save\"])[2]")
	private WebElement savecondition;
//edit sanction condition
	@FindBy(xpath = "//*[@id=\"sanction-tbl\"]/tbody")
	private WebElement sanctionTable;
	@FindBy(css = "[data-testid='EditIcon']")
	private WebElement sanctionConditionEditBtn;

	@FindBy(xpath = "//textarea[@type=\"text\" and @name=\"sanctionCondition\"]")
	private WebElement editsanctioncondition;
	@FindBy(xpath = "//select[@name=\"sanctionConditionStatus\"]")
	private WebElement selectstatus;
	@FindBy(xpath = "(//button[text()=\"Save\"])[2]")
	private WebElement savebtnEdit;
	
	
	
	//Delete sanction condition
	@FindBy(css="[data-testid=\'DeleteIcon\']")
	private WebElement clickdeletebtn;
	@FindBy(xpath="//button[text()=\"YES\"]")
	private WebElement confirmationBtnYes;
	@FindBy(xpath="")
	private WebElement confirmationBtnNo ;
	
	
	
	public SanctionCondition(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loanoriginationclick() {
		loanorigination.click();
	}

	public void loanmanagement() {
		manageapplication.click();
	}

	public void clickcreditl2() {
		creditl2btn.click();
	}

	public void loanapplicationclick() {
		loanapp.click();
	}

	public void credittab() {
		creditstage.click();
	}

	public void loansanction() throws InterruptedException {
		loansanctionbtn.click();
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });");
		Thread.sleep(2000);
	}

	public void addsanctionconditionclick() throws InterruptedException {
		

		sanctioncondition.click();
	}

	public void savesanctioncondition() {
		conditiontxtbox.sendKeys("test condition");
		savecondition.click();
	}

	@Test
	public void addedSanctioncondionCheck() {

		String text = sanctionTable.getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("test condition"));

	}

	public void clickeditbtn() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });");
		Thread.sleep(2000);
		sanctionConditionEditBtn.click();

	}

	public void editsanctioncondition() {
		editsanctioncondition.sendKeys("test test test......");
	}

	public void selectstatus() {
		Select s = new Select(selectstatus);
		s.selectByIndex(3);
		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"remarks\"]")).sendKeys("test");
	}

	public void clickeditsanctionsavebtn() {
		savebtnEdit.click();
	}
    public void clickDeleteBtn() {
    	clickdeletebtn.click();
    	
    }
    
    public void clickconfirmbtn() {
    	confirmationBtnYes.click();
    	
    	
    }
    public void clickNobtn() {
    	confirmationBtnNo.click();
    }
}
