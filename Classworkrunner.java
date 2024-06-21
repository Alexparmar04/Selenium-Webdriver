package junitprograms;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Classworkrunner {
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("This is before class method");
	}
	
	@Before
	public void before()
	{
		System.out.println("This is before method");
	}
	
	@Test
	public void test()
	{
		int choice=2;
		
		switch (choice)
		{
			
		case 1: System.out.println("hii");
		break;
		
		case 2 : System.out.println("Hie");
		break;
		
		case 3 : System.out.println("How are you?");
		break;
		
		default : System.out.println("null");
			
		}
		
	}
	
	@Test
	public void test1()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Hello");
		}
	}
	
	@Test
	public void test2()
	{
		int[] arr = new int[6];
		System.out.println("Enter your element");
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		
		for(int i=0; i<6; i++)
		{
			System.out.println("you have enter the right element" + i + ":" + arr[i]);
		}
		
	}
		
		@After
		public void after()
		
		{
			System.out.println("This is after method");
		}
		
		@AfterClass
		public  static void afterclass()
		{
			System.out.println("This is after class method");
		}
		
}
		
		
			
		
	
	

