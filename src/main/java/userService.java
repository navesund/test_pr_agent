package main.java;

import java.util.List;

public class userService {
    private String username;
    private String password;

    public userService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate() {
        return "admin".equals(username) && "password".equals(password);
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        userService user = new userService("admin", "password");
        if (user.authenticate()) {
            System.out.println("Authentication is successful!");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
