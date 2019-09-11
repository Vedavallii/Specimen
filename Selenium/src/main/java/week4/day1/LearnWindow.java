package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\Selenium\\drivers\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		driver.findElementByXPath("//button[text()='Try it']").click();
		Set<String> allwin=driver.getWindowHandles();
		List<String> listwin=new ArrayList<String>(allwin);
		driver.switchTo().window(listwin.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(listwin.get(0)).close();
	}

}
