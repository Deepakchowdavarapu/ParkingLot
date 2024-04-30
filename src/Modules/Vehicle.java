package Modules;

public class Vehicle  extends BaseModel{
  public String getVehiclenumber() {
    return Vehiclenumber;
  }

  public void setVehiclenumber(String vehiclenumber) {
    this.Vehiclenumber = vehiclenumber;
  }

  public String getOwnerName() {
    return OwnerName;
  }

  public void setOwnerName(String ownerName) {
    OwnerName = ownerName;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public User getOwner() {
    return Owner;
  }

  public void setOwner(User owner) {
    Owner = owner;
  }

  private String Vehiclenumber;
  private String OwnerName;


  private VehicleType vehicleType;
  private User Owner;



}
