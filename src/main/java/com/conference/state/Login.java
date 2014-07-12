package main.java.com.conference.state;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 11/07/2014
 * Time: 12:06
 */
public class Login {

    private UserLoginState userLoginState = new UserLoggedOutState(this);

    public void loggedin (){
        userLoginState.loggedin();
    }

    public void loggedout(){
        userLoginState.loggedout();
    }

    public void setUserLoginState(UserLoginState userLoginState){
        this.userLoginState = userLoginState;
    }
}
