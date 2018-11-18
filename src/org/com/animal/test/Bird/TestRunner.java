package org.com.animal.test.Bird;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main (String[] str){
		Result result = JUnitCore.runClasses(TestBird.class);
		
		for (Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
	      System.out.println(result.wasSuccessful());

	}
}
