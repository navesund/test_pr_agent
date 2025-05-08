package main.java;

import java.util.ArrayList;
import java.util.List;

public class userService {
    private String username;
    private String userToken;
    private String password;
    private String userEmail;

    public userService(String username, String password, String userToken, String userEmail) {
        this.username = username;
        this.userToken = userToken;
        this.password = password;
        this.userEmail = userEmail;
    }

    public String getUsername() {
        return username;
    }

    public String getUserToken() {
        return userToken;
    }

    public String getPassword() {
        return password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public boolean authenticateByUserNameAndPassword(String userName, String Password) {
        if (userName.equals("admin") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean authenticateByUserNameAndUserToken(String userName, String userToken) {
        if (userName.equals("admin") && userToken.equals("qwertyuuiopcnfhjdj12jbhb56")) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumberOfUsers(List<userService> usersList) {
        int numberOfUsers = 0;
        for(int i=0; i<usersList.size(); i++) {
            numberOfUsers++;
        }
        return numberOfUsers;
    }

    public static void main(String[] args) {
        userService user = new userService("admin", "password", "qwertyuuiopcnfhjdj12jbhb56", "abc@gmail.com");
        List<userService> users = new ArrayList<>();
        users.add(user);
        if(user.authenticateByUserNameAndPassword("admin", "password")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        if(user.authenticateByUserNameAndUserToken("admin", "qwertyuuiopcnfhjdj12jbhb56")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        System.out.println("Number of users: " + user.getNumberOfUsers(users));

    }
}
