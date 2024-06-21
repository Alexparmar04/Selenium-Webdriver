package junitprograms;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test3 {
	
	@Test
	
	public void testAssertation()
	{
	
	
	//test data
	
			String str1=new String("Alex");
			String str2=new String("Alex");
			String str3=null;
			
			String str4="qwe";
			String str5="qwe";
			
			int value1=4;
			int value2=5;
			
			String[] ExpectedArray= {"ekta","ritu","nikki"};
			String[] ActualArray= {"ekta","ritu","nikki"};
			
			//check two object are same
			
			assertEquals(str1,str2);
			
			//check two object are same
			
			assertEquals(value1,value2);
			
			//check two object are same
			
		    assertEquals(str4,str3);
		    
		    //check comdition is true or not
		    
		    assertTrue(value1<value2);
		    
	        //check comdition is false
		    
		    assertFalse(value1>value2);
		    
		    //check null of an object
		    
		    assertNull(str3);
		    
		    //check notnull of an object
		    
		    assertNotNull(str3);
		    
		    //check assertArrayEquals
		    
		    assertArrayEquals(ExpectedArray,ActualArray);
	}

}
