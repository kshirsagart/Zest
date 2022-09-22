package _2HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _5AssertNull {
	
	@Test
	public void a() {
		System.out.println("method a start");
		String a=null;
		Assert.assertNull(a);
		System.out.println("method a end");
	}
	
	@Test
	public void b() {
		System.out.println("method b start");
		String k="amol";
		Assert.assertNull(k);
		System.out.println("method b end");
	}



}
