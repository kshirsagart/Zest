package _4DependsOnMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _4ZerodhaDepends {
	
	static WebDriver driver;
	
	@Test
	public void launchUrl() {
		String ChromeDriver="webdriver.chrome.driver";
		String ChromeLocation="C:\\Users\\kshir\\eclipse-workspace\\febbatch\\testNGPractice2\\chromedriver\\chromedriver.exe";
		
		System.setProperty(ChromeDriver, ChromeLocation);
		
		driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		String actualurl=driver.getCurrentUrl();
		
		String expectedurl="https://kite.zerodhha.com/";
		
		Assert.assertEquals(actualurl,expectedurl,"hello");
		
	}
		@Test(dependsOnMethods="launchUrl")
		public void login() {
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("LGD943");
			
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("shree@1234");
			
		WebElement click=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));
		
		Assert.assertTrue(click.isDisplayed());
		
		click.click();
			
		}
		
		
		
		
	}
	


