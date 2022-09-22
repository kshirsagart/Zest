package _1basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _3SetPriority {
	
	@Test(priority=3)
	public void d() {
		
		Reporter.log("d", true);
	}

	@Test(priority=0)
	public void m() {
		
		Reporter.log("m", true);
	}
	
	@Test(priority=-1)
	public void g() {
		
		Reporter.log("g", true);
	}
	
	
	@Test(priority=2)
	public void h() {
		
		Reporter.log("h", true);
	}

}
