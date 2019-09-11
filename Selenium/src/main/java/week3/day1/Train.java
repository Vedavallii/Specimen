package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
		driver.manage().window().maximize();
	
		//table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		//Row Count
		List<String>trainNames=new ArrayList<String>();

		List<WebElement> tRow = table.findElements(By.tagName("tr"));
		int rowsize=tRow.size();
		int rowSize = tRow.size();
		System.out.println("Row size"+" "+rowSize);
		for(int i=0;i<=tRow.size()-1;i++) {
			List<WebElement> tColumns = tRow.get(i).findElements(By.tagName("td"));
			String train = tColumns.get(1).getText();
			trainNames.add(train);
		}
		int listSize = trainNames.size();
		System.out.println("Train List size"+" "+listSize);
		if(rowSize==listSize) {
			System.out.println("Row count and list size matches");
		}else {
			System.out.println("Row count and list size not matches");
		}
		{

		}

	}

}
