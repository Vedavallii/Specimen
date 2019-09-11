import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Start your wonderful journey").click();
		WebElement place = driver.findElementByXPath("//div[text()='Popular Pick-up points']/following::div");
		place.click();
		WebElement next = driver.findElementByClassName("proceed");
		next.click();
		// Get the current date
		Date date = new Date();

		//Get only the date (and not month, year, time etc)
		DateFormat sdf = new SimpleDateFormat("dd");

		// Get today's date
		String today = sdf.format(date);

		// Convert to integer and add 1 to it
		int tomorrow = Integer.parseInt(today)+1;
		driver.findElementByXPath("//div[contains(text(),"+tomorrow+")]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		Thread.sleep(2000);
		driver.findElementByName("book-now").click();
		/*List<WebElement> cars = driver.findElementsByClassName("car-listing");		
		int carsCount = cars.size();
		//System.out.println(carsCount);
		Thread.sleep(2000);
		Map<String,Integer> result=new HashMap<String,Integer>();
		List<Integer> value=new ArrayList<Integer>();

		for (int i = 1; i <carsCount; i++) {
			WebElement brandname = driver.findElementByXPath("//div[@class='details']/following::h3["+i+"]");
			String carName = brandname.getText();	
			WebElement price = driver.findElementByXPath("(//div[@class='price'])["+i+"]");
			//System.out.println(price.getText().replaceAll("\\D", ""));
			String str=price.getText().replaceAll("\\D", "");
			int carPrice=Integer.parseInt(str);
			result.put(carName, carPrice);
			value.add(carPrice);
			
		}
		Collections.sort(value);
		Collections.reverse(value);
		//System.out.println(result);
		
		Integer highestValue = value.get(0);
		System.out.println(highestValue);
		
		Set<Entry<String, Integer>> entrySet = result.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			
			if((int)entry.getValue()==(int)highestValue) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
			
		}
*/	
		driver.close();
		


	}

}
