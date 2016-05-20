package com.samhudgens;

import static com.samhudgens.Calculator.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by samhudgens on 5/20/16.
 */
public class CalculatorSpec {

    double error;
    double expected;
    double actual;

    @Before
    public void initialize() {
        error = 0.00001;
    }

    @Test
    public void addTest() {
        double expected = 5;
        double actual = add(3,2);
        assertEquals(expected, actual, error);
    }

    @Test
    public void subtractTest() {
        expected = 5;
        actual = subtract(7,2);
        assertEquals(expected, actual, error);
    }

    @Test
    public void multiplyTest() {
        expected = 6;
        actual = multiply(2,3);
        assertEquals(expected, actual, error);
    }

    @Test
    public void divideTest() {
        expected = 6;
        actual = divide(12,2);
        assertEquals(expected, actual, error);
    }

    @Test
    public void squareTest() {
        expected = 36;
        actual = square(6);
        assertEquals(expected, actual, error);
    }

    @Test
    public void squareRootTest() {
        expected = 6;
        actual = squareRoot(36);
        assertEquals(expected, actual, error);
    }

    @Test
    public void exponentTest() {
        expected = 256;
        actual = exponent(2,8);
        assertEquals(expected, actual, error);
    }

    @Test
    public void inverseTest() {
        expected = 0.25;
        actual = inverse(4);
        assertEquals(expected, actual, error);
    }

    @Test
    public void invertSignTest() {
        expected = -7;
        actual = invertSign(7);
        assertEquals(expected, actual, error);
    }

    @Test
    public void sinTest() {
        expected = -0.54402111;
        actual = sin(10);
        assertEquals(expected, actual, error);
    }

    @Test
    public void cosTest() {
        expected = 0.84190098;
        actual = cos(.57);
        assertEquals(expected, actual, error);
    }

    @Test
    public void tanTest() {
        expected = 1.26015822;
        actual = tan(.90);
        assertEquals(expected, actual, error);
    }

    @Test
    public void arcsinTest() {
        expected = 0.86331312;
        actual = arcsin(.76);
        assertEquals(expected, actual, error);
    }

    @Test
    public void arccosTest() {
        expected = 0.72273425;
        actual = arccos(.75);
        assertEquals(expected, actual, error);
    }

    @Test
    public void arctanTest() {
        expected = 1.4711276743;
        actual = arctan(10);
        assertEquals(expected, actual, error);
    }

    @Test
    public void logTest() {
        expected = 1;
        actual = log(10);
        assertEquals(expected, actual, error);
    }

    @Test
    public void naturalLogTest() {
        expected = 2.302585092994046;
        actual = naturalLog(10);
        assertEquals(expected, actual, error);
    }

    @Test
    public void inverseLogTest() {
        expected = 100000;
        actual = inverseLog(5);
        assertEquals(expected, actual, error);
    }

}
