package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestPrime {
         @Test
         
         public void testprime() {
        	 
         
        	assertEquals(false,Prime.Prime(0));
        	assertEquals(true,Prime.Prime(2));
        	assertEquals(true,Prime.Prime(10));
        	assertEquals(false,Prime.Prime(1));
        	

}
}