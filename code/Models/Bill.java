package Models;
import java.sql.Time;
import java.util.List;

public class Bill {
    int id;
    int ticketno;
    Time ExitTime;
    Double payment;
    List<payment> payments;
    Status status;
}
