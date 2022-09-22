package zerodhaassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _1SoftZerodha {
	
	@Test
	public void launchUrl() throws Exception {
		String ChromeDriver="webdriver.chrome.driver";
		String ChromeLocation="C:\\Users\\kshir\\eclipse-workspace\\febbatch\\testNGPractice2\\chromedriver\\chromedriver.exe";
		System.setProperty(ChromeDriver, ChromeLocation);
		
		WebDriver driver=new ChromeDriver();
		
		SoftAssert sa=new SoftAssert();
		
		driver.get("https://kite.zerodha.com");
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		String Expected="Zerodha";
		
		sa.assertEquals(ActualTitle, Expected,"result");
		
		
		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("LGD943");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("shree@1234");
		Thread.sleep(3000);
		
		WebElement click=driver.findElement(By.xpath("//button[@type='submit']"));
		
		sa.assertTrue(click.isEnabled());
		
		click.click();
		
		sa.assertAll();		
		
		
	}
	

}
