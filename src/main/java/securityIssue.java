package main.java;

public class securityIssue {
    public static void main(String[] args) {
        String userName = "user123";
        String password = "password123";
        String userToken = "qwertyuuiopcnfhjdj12jbhb56"; //Dummy token
        login(userName, password, userToken);
    }

    public static void login(String userName, String password, String userToken) {
        if (userName.equals("user123") && password.equals("password123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
    }
}