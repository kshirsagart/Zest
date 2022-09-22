package _4DependsOnMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _3TwoClassDepends {
	
	
	@Test
	public void m1() {
		System.out.println("depends");
	}
		
	
	@Test(dependsOnMethods= {"m1","zerodhaassertion._1SoftZerodha.launchUrl"})
	public void depends() {
		Reporter.log("depends", true);
	}

	
	
	
	

}
