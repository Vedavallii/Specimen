package homework;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ReadExcel;

public class createLead extends ProjectSpecMethod{
	
	@DataProvider(name="fetchData")
	public Object[][] sendData() throws IOException
	{
		return ReadExcel.readData();
	}

	@Test(dataProvider="fetchData")
	public void runcreateLead(String comName,String FName, String Lname) throws InterruptedException {
			
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vedavalli");
		driver.findElementById("createLeadForm_lastName").sendKeys("Mohan kumar");
		WebElement element = driver.findElementById("createLeadForm_dataSourceId");
		Select sr=new Select(element);
		sr.selectByIndex(2);
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Salary");
		driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("200000");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select indus=new Select(industry);
		indus.selectByIndex(3);
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select owner=new Select(ownership);
		owner.selectByIndex(4);
		driver.findElementById("createLeadForm_sicCode").sendKeys("123456");
		driver.findElementByXPath("//textarea[@name='description']").sendKeys("I have 3 years experience in selenium");
		driver.findElementByXPath("//textarea[@name='importantNote']").sendKeys("Important");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("2345");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("1234");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		driver.findElementById("createLeadForm_departmentName").sendKeys("computer science");
		WebElement currency = driver.findElementByXPath("//select[@name='currencyUomId']");
		Select curr=new Select(currency);
		curr.selectByIndex(4);
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("30");	
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("###");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Karthick");
		String url=driver.getCurrentUrl();
		driver.findElementByXPath("//input[@name='primaryWebUrl']").sendKeys(url);
		driver.findElementById("createLeadForm_generalToName").sendKeys("Vedavalli)");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("No:75/4,Basuvaian st, Oldwashermenpet");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("No:7/18 Nagappan st,Olwashemenpet");
		driver.findElementByXPath("//input[@name='generalCity']").sendKeys("Chennai");
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select stateoption=new Select(state);
		stateoption.selectByIndex(12);
		WebElement country = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select countrylist=new Select(country);
		countrylist.selectByIndex(30);
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("6000021");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("021");
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mar=new Select(market);
		mar.selectByIndex(2);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9566189110");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("vedasweety45@gmail.com");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		String verify = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(verify);
		if(verify.equals("Vedavalli"))
		{
			System.out.println("The first is matched");
		}else
		{
			System.out.println("First name is not matched");
		}






	}
}
