package _2HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _1AssertEqual {
	
	
	@Test
	public void a() {
		System.out.println("method a start");
		int a=20;
		int b=20;
		Assert.assertEquals(a, b);
		System.out.println("method a end");
	}
	
	@Test
	public void b() {
		System.out.println("method b start");
		String j="akash";
		String k="amol";
		Assert.assertEquals(j, k);
		System.out.println("method b end");
	}
	

}
