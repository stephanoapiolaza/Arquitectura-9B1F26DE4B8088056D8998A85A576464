package cl.bilix.xps.services.common.common_xps;

public class Calc {
	public int multiply(int x, int y) {
	    // the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000"); // Anti-pattern
	    }
	    return x / y; // proposal
	}
}
