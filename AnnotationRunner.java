package programs1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AnnotationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result sh=JUnitCore.runClasses(AnnotationEX.class);
		
		for (Failure fail:sh.getFailures())
			
		{
			System.out.println(fail.toString());
		}
		
		System.out.println(sh.wasSuccessful());

	}

}
