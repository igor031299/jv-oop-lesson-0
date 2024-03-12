package mate.academy.service;

import mate.academy.model.User;

public class AuthenticationService {
    private static String passwordUser;
    private static String emailUser;

    /**
     * Imagine that some user wants to login to your site.
     * You should check if user credentials (login and password) are valid or not.
     * All users are stored in <code>UserService</code> class.
     * @param email - user's email
     * @param password - user's password
     * @return true if user by email exists and passed password is equal to user's password.
     * Return false in any other cases.
     */
    private final User[] userService = UserService.getUsers();

    public boolean login(String email, String password) {
        for (User user : userService) {
            if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                return true;

            }

        }
        return false;
    }
}
