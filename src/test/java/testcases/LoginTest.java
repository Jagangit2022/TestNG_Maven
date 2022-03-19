package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{
	
	//LoginPage obj = new LoginPage();
	
	@Test
	public void LoginSuccessTest() {
		
		LoginPage obj = new LoginPage();
		obj.LoginFunction("xyz@gmail.com","test123@21");
		
	/*	WebElement LoginLink = driver.findElement(By.className("login"));
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		
		UserName.sendKeys("");
		Password.sendKeys("");
		RememberMe.click();
		LoginBtn.click();
	*/	
/*		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid";

		Assert.assertEquals(ActualMsg, ExpMsg);
*/		
	}
	
	@Test
	public void LoginFailureTest() {
		
		//test = report.startTest("LoginFailueTest");
				
	/*	WebElement LoginLink = driver.findElement(By.className("login"));
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		
		UserName.sendKeys("xyz@abc.com");
		Password.sendKeys("Abc@12345");
		RememberMe.click();
		LoginBtn.click();
	*/	
		LoginPage obj = new LoginPage();
		obj.LoginFunction("xyz@abc.com","Abc@12345");
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";

		AssertJUnit.assertEquals(ActualMsg, ExpMsg);
		
		//report.endTest(test);
/*		
		if(ActualMsg.equals(ExpMsg)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
		}
*/		
		
	}
/*	
	@Test
	@Parameters({"Param1","Param2"})
	public void ParametarizedTest(String UserNameVal, String PasswordVal) {
		LoginPage obj = new LoginPage();
		obj.LoginFunction(UserNameVal,PasswordVal);

	}
*/	
	@Test
	public void ExternalDataTest() {
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
		
		LoginPage obj = new LoginPage();
		obj.LoginFunction(UserNameVal,PasswordVal);
		
	}
}
