package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeLeads extends ProjectSpecMethod{
	@DataProvider(name="fetchData")
	public Object[][] sendData1()
	{
		String[][]data=new String[1][2];
		data[0][0]="Vedavalli";
		data[0][1]="vedasweety45@gmail.com";
	return data;
	
	}
@Test(dependsOnMethods="homework.createLead.runcreateLead",dataProvider="fetchData")
	
	public void runMergeLead() throws InterruptedException
	{
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String>allwin=driver.getWindowHandles();
		List<String> Listwin=new ArrayList<String>(allwin);
		Listwin.get(1);
		String windowref=Listwin.get(1);
		driver.switchTo().window(windowref);
		driver.findElementByXPath("(//input[contains(@class,'x-form-text x-form-field')])[1]").sendKeys("10475");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[1]").click();
		String backtowindow=Listwin.get(0);
		driver.switchTo().window(backtowindow);
		Thread.sleep(3000);
		driver.findElementByLinkText("Merge").click();
		Alert alertbox = driver.switchTo().alert();
		alertbox.accept();
		
	}

}
