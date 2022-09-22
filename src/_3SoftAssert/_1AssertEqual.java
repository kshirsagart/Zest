package _3SoftAssert;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _1AssertEqual {
	
	
	
	@Test
	public void a() {
		SoftAssert sa=new SoftAssert();
		System.out.println("method a start");
		int a=20;
		int b=20;
		sa.assertEquals(a, b);
		System.out.println("method a end");
		sa.assertAll();
	
	}
	
	@Test
	public void b() {
		SoftAssert as=new SoftAssert();
		System.out.println("method b start");
		String j="akash";
		String k="amol";
		as.assertEquals(j, k);
		System.out.println("method b end");
		as.assertAll();
	
	}

}
