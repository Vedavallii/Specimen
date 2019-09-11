import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("vedasweety45@gmail.com");
		driver.findElementById("pass").sendKeys("vedaMohan@1995");
		driver.findElementByXPath("//input[@value='Log In']").click();
		driver.findElementByXPath("//input[@placeholder='Search']").sendKeys("TestLeaf");
		driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()='Places']").click();
		Thread.sleep(3000);
		WebElement isvisible = driver.findElementByLinkText("TestLeaf");
		boolean visbile=isvisible.isDisplayed();
		System.out.println(visbile);
		driver.findElementByXPath("//button[@data-testid='search_like_button_test_id']").click();
		driver.findElementByXPath("//a[text()='TestLeaf']").click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("TestLeaf"))
				{
			System.out.println("Title matched");
				}else
				{
					System.out.println("Title not matched");
				}
				
				}


	}



