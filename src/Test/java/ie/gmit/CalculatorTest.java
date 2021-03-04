package ie.gmit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd(){
        Calculator MyCal = new Calculator();
        int result = MyCal.add(20,20);
        assertEquals(40,result,0);
    }

    @Test
    void testSubtract(){
        Calculator MyCal = new Calculator();
        int result = MyCal.Subtract(50,10);
        assertEquals(40,result,0);
    }

    @Test
    void testDivide(){
        Calculator MyCal = new Calculator();
        int result = MyCal.Divide(100,50);
        assertEquals(2,result,0);
    }

    @Test
    void testMultiply(){
        Calculator MyCal = new Calculator();
        int result = MyCal.Multiply(5,10);
        assertEquals(50,result,0);
    }


}
