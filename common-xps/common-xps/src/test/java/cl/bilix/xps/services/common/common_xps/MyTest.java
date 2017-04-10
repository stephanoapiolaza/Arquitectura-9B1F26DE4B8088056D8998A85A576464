package cl.bilix.xps.services.common.common_xps;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTest {
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(ExceptionTest.class);
		for ( Failure failure: result.getFailures()){
			System.out.println(failure.toString());
		}
	}
}
