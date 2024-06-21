package programs1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;


public class AnnotationEX {
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("This is before class method");
	}
	
	@Before
	public void before()
	{
		System.out.println("This si before method");
	}
	
	@Test
	public void test()
	{
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a vlaue");
		a=sc.nextInt();
		
		Scanner sc1=new Scanner (System.in);
		System.out.println("enter b vlaue");
		b=sc1.nextInt();
		
		c=a+b;
		System.out.println("totall = " + c);
		}
	
	@Ignore
	@Test
	public void test1()
	{
		System.out.println("This is test 1 method");
	}
	
	@After
	public void after()
	{
		System.out.println("This is after method");
	}
	
	@AfterClass
	public static void afterclass()
	{
		System.out.println("This is after class method");
	}
	
	
	

}
