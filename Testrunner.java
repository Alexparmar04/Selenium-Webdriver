package junitprograms;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import programs1.AnnotationEX;

public class Testrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		

		org.junit.runner.Result sh=JUnitCore.runClasses(Test3.class,Test4.class);
		
		for (Failure fail:sh.getFailures())
			
		{
			System.out.println(fail.toString());
		}
		
		System.out.println(sh.wasSuccessful());


	}

}
