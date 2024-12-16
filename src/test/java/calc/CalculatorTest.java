package calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void createInstance() {
        calculator = new Calculator();
    }

    @Test
    public void positiveNumsSum() {
        Assert.assertEquals("Sum of positive numbers is not correct", 5, calculator.add(2, 3));
    }

    @Test
    public void negativeNumsSum() { //math module check
        Assert.assertEquals("Sum of negative numbers is not correct", -18, calculator.add(-8, -10));
    }

    @Test
    public void positiveNumsSubtract() {
        Assert.assertEquals("Subtract of positive numbers is not correct", 6, calculator.subtract(10, 4));
    }

    @Test
    public void negativeNumsSubtract() { //math module check
        Assert.assertEquals("Subtract of negative numbers is not correct", -17, calculator.subtract(-20, -3));
    }

    @Test
    public void positiveNumsMultiply() {
        Assert.assertEquals("Multiply of positive numbers is not correct", 21, calculator.multiply(7, 3));
    }

    @Test
    public void negativeMultiplyPositive() { //math module check
        Assert.assertEquals("Multiply of first negative number and positive second is not correct",
                -20, calculator.multiply(-10, 2));
    }

    @Test
    public void positiveMultiplyNegative() { //math module check
        Assert.assertEquals("Multiply of second negative number and positive first is not correct",
                -45, calculator.multiply(5, -9));
    }

    @Test
    public void positiveNumsDivide() {
        Assert.assertEquals("Divide of positive numbers is not correct",
                10, calculator.divide(90, 9));
    }

    @Test
    public void negativeDividePositive() { //math module check
        Assert.assertEquals("Divide of first negative and second positive numbers is not correct",
                -5, calculator.divide(-25, 5));
    }

    @Test
    public void positiveDivideNegative() { //math module check
        Assert.assertEquals("Divide of first positive and second negative numbers is not correct",
                -10, calculator.divide(20, -2));
    }

    @Test
    public void dotResultAfterDivide() { //rounded down check
        Assert.assertEquals("Result after divided must be rounded down", 1, calculator.divide(3, 2), 0.00001);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero() {
        calculator.divide(1, 0);
    }
}
