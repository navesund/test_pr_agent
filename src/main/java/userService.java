package main.java;

import java.util.List;

public class userService {
    private String username;
    private String password;

    public userService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        userService user = new userService("admin", "password");
        System.out.println("Username: " + user.getUsername());
    }
}
