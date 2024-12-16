package calc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGCalculatorTest {

    Calculator calculator;

    @BeforeMethod
    public void createInstance() {
        calculator = new Calculator();
    }

    @Test
    public void positiveNumsSum() {
        assertEquals(calculator.add(2, 3), 5, "Sum of positive numbers is not correct");
    }

    @Test
    public void negativeNumsSum() { //math module check
        assertEquals(calculator.add(-8, -10), -18, "Sum of negative numbers is not correct");
    }

    @Test
    public void positiveNumsSubtract() {
        assertEquals(calculator.subtract(10, 4), 6, "Subtract of positive numbers is not correct");
    }

    @Test
    public void negativeNumsSubtract() { //math module check
        assertEquals(calculator.subtract(-20, -3), -17, "Subtract of negative numbers is not correct");
    }

    @Test
    public void positiveNumsMultiply() {
        assertEquals(calculator.multiply(7, 3), 21, "Multiply of positive numbers is not correct");
    }

    @Test
    public void negativeMultiplyPositive() { //math module check
        assertEquals(calculator.multiply(-10, 2),
                -20, "Multiply of first negative number and positive second is not correct");
    }

    @Test
    public void positiveMultiplyNegative() { //math module check
        assertEquals(calculator.multiply(5, -9),
                -45, "Multiply of second negative number and positive first is not correct");
    }

    @Test
    public void positiveNumsDivide() {
        assertEquals(calculator.divide(90, 9),
                10, "Divide of positive numbers is not correct");
    }

    @Test
    public void negativeDividePositive() { //math module check
        assertEquals(calculator.divide(-25, 5),
                -5, "Divide of first negative and second positive numbers is not correct");
    }

    @Test
    public void positiveDivideNegative() { //math module check
        assertEquals(calculator.divide(20, -2),
                -10, "Divide of first positive and second negative numbers is not correct");
    }

    @Test
    public void dotResultAfterDivide() { //rounded down check
        assertEquals(calculator.divide(3, 2), 1, 0.00001, "Result after divided must be rounded down");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divideByZero() {
        calculator.divide(1, 0);
    }

}
