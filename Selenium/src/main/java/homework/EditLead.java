package homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main (String [] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementById("ext-gen248").sendKeys("Vedavalli");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	driver.findElementByLinkText("10468").click();
	String title= driver.getTitle();
	System.out.println("Title of the page" + title);
	Thread.sleep(2000);
	driver.findElementByLinkText("Edit").click();
	String update = driver.findElementById("updateLeadForm_companyName").getText();
	String replace=update.replace("Cognizant", "Tcs");
	System.out.println("replaced company name"+replace);
	driver.findElementByXPath("//input[@name='submitButton']").click();
	String changed = driver.findElementById("viewLead_companyName_sp").getText();
	if(changed.equalsIgnoreCase("TCS"))
	{
		System.out.println("the company name has been updated");
		
	}else
	{
		System.out.println("not updated");
	}
	
	}	
}
