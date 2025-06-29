package com.training.junitdemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationsTest {

    @Test
    public void testComputeSum() {
        MathOperations calcObj = new MathOperations();
        int result = calcObj.computeSum(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testComputeProduct() {
        MathOperations calcObj = new MathOperations();
        int result = calcObj.computeProduct(4, 6);
        assertEquals(24, result);
    }
}
