/**
 * Created by samhudgens on 5/20/16.
 */
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a/b;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double square(double a) {
        return a * a;
    }

    public double exponent(double a, double b) {
        return Math.pow(a, b);
    }

    public double inverse(double a) {
        return 1/a;
    }

    public double invertSign(double a) {
        return -1 * a;
    }

    public double sin(double a) {
        return Math.sin(a);
    }

    public double cos(double a) {
        return Math.cos(a);
    }

    public double tan(double a) {
        return Math.tan(a);
    }

    public double arcsin(double a) {
        return Math.asin(a);
    }

    public double arccos(double a) {
        return Math.acos(a);
    }

    public double arctan(double a) {
        return Math.atan(a);
    }

    public double log(double a) {
        return Math.log10(a);
    }

    public double inverseLog(double a) {
       return Math.pow(10, Math.log10(a));
    }

    public double naturalLog(double a) {
        return Math.log(a);
    }

    public double inverseNaturalLog(double a) {
        return Math.pow(Math.E, Math.log(a));
    }

    public double factorial(double a) {
        double x, fact = 1;
        for(x=a; x>1; x--) {
            fact *= x;
        }
        return fact;
    }
}
