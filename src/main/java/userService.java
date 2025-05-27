package main.java;

import java.util.List;

public class userService {
    private String username;
    private String password;
    private String token;

    public userService(String username, String password) {
        this.username = username;
        this.password = password;
        this.token = "qw122ssd22435fgfhgh";
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String userName, String Password) {
        if (userName.equals("admin") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean authenticateByToken(String userName, String token) {
        if (userName.equals("admin") && token.equals("qw122ssd22435fgfhgh")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        userService user = new userService("admin", "password");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Authentication: " + user.authenticate("admin", "password"));
    }
}
