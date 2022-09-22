package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameters {
	
	@Test
	@Parameters({"val1" ,"val2"})
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
		
	}
	

}
