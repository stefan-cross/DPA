package main.java.com.conference.state;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 11/07/2014
 * Time: 12:07
 */
public class UserLoggedInState implements UserLoginState {

    private Login login;

    public UserLoggedInState(Login login) {
        this.login = login;
    }

    @Override
    public void loggedin() {
        System.out.println("User logged in.");
    }

    @Override
    public void loggedout() {
        login.setUserLoginState(new UserLoggedOutState(login));
        System.out.println("User logged out.");
    }
}
