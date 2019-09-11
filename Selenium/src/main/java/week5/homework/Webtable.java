package week5.homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
	WebElement Table = driver.findElementByXPath("//table[@class='tsc_table_s13']");
	List<WebElement> Allrows = driver.findElements(By.tagName("tr"));
	System.out.println("Size of rows: " + Allrows.size());
	List<WebElement> TableHeader = driver.findElements(By.tagName("th"));
	for (WebElement Each : TableHeader) {
		System.out.println(Each.getText());
			}
	System.out.println();
for (int i = 0; i < Allrows.size(); i++) {
	List<WebElement> Tablecolumns = Allrows.get(i).findElements(By.tagName("td"));
	for (int j = 0; j < Tablecolumns.size(); j++) {
		System.out.println(Tablecolumns.get(j).getText());
		
		
	}
	System.out.println();
} 
}
	
}


