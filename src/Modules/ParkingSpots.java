package Modules;

import java.util.List;

public class ParkingSpots extends BaseModel{
    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public ParkingFloorStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingFloorStatus status) {
        this.status = status;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    private int spotNumber;
    private List<VehicleType> supportedVehicleTypes;
    private ParkingFloorStatus status;
    private ParkingLotStatus parkingLotStatus;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingFloor parkingFloor;

}
