package Modules;

import java.sql.Time;
import java.util.Date;

public class Ticket extends BaseModel {
    private  String number;
    private Vehicle vehicle;
    private Date entryTime;
    private ParkingSpots parkingSpot;
    private Gates genratedAt;
    private Operator genratedBy;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSpots getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpots parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Gates getGenratedAt() {
        return genratedAt;
    }

    public void setGenratedAt(Gates genratedAt) {
        this.genratedAt = genratedAt;
    }

    public Operator getGenratedBy() {
        return genratedBy;
    }

    public void setGenratedBy(Operator genratedBy) {
        this.genratedBy = genratedBy;
    }
}
