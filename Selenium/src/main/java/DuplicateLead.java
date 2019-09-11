import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("vedasweety45@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebElement names = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]");
		String name=names.getText();
		System.out.println(name);
		Thread.sleep(2000);
		driver.findElementByLinkText("Vedavalli").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String title= driver.getTitle();
		System.out.println("Title of the page :" + title);
		if(title.equalsIgnoreCase("Duplicate Lead"))
		{
			System.out.println("Title of the page is matched");
			
		}else {
			System.out.println("Title is mismatched");
		}
		driver.findElementByXPath("//input[@name='submitButton']").click();
		WebElement duplicate = driver.findElementById("viewLead_firstName_sp");
		String duplicatename=duplicate.getText();
		System.out.println("Duplicate name is " + duplicatename);
		
		if(name==duplicatename)
		{
			System.out.println("entered name is duplicated");
		}else{
			System.out.println("not duplicated");
		}
		
		}
			
	}


