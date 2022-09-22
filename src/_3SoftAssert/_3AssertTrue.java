package _3SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _3AssertTrue {
	

	
	@Test
	public void a() {
		SoftAssert sa=new SoftAssert();
		System.out.println("method a start");
		
		sa.assertTrue(true);
		System.out.println("method a end");
		sa.assertAll();
	}
	
	@Test
	public void b() {
		SoftAssert as=new SoftAssert();
		System.out.println("method b start");
		as.assertTrue(false);
		System.out.println("method b end");
		as.assertAll();
	}


}
