package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {

	WebDriver driver = BaseClass.driver;
	
	ExtentTest test = BaseClass.test;
	
	//***********************Locators at class level*************************
	@FindBy(className="login")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(name="btn_login")
	WebElement LoginBtn;
	
	@FindBy(className="rememberMe")
	WebElement RememberMe;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//******************************Function*************************
	
	public void LoginFunction(String UserNameVal, String PasswordVal) {
		//WebElement LoginLink = driver.findElement(By.className("login"));
		LoginLink.click();
		test.log(LogStatus.PASS, "Click on login link","Login link clicked successfully");
		//WebElement UserName = driver.findElement(By.name("user_login"));
		//WebElement Password = driver.findElement(By.id("password"));
		//WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		//WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		
		UserName.sendKeys(UserNameVal);
		test.log(LogStatus.PASS, "Enter User Name","Name entered successfully");

		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS, "Enter Password","Password entered successfully");

		RememberMe.click();
		test.log(LogStatus.PASS, "Click on RememberMe","Clicked successfully");

		LoginBtn.click();
		test.log(LogStatus.PASS, "Click on login button","Login button clicked successfully");

	}
	
}
