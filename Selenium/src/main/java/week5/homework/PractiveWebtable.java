package week5.homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiveWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/java/custom-web-elements-selenium-webdriver");
		List<WebElement> Heading = driver.findElements(By.tagName("th"));
		//System.out.println(Heading.size());
		List<WebElement> Columndata = driver.findElements(By.tagName("td"));
		for (int i = 0; i < Heading.size(); i++) {
			System.out.println(Heading.get(i).getText());
			for (int j = 0; j < Columndata.size(); j++) {
				System.out.println(Columndata.get(j).getText());
			}
			}
		


	}

}
