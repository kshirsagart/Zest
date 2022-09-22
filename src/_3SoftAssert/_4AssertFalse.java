package _3SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _4AssertFalse {
	
SoftAssert sa=new SoftAssert();
	
	@Test
	public void a() {
		System.out.println("method a start");
		sa.assertFalse(false);
		System.out.println("method a end");
		sa.assertAll();
	}
	
	@Test
	public void b() {
		System.out.println("method b start");
		String j="akash";
		String k="amol";
		sa.assertFalse(true);
		System.out.println("method b end");
		sa.assertAll();
	}


}
