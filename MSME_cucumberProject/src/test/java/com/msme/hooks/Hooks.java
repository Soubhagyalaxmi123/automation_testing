//package com.msme.hooks;
//
//
//	
//
//	
//
//	import org.openqa.selenium.WebDriver;
//	import io.cucumber.java.After;
//	import io.cucumber.java.Before;
//	import io.cucumber.java.Scenario;
//	import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.msme.pom.LoginPage;
//	public class Hooks {
//
//	    public static WebDriver driver;
//	    LoginPage lp;
//	    @Before
//	    public void setUp() {
//	       
//	        driver = new ChromeDriver();
//	        driver.manage().window().maximize();
//	        System.out.println("🚀 Browser Launched");
//	        driver=new ChromeDriver();
//		    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		    driver.get("https://devuat.fusionfin.com/");
//		    lp=new LoginPage(driver);
//			lp.enterusername("FMF049872");
//			lp.enterpassword("Test@123");
//			lp.clickloginbtn();
//	    }
//
//	    @After
//	    public void tearDown(Scenario scenario) {
////	        if (scenario.isFailed()) {
////	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
////	            scenario.attach(screenshot, "image/png", "Failed_Screenshot");
////	            System.out.println("📸 Screenshot taken for failed scenario: " + scenario.getName());
////	        }
//	        driver.quit();
//	        System.out.println("❌ Browser Closed");
//	    }
//	}
//
//
