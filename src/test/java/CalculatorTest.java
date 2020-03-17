import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(4, 8, 9, 3);
    }

    @Test
    public void add(){
         int num1 = 2;
         int num2 = 2;
        assertEquals(4, calculator.add(num1, num2));
    }

    @Test
    public void subtract() {
        int num1 = 12;
        int num2 = 4;
        assertEquals(8, calculator.subtract(num1, num2));
    }

    @Test
    public void multiply() {
        int num1 = 3;
        int num2 = 3;
        assertEquals(9, calculator.multiply(num1, num2));
    }

    @Test
    public void divide() {
        double num1 = 9.0;
        double num2 = 3.0;
        assertEquals(3.0, calculator.divide(num1, num2));
    }


}
