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

    //This method returns the User Name
    public String getUsername() {
        return username;
    }

    //This method returns the User Token
    public String getUserToken() {
        return userToken;
    }

    //This method returns the User Password
    public String getPassword() {
        return password;
    }

    //This method returns the User Email
    public String getUserEmail() {
        return userEmail;
    }

    //This method returns true if the user is authenticated by UserName and Password
    public boolean authenticateByUserNameAndPassword(String userName, String Password) {
        if (userName.equals("admin") && password.equals("password")) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Login failed!");
            return false;
        }
    }

    //This method returns true if the user is authenticated by UserName and UserToken
    public boolean authenticateByUserNameAndUserToken(String userName, String userToken) {
        if (userName.equals("admin") && userToken.equals("qwertyuuiopcnfhjdj12jbhb56")) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Login failed!");
            return false;
        }
    }

    //This method returns the number of users in the List
    public int getNumberOfUsers(List<userService> usersList) {
        int numberOfUsers = 0;
        //Iterate the List and Get Number of users
        for(int i=0; i<usersList.size(); i++) {
            numberOfUsers = numberOfUsers + 1;
        }
        return numberOfUsers;
    }

    //This method returns true if the user is available in the List
    public boolean isUserAvailable(String userName, List<userService> usersList) {
        boolean isUserFound = false;
        //Iterate the List and Check if user is available
        for(int i=0; i<usersList.size(); i++) {
            if(usersList.get(i).getUsername().equals(userName)) {
                isUserFound = true;
                break;
            }
        }
        return isUserFound;
    }

    public static void main(String[] args) {
        userService user = new userService("admin", "password", "qwertyuuiopcnfhjdj12jbhb56", "abc@gmail.com");
        List<userService> users = new ArrayList<>();
        users.add(user);

        //Verify user authentication by UserName and Password
        if(user.authenticateByUserNameAndPassword("admin", "password")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        //Verify user authentication by UserName and UserToken
        if(user.authenticateByUserNameAndUserToken("admin", "qwertyuuiopcnfhjdj12jbhb56")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        System.out.println("Number of users: " + user.getNumberOfUsers(users));

    }
}
