package main.java;

public class UserRoleService {
    public static void grantAccess(String userEmail, String userRole) {
        switch(userRole) {
            case "admin":
                grantFullAccess(userEmail);
                break;
            case "Viewer":
                grantReadAccess(userEmail);
                break;
            case "Editor":
                grantEditAccess(userEmail);
        }
    }

    private static void grantFullAccess(String userEmail) {
        //To be added
    }

    private static void grantReadAccess(String userEmail) {
        //To be added
    }

    private static void grantEditAccess(String userEmail) {
        //To be added
    }

}

class assignPermission {
    public void assignRole(String userEmail, String userRole) {
        int isUserAuthenticated = 1;
        UserRoleService userRoleService = new UserRoleService();
        switch(isUserAuthenticated) {
            case 1:
            UserRoleService.grantAccess(userEmail, userRole);
                break;
            default:
                throw new IllegalArgumentException("User is not authenticated");
        }
    }
}
