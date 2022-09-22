package _2HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _3AssertTrue {
	
	@Test
	public void a() {
		System.out.println("method a start");
		Assert.assertTrue(true);
		System.out.println("method a end");
	}
	
	@Test
	public void b() {
		System.out.println("method b start");
		String j="akash";
		String k="amol";
		Assert.assertTrue(false);
		System.out.println("method b end");
	}


}
