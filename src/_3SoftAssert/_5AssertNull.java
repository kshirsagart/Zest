package _3SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _5AssertNull {
	
SoftAssert sa=new SoftAssert();
	
	@Test
	public void a() {
		System.out.println("method a start");
		String a=null;
		sa.assertNull(a);
		System.out.println("method a end");
		sa.assertAll();
	}
	
	@Test
	public void b() {
		System.out.println("method b start");
		String j="akash";
		sa.assertNull(j);
		System.out.println("method b end");
		sa.assertAll();
	}


}
