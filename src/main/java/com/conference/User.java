package main.java.com.conference;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 09/07/2014
 * Time: 20:39
 */
public class User {

    private String firstname;
    private String surname;
    private String email;
    private Date dob;

    // holder of the single instance for the singleton class
    private static User instance = null;

    // Locked down access to constructor
    User() {}

    // Singleton creation instance
    private synchronized static void createUser (){ if(instance == null) instance = new User();}

    // Access method to get our singleton instance
    public static User getInstance(){
        if(instance == null) createUser();
        return instance;
    }

    // Getters and setters...

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
