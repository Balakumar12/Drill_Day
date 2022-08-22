package StepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import pagefactory.LoginPage_PF;
import pages.TestProject;

public class LoginStep {

	WebDriver driver = null;
	LoginPage_PF login_page;

	@Given("browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		String filePath = new File("drivers/chromedriver.exe").getAbsolutePath();
		System.setProperty("webdriver.msedge.driver", filePath);
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("user is on Register")
	public void user_is_on_login_page() {
		
		driver.navigate().to("http://demo.guru99.com//newtours/register.phptest");
		
	}
	
	@When("Enter the First Name")
	public void Enter_the_First_Name() {
		TestProject tp1 = new TestProject(driver);
		tp1.FirstName("Balakumar");
	}
	
	@And("Enter the Last Name")
	public void Enter_the_Last_Name() {
		TestProject tp2 = new TestProject(driver);
		tp2.LastName("I");
	}
	
	@And("Enter the Phone Number 7502672875")
	public void Enter_the_Phone_Number() {
		TestProject tp3 = new TestProject(driver);
		tp3.Phone_num("7502672875");
	}
	
	@And("Enter the Email balakumar59192@gmail.com")
	public void Enter_the_Email() {
		TestProject tp4 = new TestProject(driver);
		tp4.Email("balakumar59192@gmail.com");
	}
	
	@When("Enter the Address Chennai")
	public void Enter_the_Address() {
		TestProject tp5 = new TestProject(driver);
		tp5.Address("Chennai");
	}
	
	@And("Enter the City Guindy")
	public void Enter_the_city() {
		TestProject tp6 = new TestProject(driver);
		tp6.City("Guindy");
	}
	
	@And("Enter the State Tamil Nadu")
	public void Enter_the_State() {
		TestProject tp6 = new TestProject(driver);
		tp6.City("Tamil Nadu");
	}
	
	@And("Enter the post code 630557")
	public void Enter_the_Post() {
		TestProject tp7 = new TestProject(driver);
		tp7.Postal_code("630557");
	}
	
	@And("user Select Country")
	public void user_Select_Country() throws InterruptedException{
		TestProject tp8 = new TestProject(driver);
		tp8.country();
	}
	
	
	@When("Enter the User Name Balakumar")
	public void Enter_the_User_Name() {
		TestProject tp9 = new TestProject(driver);
		tp9.Username("Balakumar");
	}
	
	@And("Enter the Password Sample123")
	public void Enter_the_Pass() {
		TestProject tp10 = new TestProject(driver);
		tp10.Password("Sample123");
	}
	
	@And("Enter the Confrim Password Sample123")
	public void Enter_the_ConPass() {
		TestProject tp11 = new TestProject(driver);
		tp11.Con_Password("Sample123");
	}
	
	@Then("Hit Submit button")
	public void Submit() {
		TestProject tp12 = new TestProject(driver);
		tp12.Submit();
	}
	
	
}
