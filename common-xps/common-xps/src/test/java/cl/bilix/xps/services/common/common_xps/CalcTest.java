package cl.bilix.xps.services.common.common_xps;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	 @Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown() {
	    Calc tester = new Calc();
	    tester.multiply(1000, 5);
	    System.out.println("EXPECTED EXCEPTION");
	  }

	  @Test
	  public void testMultiply() {
		  Calc tester = new Calc();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }
}
