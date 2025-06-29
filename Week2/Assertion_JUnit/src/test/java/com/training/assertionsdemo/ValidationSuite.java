package com.training.assertionsdemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidationSuite {

    @Test
    public void verifyVariousAssertions() {
    
        int expectedValue = 7;
        int actualValue = 4 + 3;
        assertEquals("Sum should be 7", expectedValue, actualValue);

    
        boolean isPositive = 9 > 0;
        assertTrue("Number should be positive", isPositive);

      
        boolean isNegative = 2 < 0;
        assertFalse("Number should not be negative", isNegative);

        Object emptyObject = null;
        assertNull("Object should be null", emptyObject);

        Object initializedObject = new Object();
        assertNotNull("Object should not be null", initializedObject);
    }
}
