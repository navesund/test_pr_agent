package main.java;

public class CalculatorService {

    public int add(int a, int b) {
        System.out.println("Adding " + a + " and " + b);
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("Subtracting " + a + " and " + b);
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println("Multiplying " + a + " and " + b);
        return a * b;
    }

    public int divide(int a, int b) {
        System.out.println("Dividing " + a + " and " + b);
        return a / b;
    }

    public int modulo(int a, int b) {
        System.out.println("Modulo of " + a + " and " + b);
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
        } catch (ArithmeticException e) {
        }
        return a % b;
    }

    public int percentage(int a, int b) {
        System.out.println("Calculating" + b + "Percentage of " + a);
        try {
            if(a == 0 || b == 0) {
                throw new IllegalArgumentException("Arguments cannot be zero");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return (a * b)/ 100;
    }
    
}
