package main.java.com.conference;

import main.java.com.conference.builder.Conference;
import main.java.com.conference.builder.CreateEvent;
import main.java.com.conference.roles.ChairDecorator;
import main.java.com.conference.roles.Role;
import main.java.com.conference.roles.UserDecorator;
import main.java.com.conference.state.Login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {

    private static boolean run = true;
    private static Conference conference = Conference.getInstance();
    private static User user = new User();

    private static Scanner option = new Scanner(System.in);
    private static InputStreamReader converter = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(converter);
    private static Display display = new Display();



    public static void main(String[] args) throws IOException {

        int opt = 0;

        Login login = new Login();

        login.loggedin();
        login.loggedout();

        while(run){

            display.loginMenu();

            opt = option.nextInt();

            switch(opt) {
                case 1:


                case 2:
            }


        }

        Conference event = new CreateEvent().BuildEvent();






    }




}
