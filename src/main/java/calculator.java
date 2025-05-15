package main.java;

public class calculator {

    // This is a simple calculator class that performs basic arithmetic operations

    //Performs addition and returns the result
    public int add(int a, int b) {
        return a + b;
    }

    //Performs subtraction and returns the result
    public int subtract(int a, int b) {
        return a - b;
    }

    //Performs multiplication and returns the result
    public int multiply(int a, int b) {
        return a * b;
    }

    //Performs division and returns the result
    public int divide(int a, int b) {
        return a / b;
    }

    //Performs modulus and returns the result
    public int modulus(int a, int b) {
        return a % b;
    }

    //Calculates percentage and returns the result
    public double percentage(int a, int b) {
       double result = (b * 100 )/ a;
       return result;
    }

    //Main method to test the calculator class
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Division: " + calc.divide(5, 0));
        System.out.println("Modulus: " + calc.modulus(5, 3));
        System.out.println("Percentage: " + calc.percentage(0, 3));
    }
}
