package ie.gmit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd(){
        Calculator Mycal = new Calculator();
        int result = Mycal.add(20,20);
        assertEquals(40,result,0);

    }

    @Test
    @Disabled
    void testSubtract(){
        Calculator MyCal = new Calculator();
        int result = MyCal.Subtract(50,10);
        assertEquals(40,result,0);
    }

    @Test
    @Disabled
    void testDivide(){
        Calculator MyCal = new Calculator();
        int result = MyCal.Divide(50,100);
        assertEquals(2,result,0);
    }

    @Test
    @Disabled
    void testMultiply(){
        Calculator MyCal = new Calculator();
        int result = MyCal.Multiply(5,10);
        assertEquals(50,result,0);
    }


}
