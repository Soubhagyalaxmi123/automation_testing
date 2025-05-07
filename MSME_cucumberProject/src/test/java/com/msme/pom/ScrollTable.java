package com.msme.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ScrollTable {
@FindBy(xpath="//*[@id=\"employee-tbl_wrapper\"]/div[1]")
private WebElement table;

@FindBy(xpath = "//*[@id=\"main-wrappr\"]/div[3]/aside/div/nav/ul/li[3]/a/span[3]")
private WebElement losbtn;
@FindBy(xpath="//span[text()=\"Manage Application\"]")
private WebElement manageapplication;



WebDriver driver;

public ScrollTable(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

}



@Test
public void scrollTablebar() throws InterruptedException {
	losbtn.click();
	manageapplication.click();
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	System.out.println("hello word");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollLeft += 200;", table); 
	System.out.println("hello word2");
	String actualname = "VINITA RAJAK";
	String expectedname = driver.findElement(By.xpath("//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr[4]/td[9]"))
			.getText();
	System.out.println(expectedname);
	Assert.assertEquals(actualname, expectedname);
	System.out.println("Applicant created successfully");
	Thread.sleep(1000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 
	js1.executeScript("arguments[0].scrollLeft -= 300;", table); 
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"empoloyees-tblwrapper\"]/tbody/tr[9]/td[1]")).click();
	String reject = driver.findElement(By.xpath("//button[text()=\"Reject\"]")).getText();
	System.out.println(reject);
	System.out.println("end execution");
	
}
}
