package com.example.tinhtoansonguyen;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void testDivision() {
        assertEquals(2.5f, calculator.divide(5, 2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
