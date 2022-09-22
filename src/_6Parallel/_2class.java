package _6Parallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _2class {
	
	@Test
	public void g() {
		System.out.println("g");
		Reporter.log("b", false);
		
	}
	
	@Test
	public void t() {
		System.out.println("t");
		Reporter.log("a", false);
	}
	
	@Test
	public void v() {
		System.out.println("v");
		Reporter.log("d", false);
	}
	
	
	@Test
	public void w() {
		System.out.println("w");
		Reporter.log("z", false);
	}
	
	@Test
	public void q() {
		System.out.println("q");
		Reporter.log("m", false);
	}



}
