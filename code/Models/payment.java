package Models;
import Models.paymentMode;
import Models.paymentStatus;
import java.sql.Time;

public class payment {
    private int paymentid;
    private paymentMode paymentMode;
    private double amount;
    private Time  paymentTime;
    private long Transactionid;
    private paymentStatus status;
}