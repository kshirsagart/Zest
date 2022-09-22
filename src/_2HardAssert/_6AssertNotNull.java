package _2HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _6AssertNotNull {
	
	@Test
	public void a() {
		System.out.println("method a start");
		String a=null;
		Assert.assertNotNull(a);
		System.out.println("method a end");
	}
	
	@Test
	public void b() {
		System.out.println("method b start");
		String k="amol";
		Assert.assertNotNull(k);
		System.out.println("method b end");
	}



}
