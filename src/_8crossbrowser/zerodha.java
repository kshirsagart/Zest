package _8crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class zerodha {
	
	static WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void  launchUrl(String browser) {
		
		String ChromeDriver="webdriver.chrome.driver";
		String ChromeLocation="C:\\Users\\kshir\\eclipse-workspace\\febbatch\\testNGPractice2\\chromedriver\\chromedriver.exe";
		
		System.setProperty(ChromeDriver, ChromeLocation);
		
		
		String EdgeDriver="webdriver.edge.driver";
		String EdgeLocation="C:\\Users\\kshir\\eclipse-workspace\\febbatch\\testNGPractice2\\egdedriver\\msedgedriver.exe";
		
		System.setProperty(EdgeDriver, EdgeLocation);
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new EdgeDriver();
		}
		
		driver.get("https://kite.zerodha.com/");
	}
	
	@Test
		public void login() throws Exception {
//we create the object of soft assert class
SoftAssert sa=new SoftAssert();
String actual=driver.getCurrentUrl();
sa.assertEquals(actual, "https://kite.zerodha.com");
driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("LGD943");
Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id='password']")).sendKeys("shree@1234");
Thread.sleep(3000);

WebElement click=	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));

click.click();
  		}
		
		@Test (priority=3)
		public void enterPin() throws InterruptedException
		{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[text()='Orders']")).click();
		}
		
		
	

}
