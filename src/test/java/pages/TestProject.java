package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestProject {
	
	protected WebDriver driver;
	
	private By txt_first = By.name("firstName");
	
	private By txt_second = By.name("lastName");
	
	private By txt_phone = By.name("phone");

	private By txt_email = By.name("userName");
	
	private By txt_address = By.name("address1");
	
	private By txt_city = By.name("city");
	
	private By txt_state = By.name("state");
	
	private By txt_code = By.name("postalCode");
	
	private By txt_country = By.name("country");
	
	private By txt_user = By.id("email");
	
	private By txt_pass = By.name("password");
	
	private By txt_Conpass = By.name("confirmPassword");
	
	private By btn_submit = By.name("submit");
	
	private WebElement driver1;
	
	public TestProject(WebDriver driver) {
	
		this.driver = driver;
	}
	
	public TestProject(WebElement driver1) {
		
		this.driver1 = driver1;
	}
	
	//print FirstName
	public void  FirstName(String FirstName) {
		driver.findElement(txt_first).sendKeys(FirstName);
	}
	
	//print LastName
	public void LastName(String LastName) {
		driver.findElement(txt_second).sendKeys(LastName);
	}
	
	//print Phone_Number
	public void Phone_num(String Phone) {
		driver.findElement(txt_phone).sendKeys(Phone);
	}
	
	//print Email
	public void Email(String Email) {
		driver.findElement(txt_email).sendKeys(Email);
	}
	
	//print Address
	public void Address(String Add) {
		driver.findElement(txt_address).sendKeys(Add);
	}
	
	//print City
	public void City(String city) {
		driver.findElement(txt_city).sendKeys(city);
	}
	
	//print State
	public void State(String state) {
		driver.findElement(txt_state).sendKeys(state);
	}
	
	//print Postal Code
	public void Postal_code(String code) {
		driver.findElement(txt_code).sendKeys(code);
	}
	
	//print Country
	public void country() {
		driver1= driver.findElement(txt_country);
		Select chose = new Select (driver1);
		chose.selectByVisibleText("AUSTRALIA");
	}
	
	//print UserName
	public void Username(String user) {
		driver.findElement(txt_user).sendKeys(user);
	}
	
	//print Password
	public void Password(String pass) {
		driver.findElement(txt_pass).sendKeys(pass);
	}
	
	//print Confrim Password
	public void Con_Password(String C_pass) {
		driver.findElement(txt_Conpass).sendKeys(C_pass);
	}
	
	public void Submit() {
		
		driver.findElement(btn_submit).click();
		}
	
}
