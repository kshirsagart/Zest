package _2HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _4AssertFalse {
	
	@Test
	public void a() {
		System.out.println("method a start");
		Assert.assertFalse(true);
		System.out.println("method a end");
	}
	
	@Test
	public void b() {
		System.out.println("method b start");
		String j="akash";
		String k="amol";
		Assert.assertFalse(false);
		System.out.println("method b end");
	}



}
