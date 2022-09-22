package _5IncludeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _2Include {
	
	@Test
	public void b() {
		System.out.println("b");
		Reporter.log("b", false);
		
	}
	
	@Test
	public void a() {
		System.out.println("a");
		Reporter.log("a", false);
	}
	
	@Test
	public void d() {
		System.out.println("d");
		Reporter.log("d", false);
	}
	
	
	@Test
	public void z() {
		System.out.println("z");
		Reporter.log("z", false);
	}
	
	@Test
	public void m() {
		System.out.println("m");
		Reporter.log("m", false);
	}

}
