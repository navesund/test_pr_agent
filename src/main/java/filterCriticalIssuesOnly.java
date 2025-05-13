package main.java;

import java.util.ArrayList;
import java.util.List;

public class filterCriticalIssuesOnly {
    String userrName;
    String password;
    String userToken;
    boolean isUserActive;

    filterCriticalIssuesOnly(String userrName, String password) {
        this.userrName = userrName;
        this.password = password;
    }

    //Returns the username
    public String getUserName() {
        return userrName;
    }

    //Returns the password
    public String getPassword() {
        return password;
    }

    //Returns the user token
    public String getUserToken() {
        return password;
    }

    //Assigns a token to the user
    public void assignToken() {
        this.userToken = "aqelfg12kndkjnfgj565kskjnfjs123n2";
    }

    //Sets the user as active
    public void setUserActive(boolean isUserActive) {
        this.isUserActive = isUserActive;
    }

    //Authenticates the user
    public boolean authenticate(String userrName, String password) {
        if (userrName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            return true;
        } else {
            return false;
        }
    }

    //Returns the total number of users
    public int getTotalUsers(List<filterCriticalIssuesOnly> users) {
        int count = 0;
        for (filterCriticalIssuesOnly user : users) {
            count++;
        }
        return count;   
    }

    //Returns the Percentage of active users
    public double getActiveUsers(List<filterCriticalIssuesOnly> users) {
        int count = 0;
        for (filterCriticalIssuesOnly user : users) {
            if (user.isUserActive == false) {
                count++;
            }
        }
        double percentage = (count * 100) / (users.size());
        return percentage;
    }

    //Main method to test the filterCriticalIssuesOnly class
    public static void main(String[] args){
        filterCriticalIssuesOnly user = new filterCriticalIssuesOnly("admin", "password");
        System.out.println("Username: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());
        user.assignToken();
        user.setUserActive(true);
        System.out.println("User Token: " + user.getUserToken());
        System.out.println("Authentication: " + user.authenticate("admin", "password"));
        List<filterCriticalIssuesOnly> users = new ArrayList<>();
        users.add(user);
        System.out.println("Total Users : " + user.getTotalUsers(users));
        System.out.println("Get the Active Number of Users: " + user.getActiveUsers(users));
    }
}
