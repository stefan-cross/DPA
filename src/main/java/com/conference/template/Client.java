package main.java.com.conference.template;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 18/07/2014
 * Time: 12:48
 */
public class Client {

    public static void main(String[] args){

        AttendancePriceAlgorithm standard = new StandardPriceCalculation();
        System.out.println("Standard Price: " + standard.calculatePrice());

        AttendancePriceAlgorithm advanced = new AdvancedPriceCalculation();
        System.out.println("Advanced Price: " + advanced.calculatePrice());

    }

}
