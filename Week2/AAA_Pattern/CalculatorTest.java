import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator mathTool;

    @Before
    public void initiateCalculator() {
        mathTool = new Calculator(); 
        System.out.println("Setup completed.");
    }

    @After
    public void clearResources() {
        System.out.println("Teardown executed.");
    }

    @Test
    public void testSumMethod() {
     
        int output = mathTool.sum(8, 12);

        assertEquals(20, output);
    }

    @Test
    public void testSubtractMethod() {
    
        int outcome = mathTool.subtract(15, 5);

 
        assertEquals(10, outcome);
    }

    @Test
    public void testMultiplyMethod() {
    
        int product = mathTool.multiply(3, 7);

        assertEquals(21, product);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {

        mathTool.divide(10, 0);
    }

    @Test
    public void testDivideMethod() {
   
        int result = mathTool.divide(20, 5);

        assertEquals(4, result);
    }
}