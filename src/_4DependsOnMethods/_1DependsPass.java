package _4DependsOnMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _1DependsPass {
	
	//if the method got pass then depenedent method will get execute

	@Test
	public void method1() {
		System.out.println("method 1 start");
		int actual=20;
		int expected=20;
		Assert.assertEquals(actual, expected);
		System.out.println("method 1 end");
	}
	
	
	@Test 
	public void method222() {
		System.out.println("method 2 start");
		String actual1="facebooook";
		String expected1="facebook";
		Assert.assertEquals(actual1,expected1 );
		System.out.println("method 2 end");
	}
	
	@Test (dependsOnMethods="method1")
	public void method3() {
		System.out.println("method 3 start");
		Assert.assertTrue(true);
		System.out.println("method 3 end");
	}

}
