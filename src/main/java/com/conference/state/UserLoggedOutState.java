package main.java.com.conference.state;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 11/07/2014
 * Time: 12:07
 */
public class UserLoggedOutState implements UserLoginState {

    private Login login;

    public UserLoggedOutState(Login login) {
        this.login = login;
    }

    @Override
    public void loggedin() {
        login.setUserLoginState(new UserLoggedInState(login));
        System.out.println("User logged in.");
    }

    @Override
    public void loggedout() {
        System.out.println("User logged out.");
    }
}
