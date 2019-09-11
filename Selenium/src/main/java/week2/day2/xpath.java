package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com");
		Thread.sleep(200);
		WebElement drag= driver.findElementByLinkText("Draggable");
		drag.click();
		driver.switchTo().frame(0);
		WebElement  frame = driver.findElementById("draggable");
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(frame,50 , 10).perform();
		System.out.println("drag and drop sucessfully");
		
			
		
		
	
		
	}

}
