package com.samhudgens;

/**
 * Created by samhudgens on 5/20/16.
 */
public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a/b;
    }

    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public static double square(double a) {
        return a * a;
    }

    public static double exponent(double a, double b) {
        return Math.pow(a, b);
    }

    public static double inverse(double a) {
        return 1/a;
    }

    public static double invertSign(double a) {
        return -1 * a;
    }

    public static double sin(double a) {
        return Math.sin(a);
    }

    public static double cos(double a) {
        return Math.cos(a);
    }

    public static double tan(double a) {
        return Math.tan(a);
    }

    public static double arcsin(double a) {
        return Math.asin(a);
    }

    public static double arccos(double a) {
        return Math.acos(a);
    }

    public static double arctan(double a) {
        return Math.atan(a);
    }

    public static double log(double a) {
        return Math.log10(a);
    }

    public static double inverseLog(double a) {
       return Math.pow(10, Math.log10(a));
    }

    public static double naturalLog(double a) {
        return Math.log(a);
    }

    public static double inverseNaturalLog(double a) {
        return Math.pow(Math.E, Math.log(a));
    }

    public static double factorial(double a) {
        double x, fact = 1;
        for(x=a; x>1; x--) {
            fact *= x;
        }
        return fact;
    }
}
