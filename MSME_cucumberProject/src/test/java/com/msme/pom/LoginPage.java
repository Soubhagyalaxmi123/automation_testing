package com.msme.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement uidtxtbx;
	@FindBy(xpath="//input[@type=\"password\" ]")
	private WebElement passwordtxtbx;
	@FindBy(xpath="//button[@type=\"submit\" ]")
	private WebElement loginbtn;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterusername(String username) {
		uidtxtbx.sendKeys(username);
	}
	public void enterpassword(String password) {
		passwordtxtbx.sendKeys(password);
		
	}
	public void clickloginbtn() {
		loginbtn.click();
	}
	public void entervalidcredential(String username, String password) {
		uidtxtbx.sendKeys(username);
		passwordtxtbx.sendKeys(password);
		loginbtn.click();
	}
	
	
	
	
//	public void setLogin(String username,String password) throws InterruptedException, AWTException {
//	
//		uidtxtbx.click();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		
//		//Thread.sleep(3000);
////		uidtxtbx.clear();;
////		Thread.sleep(3000);
//        uidtxtbx.sendKeys(username);	
//		passwordtxtbx.click();
//        r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		
//		Thread.sleep(3000);
////		passwordtxtbx.clear();
//		
//		passwordtxtbx.sendKeys(password);
//		loginbtn.click();
//		
//		
//	}
	

}
