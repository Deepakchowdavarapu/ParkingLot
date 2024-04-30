package Modules;

import java.util.List;


public class Parkinglot  extends BaseModel{
   private List<ParkingFloor> parkingFloors;
   private List<Gates> gates;
   private List<VehicleType> vehicleTypes;
   private ParkingFloorStatus status;
   private ParkingLotStatus parkingLotStatus;

   public List<ParkingFloor> getParkingFloors() {
      return parkingFloors;
   }

   public void setParkingFloors(List<ParkingFloor> parkingFloors) {
      this.parkingFloors = parkingFloors;
   }

   public List<Gates> getGates() {
      return gates;
   }

   public void setGates(List<Gates> gates) {
      this.gates = gates;
   }

   public List<VehicleType> getVehicleTypes() {
      return vehicleTypes;
   }

   public void setVehicleTypes(List<VehicleType> vehicleTypes) {
      this.vehicleTypes = vehicleTypes;
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
}
