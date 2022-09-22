package _1basics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _6TestAnnotation {
	
	@AfterClass
	public void d() {
		
		Reporter.log("d", true);
	}

	@BeforeMethod
	public void m() {
		
		Reporter.log("m", true);
	}
	
	@AfterMethod
	public void g() {
		
		Reporter.log("g", true);
	}
	
	
	@BeforeClass
	public void n() {
		
		Reporter.log("n", true);
	}
	
	@Test
	public void k() {
		
		Reporter.log("k", true);
	}
	
	@BeforeTest
	public void f() {
		
		Reporter.log("f", true);
	}
	
	
	@AfterTest
	public void s() {
		
		Reporter.log("s", true);
	}
	
	
	@BeforeSuite
	public void l() {
		
		Reporter.log("l", true);
	}
	
	@AfterSuite
	public void x() {
		
		Reporter.log("x", true);
	}

}
