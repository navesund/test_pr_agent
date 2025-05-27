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

        UserService userService = new UserService("admin", "@dmin123");
        if(userService.authenticate("admin", "@dmin123")) {
            System.out.println("User authenticated successfully");
            System.out.println("User Name: " + userService.getUserName());
            System.out.println("Email: " + userService.getEmail());
            System.out.println("User Token: " + userService.getUserToken());
        } else {
            System.out.println("Authentication failed");
        }


    }
}

class UserService {
    String userName;
    String password;
    String email;
    String userToken;

    public UserService(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.email = "qwerty@abc.com";
        this.userToken = "12wew233sfdgr657fgfght768fghfgg";
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserToken() {
        return userToken;
    }

    public boolean authenticate(String userName, String password) {
        return this.userName.equals(userName) && this.password.equals(password);
    }

}
