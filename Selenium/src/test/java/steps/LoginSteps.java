package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	@Given("open the chrome browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@And("max the browser")
	public void MaxBrowser() {
		driver.manage().window().maximize();
	}
	@And("set the Timeout")
	public void SetTimeout()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@And("load the url")
	public void LoadURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/login");

	}
	@And("enter the username in the login page")
	public void enterUsername()
	{
		driver.findElementById("username").sendKeys("DemoSalesManager");

	}
	@And("enter the password in the login page")
	public void enterPassword()
	{
		driver.findElementById("password").sendKeys("crmsfa");

	}
	@When("click on the login button in the login page")
	public void click()
	{
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	}
	@Then("verify whether the login is success")
	public void Login()
	{
		System.out.println("Login successfully"
				+ "");
	}
	
	
}
