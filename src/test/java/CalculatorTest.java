import main.java.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void initCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void verifyAddition() {
        assertEquals(45, calculator.addition(25, 20), String.format("The result should be 45 but is %d", calculator.addition(25,20)));
        assertEquals(15, calculator.addition(10, 5), String.format("The result should be 15 but is %d", calculator.addition(10,5)));
    }


    @Test
    public void verifySubtraction() {
        assertEquals(5, calculator.subtract(25, 20), String.format("The result should be 5 but is %d", calculator.subtract(25,20)));
        assertEquals(30, calculator.subtract(40, 10), String.format("The result should be 30 but is %d", calculator.subtract(40,10)));
    }


    @Test
    public void verifyMultiplication() {
        assertEquals(25, calculator.multiply(5, 5), String.format("The result should be 25 but is %d", calculator.multiply(5,5)));
        assertEquals(40, calculator.multiply(10, 4), String.format("The result should be 40 but is %d", calculator.multiply(10,4)));
    }

    @Test
    public void verifyDivision() {
        assertEquals(5, calculator.division(25, 5), String.format("The result should be 5 but is %d", calculator.division(25,5)));
        assertEquals(4, calculator.division(40, 10), String.format("The result should be 4 but is %d", calculator.division(40,10)));
        assertEquals(1, calculator.division(4, 3), String.format("The result should be 1 but is %d", calculator.division(4,3)));
    }


    @Test
    public void verifyDivisionByZero() {
         assertThrows(IllegalArgumentException.class, () -> {calculator.division(5, 0);});
    }
}


