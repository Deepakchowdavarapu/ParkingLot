package Modules;

import java.util.List;

public class ParkingFloor  extends BaseModel{
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpots> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpots> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }



    private  int floorNumber;
    private List<ParkingSpots> parkingSpots;

    public Modules.ParkingFloorStatus getParkingFloorStatus() {
        return ParkingFloorStatus;
    }

    public void setParkingFloorStatus(Modules.ParkingFloorStatus parkingFloorStatus) {
        ParkingFloorStatus = parkingFloorStatus;
    }

    private ParkingFloorStatus ParkingFloorStatus;
}
