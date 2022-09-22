package _1basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _1Basic {
	
	@Test
	public void basic() {
		
		System.out.println("basic testNG");
		//this statement will give output only in console
		
		
		Reporter.log("Testing 1", true);
		//if condition is true then these statement will give output at console as well as testing report
		
		
		Reporter.log("Testing 2", false);
		
		//if condition is false then these statement will give the output only in testing report
	}

}