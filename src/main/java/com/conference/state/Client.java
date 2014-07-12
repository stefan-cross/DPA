package main.java.com.conference.state;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 12/07/2014
 * Time: 19:10
 */
public class Client {

    public void main(String[] args) {
        Login login = new Login();

        login.loggedin();
        login.loggedout();

    }
}
