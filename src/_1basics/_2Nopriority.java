package _1basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _2Nopriority {
	
	@Test
	public void d() {
		
		Reporter.log("d", true);
	}

	@Test
	public void m() {
		
		Reporter.log("m", true);
	}
	
	@Test
	public void g() {
		
		Reporter.log("g", true);
	}
	
	
	@Test
	public void h() {
		
		Reporter.log("h", true);
	}
}
