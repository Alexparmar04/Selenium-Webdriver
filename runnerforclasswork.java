package junitprograms;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.internal.runners.statements.Fail;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class runnerforclasswork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Result sh=JUnitCore.runClasses(Classworkrunner.class);
		
		for (Failure fail:sh.getFailures())
			
		{
			System.out.println(fail.toString());
		}
		
		System.out.println(sh.wasSuccessful());

		

	}

}
