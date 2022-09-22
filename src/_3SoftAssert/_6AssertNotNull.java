package _3SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _6AssertNotNull {
	

	
	@Test
	public void a() {
		SoftAssert sa=new SoftAssert();
		System.out.println("method a start");
		String a=null;
		sa.assertNotNull(a);
		System.out.println("method a end");
		sa.assertAll();
		Assert.fail();
	}
	
	@Test
	public void b() {
		SoftAssert as=new SoftAssert();
		System.out.println("method b start");
		String j="akash";
		as.assertNotNull(j);
		System.out.println("method b end");
		as.assertAll();
		Assert.fail();
	
	}


}
