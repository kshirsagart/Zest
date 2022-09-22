package _1basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _4enabledfalse {
	
	@Test(enabled=false)
	public void d() {
		
		Reporter.log("d", true);
	}

	@Test(enabled=true)
	public void m() {
		
		Reporter.log("m", true);
	}
	
	@Test(enabled=true)
	public void g() {
		
		Reporter.log("g", true);
	}
	
	
	@Test(enabled=true)
	public void h() {
		
		Reporter.log("h", true);
	}

}
