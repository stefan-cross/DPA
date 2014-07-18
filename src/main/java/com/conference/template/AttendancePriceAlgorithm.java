package main.java.com.conference.template;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 18/07/2014
 * Time: 12:28
 */
public abstract class AttendancePriceAlgorithm {

    public int calculatePrice(){
        return (int) ((getBasePrice() - getMultipleDiscount() - getPresenterDiscount()) + getTransactionFee());
    }

    abstract int getBasePrice();

    abstract int getMultipleDiscount();

    abstract int getPresenterDiscount();

    abstract int getTransactionFee();
}
