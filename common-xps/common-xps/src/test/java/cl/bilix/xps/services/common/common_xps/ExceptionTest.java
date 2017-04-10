package cl.bilix.xps.services.common.common_xps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// look at http://www.vogella.com/tutorials/JUnit/article.html
public class ExceptionTest{
	@Test
	public void sumaMajorThanZero(){
		Suma suma = new Suma();
		System.out.println(System.getProperty("os.name"));
		// disabled test when is false -- look at Assume.assumeTrue too
		//Assume.assumeFalse(System.getProperty("os.name").contains("Windows")); // Windows 10
		// asserts statements
		assertTrue("10 + 10 must be bigger than 0", suma.suma(10, 0) > 0);
		assertTrue("-5 + 5 must be bigger than 0", suma.suma(-5, 5) > 0);
		//Assert.assertTrue("-5 + 5 must be bigger than 0", suma.suma(-5, 5) > 0); // the main way
		
		fail("message"); // always
		assertFalse("1+1 = 2",1+1 == 2);
		assertEquals("3 * 0 = 0", 0, 3*0);
		assertNull("2+'h' == error", 2+'h');
		//assertNotNull(" suma not null", condition);
		//assertSame([message],expected, current);
		//assertNotSame([message], expected, current);
	}
	
	@Before
	public void before(){
		System.out.println("before each test");
	}
	
	@After
	public void after(){
		System.out.println("after each test");
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("before all tests, database connection for example");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("after all tests, database close for example");
	}
	
	@Ignore
	public void notYet(){
		assertTrue("NOT YET", false);
	}
	
	
}
