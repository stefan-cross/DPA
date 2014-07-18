package main.java.com.conference.template;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 18/07/2014
 * Time: 12:28
 */
public class StandardPriceCalculation extends AttendancePriceAlgorithm {

    @Override
    public int getBasePrice() {
        return 250;
    }

    @Override
    public int getMultipleDiscount() {
        return 0;
    }

    @Override
    public int getPresenterDiscount() {
        return 0;
    }

    @Override
    public int getTransactionFee() {
        return 5;
    }
}
