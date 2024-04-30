package Modules;
import java.util.Date;
import java.util.List;
import java.sql.Time;
public class Bill extends BaseModel{

    private int TictetNumber;
    private Time exitTime;
    private double amount;
    private Ticket ticket;
    private Gates gate;
    private Operator operator;
    private BillStatus status;
    private List<Payment> payments;



    public int getTictetNumber() {
        return TictetNumber;
    }

    public Time getExitTime() {
        return exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Gates getGate() {
        return gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public BillStatus getStatus() {
        return status;
    }

    public List<Payment> getPayments() {
        return payments;
    }


    public void setTictetNumber(int tictetNumber) {
        TictetNumber = tictetNumber;
    }

    public void setExitTime(Time exitTime) {
        this.exitTime = exitTime;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setGate(Gates gate) {
        this.gate = gate;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }


}
