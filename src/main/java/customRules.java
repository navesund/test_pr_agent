package main.java;
import java.util.Date;

public class customRules {
    public static void main(String[] args) {
        System.out.println("Class to test custom rules");

        int a = 5;
        try {
            int b = 0;
            int result = a / b;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
        }

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        String value1 = "Hello";
        String value2 = "HELLO";
        if (value1.equals(value2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        Date startDate = new Date();
        System.out.println("Start date: " + startDate);

        Date endDate = new Date();
        System.out.println("End date: " + endDate);

        String userName = "qwerty";
        String password = "Qwe@12345";
        String userToken= "1q245ettyyhjdxsde5578wedwewt5657";

    }
}
